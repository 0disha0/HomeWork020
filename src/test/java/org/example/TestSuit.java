package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    HomePage homePage =new HomePage();
    CommentPage commentPage=new CommentPage();
    RegisterPage registerPage =new RegisterPage();
    MacBookPage macBookPage =new MacBookPage();
    EmailFriendPage emailFriendPage =new EmailFriendPage();
    Electronics electronics =new Electronics();
    CameraPhoto cameraPhoto= new CameraPhoto();

    SearchPage searchPage = new SearchPage();
    Result result =new Result();




    @Test
    public void toVerifyUserCanChangeCurrencySuccessfully(){
        homePage.toVerifyUserCanChangeCurrency();
        // to verify currency calling a method from homepage
    }

    @Test
    public void toVerifyUserCanVoteSuccessfully(){
        homePage.toVerifyUserCanVote();
        //to verify alert calling the method from homepage
    }

    @Test
    public void toVerifyUserShouldBeCommentOnNewsAndItListedAtLast(){
        homePage.toVerifyUserCanComment();
        // to verify user can get comment option
        commentPage.toAddComment();
        //calling the method from comment page add details in comment
    }

    @Test
    public void toVerifyDriverCAnSwitchTheWindow(){
        homePage.toOpenFacebookTab();
        // to verify switch the window child to PARENT

    }
    @Test
    public void toVerifyRegisteredUserShouldBeReferFriendSuccessfully(){
        homePage.toVerifyUserCanOpenRegisterPage();
        //OPING THE REGISTER PAGE
        registerPage.registrationDetails();
        //adding the register details
        homePage.toCheckUserRegisteredOrNot();
        // refreshing the page
        homePage.toOpenMacBookPage();
        //opening the page
        macBookPage.toReferFriend();
        //selecting the button
        emailFriendPage.toVerifyUserCAnRefer();
        // adding the comments and sending the mail
        result.verifyResult();

    }
    @Test
    public void toVerifyUserShouldBeGetAddToCartButtonInEchProduct(){
        homePage.toVerifyUserCanGoToTheElectronicsPage();
        //opening the page
        electronics.navigateToCameraPage();
        // opening the page
        cameraPhoto.toVerifyEachProductHasAddToCartButton();
        // verifying all product has add to cart button
    }
    @Test
    public void toVerifyHeaderMenuCategoryColorBeforeHoverAndAfter(){
        //homePage.toHoverOverAndNavigateToDesiredCategoryPage("Electronics","Camera & photo");
        homePage.toHoverMouseOverComputerMenuAndDesktopsSubMenu();
    }

    @Test
    public void toVerifySearchBarNavigateSuccessfully(){
        homePage.toVerifySearchBar();
        searchPage.toVerifyProduct();

    }
}
