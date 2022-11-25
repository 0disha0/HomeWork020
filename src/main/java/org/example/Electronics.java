package org.example;

import org.openqa.selenium.By;

public class Electronics extends Utils{
       private By _CameraPhoto =By.xpath("//div/a[@href=\"/camera-photo\"]");

       public void navigateToCameraPage() {
           clickButton(_CameraPhoto);
       }
       //navigating the camera and photoPage
}
