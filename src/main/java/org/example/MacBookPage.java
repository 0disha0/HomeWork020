package org.example;

import org.openqa.selenium.By;

public class MacBookPage extends Utils{

    private By _EmailFriend = By.className("email-a-friend");

    public void toReferFriend(){
        clickButton(_EmailFriend);
        //Passing unique locator and sending click action
    }
}
