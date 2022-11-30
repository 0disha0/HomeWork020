Feature:Registration

  Scenario: User should be able to register successfully
    Given User is on homepage
    When user select a register page
    Then user should be able to go to the register Page
    And user enter all required registration details
    And select a register Button
    Then User should be able to see" Your Registration Complete"






