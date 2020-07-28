package com.company.PageObjects;

import com.opencsv.bean.CsvToBeanBuilder;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class DataHelper {
    public static Object[][] convertInArrayOfTestObjects(List<HashMap<String, String>> sheetData, String excelSheet, String testType) {
        int numOfRows = sheetData.size();
        Object[][] dataObjectList = new Object[numOfRows][1];
        for (int row = 0; row < numOfRows; row++) {
            TestData testData = new TestData();

            for (String key : sheetData.get(row).keySet()) {
                String value = sheetData.get(row).get(key);
                //if (testType.equals("smoke")) {

//                    if ("roi".equals(key.toUpperCase())) {
//                        testData.setCountry(value);
//
//                    } else if ("saturday".equals(key.toUpperCase())) {
//                        testData.setSaturday(value);
//
//                    } else if ("timed".equals(key.toUpperCase())) {
//                        testData.setTimed(value);
//
//                    } else {
//                    }
               // }

            }
            dataObjectList[row][0] = testData;
        }
        return dataObjectList;
    }

    public static List<HashMap<String, String>> readTestDataList(String dataSheetName, String xlsFileName) {
        try {
            String e = "./" + xlsFileName;
            HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(new File(e)));
            HSSFSheet suiteSheet = workbook.getSheet(dataSheetName);
            int rowSuiteAmount = suiteSheet.getPhysicalNumberOfRows();
            HSSFRow suiteRow = null;
            HSSFCell suiteCell = null;
            HSSFCell keyCell = null;
            HSSFRow firstRow = suiteSheet.getRow(0);
            ArrayList resultList = new ArrayList();

            for (int k = 1; k < rowSuiteAmount; ++k) {
                suiteRow = suiteSheet.getRow(k);
                int cellAmount = suiteRow.getPhysicalNumberOfCells();
                HashMap dataMap = new HashMap();


                for (int n = 0; n < cellAmount; ++n) {
                    suiteCell = suiteRow.getCell(n);
                    keyCell = firstRow.getCell(n);
                    if (keyCell != null) {
                        if (suiteCell != null) {
                            suiteCell.setCellType(CellType.forInt(1));
                            String cellString = suiteCell.getStringCellValue().trim();
                            keyCell.setCellType(CellType.forInt(1));
                            String keyString = keyCell.getStringCellValue().trim();
                            dataMap.put(keyString, cellString);
                        }
                    }
                }
                resultList.add(dataMap);
            }

            return resultList;
        } catch (Exception var17) {
            return null;
        }
    }

    public static Object[][] mapDataFromCSVToObject(Class<TestData> testDataClass, String csvFile) throws FileNotFoundException {
        String renamedCSVFile = csvFile;
        if (csvFile.endsWith(".csv")) {
            renamedCSVFile = csvFile.replace(".csv", "");
        }
        Reader file = new FileReader("./Data/" + renamedCSVFile + ".csv");
        List<TestData> testData = new CsvToBeanBuilder(file)
                .withType(TestData.class).build().parse();

        Object[][] testNgData = new Object[testData.size()][1];
        for (int i = 0; i < testData.size(); i++) {
            testNgData[i][0] = testData.get(i);
        }
        return testNgData;
    }
}
