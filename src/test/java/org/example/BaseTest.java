package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest extends Utils {
    DriverManager driverManager =new DriverManager();

    @BeforeMethod
    public void setup() {//calling the method to open a browser
        driverManager.openBrowser();
    }
//    }
//    @AfterMethod
//    public void tearDown(ITestResult result) throws IOException {
//        if (!result.isSuccess()) {
//            takeScreenshot(result.getName());//calling the method and comparing
//        }
//        // calling the browser to close the web browser
//        driverManager.closeBrowser();
//    }

}
