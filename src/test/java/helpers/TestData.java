package helpers;

import com.opencsv.bean.CsvBindByName;
import lombok.Data;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@Data
@ToString

public class TestData {
    @CsvBindByName
    private String saturday;
    @CsvBindByName
    private String timed;
    @CsvBindByName
    private String country;
}