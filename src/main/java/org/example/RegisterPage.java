package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils{

    // this is DECLARING data type and storing the value in it
    private By _selectGender = By.id("gender-female");
    private By _firstName =By.id("FirstName");
    private By _lastName =By.id("LastName");
    private By _dateOfBirthDay= By.name("DateOfBirthDay");
    private By _dateOfBirthMonth= By.name("DateOfBirthMonth");
    private By _dateOfBirthYear = By.name("DateOfBirthYear");
    private By _email =By.id("Email");
    private By _companyName = By.name("Company");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _registerButton = By.id("register-button");

    public void registrationDetails() {
        clickButton(_selectGender);
        // It identifies the unique element by id and performs click action
        typeText(_firstName, LoadProp.getProperty("FirstName"));
        // It identifies the unique element by id and fill in FirstName
        typeText(_lastName, LoadProp.getProperty("LastName"));
        // It identifies the unique element by id and fill in LastName
        selectListByValue(_dateOfBirthDay, LoadProp.getProperty("BirthDay"));
        // Identifies the unique element by xPath and selects Date of birth Day
        selectListByIndex(_dateOfBirthMonth,10);
        // Identifies the unique element by name and selects Date of birth Month
        selectListByVisibleText(_dateOfBirthYear, LoadProp.getProperty("BirthYear"));
        // Identifies the unique element by xPath and selects Date of birth Year
        typeText(_email, LoadProp.getProperty(TimeStamp()+"YourEmailAddress"));
        // Identifies unique element by id and fill it with given user inputs - timeStamp is used in between so everytime we test it will be unique and accepts the data
        typeText(_companyName, LoadProp.getProperty("Company"));
        // Identifies unique element by name and fill in Company name
        typeText(_password, LoadProp.getProperty("Password"));
        // Identifies the unique element by id and fill the Password
        typeText(_confirmPassword, LoadProp.getProperty("ConfirmPassword"));
        // Identifies the unique element by id and fill the ConfirmPassword
    }
    public void clickOnRegisterButton(){
        clickButton(_registerButton);
        // Identifies unique element by id and click the Register button

    }
}
