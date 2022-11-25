package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class CameraPhoto extends Utils{

    public void toVerifyEachProductHasAddToCartButton(){
        List<WebElement> AddToCart= driver.findElements(By.xpath("//div[@class=\"product-item\"]"));// listing the total PRODUCT TO FIND
        System.out.println(AddToCart.size());
        // looking for the size of the element
        int a=1;
        for(WebElement element :AddToCart){
            Assert.assertTrue(element.getText().contains("ADD TO CART"),element.findElement(
                    By.xpath("//div/div["+a+"]/div/div[2]/h2")).getText());
            // asserting element get text who is not containing the add to cart button and printing it
            a++;
        }
    }

}
