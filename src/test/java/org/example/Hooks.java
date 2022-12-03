package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks extends BasePage{
    DriverManager driverManager =new DriverManager();

    @Before
    public void setup() {//calling the method to open a browser
        driverManager.openBrowser();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot takesScreenshot = (TakesScreenshot)driver;

            byte[] src =takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src,"image/png","Screenshots");
        }
        // calling the browser to close the web browser
        driverManager.closeBrowser();
    }



}
