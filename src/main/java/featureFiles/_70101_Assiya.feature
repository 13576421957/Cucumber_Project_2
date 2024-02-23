
Feature: User Registration on Parabank Website
@SmokeTest
  Scenario: US70101
    Given Navigate To Parabank Web Site
    And Click On The Element
  |"register"  |
  Scenario: User registration
  When User clicks the "Register" link
    And the user fills the fields on the screen with the following details
      | First Name | Last Name | Address  | City     | State | Zip Code | Phone #  | SSN       | Username | Password | Confirm  |
      | Alan       | Zee       | 123 Oak St | Pleasant | TX    | 75080    | 555-123-4567 | 123-45-6789 | alan_zee | pass123  | pass123  |
    And the user clicks the "Register" button
    Then user confirms that a successful registration process has taken place
    And user sees a message
    And the user will enter the system with the information he entered during the registration
