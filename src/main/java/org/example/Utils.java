package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;

public class Utils extends BasePage{
    public static String TimeStamp() {
        return new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date()); // Storing current date and time as given pattern
    }

    //This method will perform click action in given element
    public static void clickButton(By by) {
        driver.findElement(by).click();   // Uniquely identify the element within the web page and perform given action
    }

    //This method will give user data to the specific field
    public static void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text); //Uniquely identify the element within the web page and perform given action
    }

    //This method will check and send the select list by value
    public static void selectListByValue(By by, String value){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    //This method will check and send the select list value by visible text
    public static void selectListByVisibleText(By by, String value){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(value);
    }

    //This method will check and send the select list value by index value
    public static void selectListByIndex(By by,int value){
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(value);
    }
    public static String getText(By by) {
        return driver.findElement(by).getText();
        //Uniquely identify the element within the web page and perform given action
    }
    // this method will wait for element until its click
    public static void WaitForElementToBeClickAble(By by,int duration) {
        WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        Wait.until(ExpectedConditions.elementToBeClickable(by));

    }
    public static void WaitForElementToBeVisible(By by,int duration) {
        WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        Wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }
    public static void WaitForUrlToBe(String url,int duration) {
        WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        Wait.until(ExpectedConditions.urlToBe(url));
    }
    public static void takeScreenshot(String screenshotName) throws IOException {

        TakesScreenshot scrShot =((TakesScreenshot)driver);
        //Convert web driver object to TakeScreenshot
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        //Call getScreenshotAs method to create image file
        File DestFile=new File("src/main/ScreenShot/"+screenshotName+TimeStamp()+".jpg");
        //Move image file to new destination
        FileUtils.copyFile(SrcFile, DestFile);


    }

}
