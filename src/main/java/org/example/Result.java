package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Result extends Utils {

    private By _message = By.className("result");
    private By _commentAtLast=By.

    public void verifyResult() {
        Assert.assertEquals(getText(_message), "Your message has been sent.");
        //matching the results with expected and actual
    }
    public void toVerifyCommentComesAtBottom() {
        List<WebElement> listOfComments = getAllElementsMatchingThisLocator(_commentAtLast)
                Assert.assertEqals(listOfComments.get(listOfComments.size()-1)).getText(), strTitle,"your comment was not found at the bottom of the page.");
    }
}