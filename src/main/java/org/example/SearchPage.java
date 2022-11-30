package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SearchPage extends Utils {

    private By _productList =By.xpath("//h2[@class='product-title']");

    public void toVerifyProduct() {

        List<WebElement> productList = driver.findElements(_productList);
        //System.out.println(productList.size());//printing and storing the value size
        for (WebElement element : productList) {
            System.out.println(element.getText());// printing the stored value
            Assert.assertTrue(element.getText().toLowerCase().contains(LoadProp.getProperty("SearchBar").toLowerCase()), "nike products are not available");
        }
    }
}
