package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager extends BasePage {

        public static void openBrowser() {
                // System.setProperty() method forms the basis for test automation on any browser
                System.setProperty("webdriver.chrome.driver", "src/test/java/Driver/chromedriver");
                // Test case automation on chrome
                driver = new ChromeDriver();
                // Instantiating as ChromeDriver
                driver.get("https://demo.nopcommerce.com");
                // Navigate the given URL and wait till page load
                driver.manage().window();
                // It returns instance of option interface and returns instance of window interface
        }
        public static void closeBrowser(){
                //to close the web browser
                driver.quit();
        }

}
