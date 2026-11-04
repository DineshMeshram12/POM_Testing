package Data;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import Utility.ExcelUtility;

public class TestData {

    @DataProvider(name = "LoginData")
    public Object[][] loginData() throws IOException {

        String path = "C:\\TestData\\LoginData.xlsx";

        return ExcelUtility.getExcelData(path, "Sheet1");
    }
}