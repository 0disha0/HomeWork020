package org.example;

import org.openqa.selenium.By;

public class EmailFriendPage extends Utils{

    // this is DECLARING data type and storing the value in it
    private  By _friendsEmail= By.className("friend-email");
    private  By _yourEmail =By.id("YourEmailAddress");
    private  By _Message =By.id("PersonalMessage");
    private  By _sendEmail= By.name("send-email");

    public void toVerifyUserCAnRefer(){
        typeText(_friendsEmail,"F.R.I.E.N.D@gmail.com");//Passing unique locator and sending user value
        typeText(_Message,"Hey!\nHow are you?\nI thought this might help you, and it has exclusive price to buys\n Don't be late to buy");//Passing unique locator and sending user value
        clickButton(_sendEmail);//clicking the send email button
    }

}
