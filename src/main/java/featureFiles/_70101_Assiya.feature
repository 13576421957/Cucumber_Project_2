
Feature: User Registration on Parabank Website

  Background:
    Given User navigate to the parabank Website
    And website has a connection such as "register" or "sign up" on its home page

  Scenario: User registration
  WHEN User clicks the "Register" link
    And the user fills the fields on the screen with the following details
      | First Name | Last Name | Address  | City     | State | Zip Code | Phone #  | SSN       | Username | Password | Confirm  |
      | Alan       | Zee       | 123 Oak St | Pleasant | TX    | 75080    | 555-123-4567 | 123-45-6789 | alan_zee | pass123  | pass123  |
    And the user clicks the "Submit" or "Register" button
    Then user confirms that a successful registration process has taken place
    And user sees a message like "Your Account Was Created Successfully. You are now."
    And the user will enter the system with the information he entered during the registration
