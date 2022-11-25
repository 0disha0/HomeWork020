package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HomePage extends Utils {

     // this is DECLARING data type and storing the value in it
     private By _customerCurrency = By.id("customerCurrency");

     private By _vote = By.xpath("//button[@id=\"vote-poll-1\"]");
     private By _newsDetailsButton = By.xpath("//div[@class='news-item'][2]/div[3]");
     private By _registerPage = By.className("ico-register");
     private By _logo = By.xpath("//img[@alt=\"nopCommerce demo store\"]");
     private By _macbook=By.linkText("Apple MacBook Pro 13-inch");
     private By _FaceBook = By.className("facebook");

     private By _Electrics= By.linkText("Electronics");


     public void toVerifyUserCanChangeCurrency() {
          selectListByVisibleText(_customerCurrency, "Euro");
          //selecting the element by visible text

          List<WebElement> productPrices = driver.findElements(By.xpath("//div[@class=\"prices\"]"));
          System.out.println(productPrices.size());//printing and storing the value size
          for (WebElement element : productPrices) {
               System.out.println(element.getText());// printing the stored value
               Assert.assertTrue(element.getText().contains("€"), "prices are not changing");
               // asserting the element does what it supposed to do and getting the text to show result
          }
     }

     public void toVerifyUserCanVote() {
          clickButton(_vote);
          driver.switchTo().alert().accept();
          // switching to the alert and clicking on ok

     }

     public void toVerifyUserCanComment() {
          clickButton(_newsDetailsButton); //It identifies unique element by xPath and clicks the button

     }

     public void toOpenFacebookTab() {
          clickButton(_FaceBook);
          String MainWindow = driver.getWindowHandle();
          // to handle opened window
          Set<String> s1= driver.getWindowHandles();
          Iterator<String> i1= s1.iterator();
          while(i1.hasNext()){
               String ChildWindow=i1.next();
               if (!MainWindow.equalsIgnoreCase(ChildWindow)){
                    //to switch on child window
                    driver.switchTo().window(ChildWindow);
                    WaitForUrlToBe("https://www.facebook.com/nopCommerce",20);
                   // waiting element for url to be open
                    driver.close();
                    //close the child window
                    driver.switchTo().window(MainWindow);
                    //switching to the main window
               }
          }

     }

     public void toVerifyUserCanOpenRegisterPage() {
          clickButton(_registerPage); // Uniquely identify the element within the web page and perform given action
     }
     public void toCheckUserRegisteredOrNot(){
          clickButton(_logo);
     }
     public void toOpenMacBookPage(){
           clickButton(_macbook);//Passing unique locator and sending click action
     }
     public void toVerifyUserCanGoToTheElectronicsPage(){
          clickButton(_Electrics);
     }


}