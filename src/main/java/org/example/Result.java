package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Result extends Utils {

    private By _message = By.className("result");

    public void verifyResult() {
        Assert.assertEquals(getText(_message), "Your message has been sent.");
        //matching the results with expected and actual
    }
}
