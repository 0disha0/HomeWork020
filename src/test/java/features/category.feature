Feature: Categories
  @register
  Scenario Outline:to verify user should be open category menu


    When user click on the "<category_page>" link
    Then user should be able to go to the "<category_link>" Page
    Examples:
      | category_page | category_link |
      |Computers      |computer       |
      |Electronics    |electronics    |
    |





