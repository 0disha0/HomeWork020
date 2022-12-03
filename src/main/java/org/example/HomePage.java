package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
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

     private By _headerMenu= By.className("header-menu");

     private By _searchBar= By.xpath("//input[@id=\"small-searchterms\"]");
     private By _searchButton =By.xpath("//*[@id=\"small-search-box-form\"]/button");
     private By _computerMenu = By.linkText("Computers");
     private By _desktopsSubMenu = By.linkText("Desktops");



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
     public void toHoverOverAndNavigateToDesiredCategoryPage(String category,String Subcategory){
          WebElement categoryLink =driver. findElement(By.xpath("/html/body/div[6]/div[2]/ul["+category+"2]/li[2]/a"));
          String beforeHover = categoryLink.getCssValue( "color");
          System.out.println("Before hover color for category link ="+beforeHover);
     }

     public void toHoverMouseOverComputerMenuAndDesktopsSubMenu(){
          //Object for actions methods that performs click and hold at the location of elements
          Actions actions = new Actions(driver);
          //Getting location of the given element for computer menu
          WebElement computerMenuElement = driver.findElement(_computerMenu);
          //Getting color code of Computer from menu before hovering
          String computerTextColor = computerMenuElement.getCssValue("color");
          //Getting the Hex code of the color
          String hexCode = Color.fromString(computerTextColor).asHex();
          System.out.println("Computer menu text color before hovering: " + computerTextColor);
          System.out.println("HexCode: " + hexCode);
          //Hover mouse over computer menu
          actions.moveToElement(computerMenuElement).perform();
          //Getting the color of Computer menu after hovering
          String afterHoverComputerTextCode = computerMenuElement.getCssValue("color");
          //Getting the Hex code of the color
          String afterHoverHexCode = Color.fromString(afterHoverComputerTextCode).asHex();
          System.out.println("Computer menu text color after hovering: " + afterHoverComputerTextCode);
          System.out.println("HexCode: "+ afterHoverHexCode);
          //To check before and after hovering the element has different color
          Assert.assertNotEquals(computerTextColor,afterHoverHexCode,"Expected color matched");
          //Getting location of the given element for desktops submenu
          WebElement desktopsSubMenuElement = driver.findElement(_desktopsSubMenu);
          //Getting the background color of desktops submenu
          String desktopsSubMenuColor = desktopsSubMenuElement.getCssValue("background-color");
          //Getting the hexCode of that color
          String hexCodeDesktops = Color.fromString(desktopsSubMenuColor).asHex();
          System.out.println("Desktops submenu background color before hovering: " + desktopsSubMenuColor);
          System.out.println("HexCode: " + hexCodeDesktops);
          //Hover mouse over desktops submenu
          actions.moveToElement(desktopsSubMenuElement).perform();
          //Getting the background color of desktops submenu after hovering on it
          String afterHoveringDesktopsSubMenu = desktopsSubMenuElement.getCssValue("color");
          //Converting the color into hexCode
          String hexCodeAfterHovering = Color.fromString(afterHoveringDesktopsSubMenu).asHex();
          System.out.println("Desktops submenu background color after hovering: " + afterHoveringDesktopsSubMenu);
          System.out.println("HexCode: " + hexCodeAfterHovering);
          //Checking the color doesn't match after and before hovering on it
          Assert.assertNotEquals(desktopsSubMenuColor,afterHoveringDesktopsSubMenu,"Background color matched");
     }
     public void toVerifySearchBar() {
          typeText(_searchBar, LoadProp.getProperty("SearchBar"));
          clickButton(_searchButton);

          }
     public void clickOnCategoryPage (String category) {
          clickButton(By.linkText(category));

     }
}
