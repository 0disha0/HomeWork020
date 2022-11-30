package org.example;

import org.openqa.selenium.By;

public class CommentPage extends Utils {

    // this is DECLARING data type and storing the value in it
    private By _commentTitle =By.name("AddNewComment.CommentTitle");
    private By _commentText =By.name("AddNewComment.CommentText");
    private By _AddComment =By.name("add-comment");

    public void toAddComment() {
        typeText(_commentTitle,"CommentTitle"); // Identifies unique element by name and insert "Very Good" in that field
        typeText(_commentText, "CommentText");//Identifies unique element by name and insert user input data passed in sendKey() method in that field
        clickButton(_AddComment); // It will click the button which has unique locator passed in findElement by name

    }
}
