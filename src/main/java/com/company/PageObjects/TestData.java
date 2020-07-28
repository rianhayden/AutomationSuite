package com.company.PageObjects;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvBindByName;
import lombok.Data;
import lombok.ToString;
import org.testng.annotations.DataProvider;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestData {


    public TestData() {
    }

    public String getOrgname() {
        return this.orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    public String getPostcode() { return this.postcode; }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddLine1() {
        return addLine1;
    }

    public void setAddLine1(String addLine1) {
        this.addLine1 = addLine1;
    }

    public String getAddLine2() {
        return addLine2;
    }

    public void setAddLine2(String addLine2) {
        this.addLine2 = addLine2;
    }

    public String getAddLine3() {
        return addLine3;
    }

    public void setAddLine3(String addLine3) {
        this.addLine3 = addLine3;
    }

    public String getAddLine4() {
        return addLine4;
    }

    public void setAddLine4(String addLine4) {
        this.addLine4 = addLine4;
    }

    public String getContactName() { return contactName; }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getDelOptions() {
        return delOptions;
    }

    public void setDelOptions(String delOptions) {
        this.delOptions = delOptions;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() { return pass; }

    public void setPass(String pass) { this.pass = pass; }

    public String getCustoms() { return customs; }

    public void setCustoms(String customs) {
        this.customs = customs;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    @CsvBindByName
    private String login;
    @CsvBindByName
    private String pass;
    @CsvBindByName
    private String orgname;
    @CsvBindByName
    private String country;
    @CsvBindByName
    private String postcode;
    @CsvBindByName
    private String addLine1;
    @CsvBindByName
    private String addLine2;
    @CsvBindByName
    private String addLine3;
    @CsvBindByName
    private String addLine4;
    @CsvBindByName
    private String contactName;
    @CsvBindByName
    private String contactNum;
    @CsvBindByName
    private String contactEmail;
    @CsvBindByName
    private String delOptions;
    @CsvBindByName
    private String quantity;
    @CsvBindByName
    private String weight;
    @CsvBindByName
    private String customs;
    @CsvBindByName
    private String connection;


    @DataProvider(name = "regCSVData")
    public static Object[][] getCSVData() throws IOException {
        CSVReader csvReader = new CSVReader(new FileReader(
                TestData.class.getResource("/RegressionRun.csv").getPath()), ',','\'', 1);
        List<String[]>dataList = csvReader.readAll();
        Object[][] data = new Object[dataList.size()][1];
        List<TestData> regList = new ArrayList<TestData>();
        for (String[] strArray:dataList) {
            TestData testData = new TestData();
            testData.setLogin(strArray[0].trim());
            testData.setPass(strArray[1].trim());
            testData.setOrgname(strArray[2].trim());
            testData.setCountry(strArray[3].trim());
            testData.setPostcode(strArray[4].trim());
            testData.setAddLine1(strArray[5].trim());
            testData.setAddLine2(strArray[6].trim());
            testData.setAddLine3(strArray[7].trim());
            testData.setAddLine4(strArray[8].trim());
            testData.setContactName(strArray[9].trim());
            testData.setContactNum(strArray[10].trim());
            testData.setContactEmail(strArray[11].trim());
            testData.setDelOptions(strArray[12].trim());
            testData.setQuantity(strArray[13].trim());
            testData.setWeight(strArray[14].trim());
            testData.setCustoms(strArray[15].trim());

            regList.add(testData);
        }
        for(int i=0; i<data.length; i++) {
            for(int j=0; j<data[i].length; j++) {
                data[i][j]=regList.get(i);
            }
        }
        csvReader.close();
        return data;
    }

    @DataProvider(name = "regCSVDataBrexitOnRoi")
    public static Object[][] getCSVDataBrexitOnRoi() throws IOException {
        CSVReader csvReader = new CSVReader(new FileReader(
                TestData.class.getResource("/RegressionRunBrexitOnRoi.csv").getPath()), ',','\'', 1);
        List<String[]>dataList = csvReader.readAll();
        Object[][] data = new Object[dataList.size()][1];
        List<TestData> regList = new ArrayList<TestData>();
        for (String[] strArray:dataList) {
            TestData testData = new TestData();
            testData.setLogin(strArray[0].trim());
            testData.setPass(strArray[1].trim());
            testData.setOrgname(strArray[2].trim());
            testData.setCountry(strArray[3].trim());
            testData.setPostcode(strArray[4].trim());
            testData.setAddLine1(strArray[5].trim());
            testData.setAddLine2(strArray[6].trim());
            testData.setAddLine3(strArray[7].trim());
            testData.setAddLine4(strArray[8].trim());
            testData.setContactName(strArray[9].trim());
            testData.setContactNum(strArray[10].trim());
            testData.setContactEmail(strArray[11].trim());
            testData.setDelOptions(strArray[12].trim());
            testData.setQuantity(strArray[13].trim());
            testData.setWeight(strArray[14].trim());
            testData.setCustoms(strArray[15].trim());

            regList.add(testData);
        }
        for(int i=0; i<data.length; i++) {
            for(int j=0; j<data[i].length; j++) {
                data[i][j]=regList.get(i);
            }
        }
        csvReader.close();
        return data;
    }

    @DataProvider(name = "regCSVDataBrexitOnNi")
    public static Object[][] getCSVDataBrexitOnNi() throws IOException {
        CSVReader csvReader = new CSVReader(new FileReader(
                TestData.class.getResource("/RegressionRunBrexitOnNi.csv").getPath()), ',','\'', 1);
        List<String[]>dataList = csvReader.readAll();
        Object[][] data = new Object[dataList.size()][1];
        List<TestData> regList = new ArrayList<TestData>();
        for (String[] strArray:dataList) {
            TestData testData = new TestData();
            testData.setLogin(strArray[0].trim());
            testData.setPass(strArray[1].trim());
            testData.setOrgname(strArray[2].trim());
            testData.setCountry(strArray[3].trim());
            testData.setPostcode(strArray[4].trim());
            testData.setAddLine1(strArray[5].trim());
            testData.setAddLine2(strArray[6].trim());
            testData.setAddLine3(strArray[7].trim());
            testData.setAddLine4(strArray[8].trim());
            testData.setContactName(strArray[9].trim());
            testData.setContactNum(strArray[10].trim());
            testData.setContactEmail(strArray[11].trim());
            testData.setDelOptions(strArray[12].trim());
            testData.setQuantity(strArray[13].trim());
            testData.setWeight(strArray[14].trim());
            testData.setCustoms(strArray[15].trim());

            regList.add(testData);
        }
        for(int i=0; i<data.length; i++) {
            for(int j=0; j<data[i].length; j++) {
                data[i][j]=regList.get(i);
            }
        }
        csvReader.close();
        return data;
    }

    @DataProvider(name = "regCSVDataPreprod")
    public static Object[][] getCSVDataPreprod() throws IOException {
        CSVReader csvReader = new CSVReader(new FileReader(
                TestData.class.getResource("/RegressionRunPreprod.csv").getPath()), ',','\'', 1);
        List<String[]>dataList = csvReader.readAll();
        Object[][] data = new Object[dataList.size()][1];
        List<TestData> regList = new ArrayList<TestData>();
        for (String[] strArray:dataList) {
            TestData testData = new TestData();
            testData.setLogin(strArray[0].trim());
            testData.setPass(strArray[1].trim());
            testData.setOrgname(strArray[2].trim());
            testData.setCountry(strArray[3].trim());
            testData.setPostcode(strArray[4].trim());
            testData.setAddLine1(strArray[5].trim());
            testData.setAddLine2(strArray[6].trim());
            testData.setAddLine3(strArray[7].trim());
            testData.setAddLine4(strArray[8].trim());
            testData.setContactName(strArray[9].trim());
            testData.setContactNum(strArray[10].trim());
            testData.setContactEmail(strArray[11].trim());
            testData.setDelOptions(strArray[12].trim());
            testData.setQuantity(strArray[13].trim());
            testData.setWeight(strArray[14].trim());
            testData.setCustoms(strArray[15].trim());

            regList.add(testData);
        }
        for(int i=0; i<data.length; i++) {
            for(int j=0; j<data[i].length; j++) {
                data[i][j]=regList.get(i);
            }
        }
        csvReader.close();
        return data;
    }

    @DataProvider(name = "regCSVDataOffline")
    public static Object[][] getCSVDataOffline() throws IOException {
        CSVReader csvReader = new CSVReader(new FileReader(
                TestData.class.getResource("/RegressionRunOffline.csv").getPath()), ',','\'', 1);
        List<String[]>dataList = csvReader.readAll();
        Object[][] data = new Object[dataList.size()][1];
        List<TestData> regList = new ArrayList<TestData>();
        for (String[] strArray:dataList) {
            TestData testData = new TestData();
            testData.setLogin(strArray[0].trim());
            testData.setPass(strArray[1].trim());
            testData.setOrgname(strArray[2].trim());
            testData.setCountry(strArray[3].trim());
            testData.setPostcode(strArray[4].trim());
            testData.setAddLine1(strArray[5].trim());
            testData.setAddLine2(strArray[6].trim());
            testData.setAddLine3(strArray[7].trim());
            testData.setAddLine4(strArray[8].trim());
            testData.setContactName(strArray[9].trim());
            testData.setContactNum(strArray[10].trim());
            testData.setContactEmail(strArray[11].trim());
            testData.setDelOptions(strArray[12].trim());
            testData.setQuantity(strArray[13].trim());
            testData.setWeight(strArray[14].trim());
            testData.setCustoms(strArray[15].trim());
            testData.setConnection(strArray[16].trim());
            regList.add(testData);
        }
        for(int i=0; i<data.length; i++) {
            for(int j=0; j<data[i].length; j++) {
                data[i][j]=regList.get(i);
            }
        }
        csvReader.close();
        return data;
    }


}
