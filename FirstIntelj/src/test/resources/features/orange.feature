
@tag1
Feature: Validate Login Feature in OrangeHrms
  Scenario: Verify the Login functionality with valid data
    Given open OrangeHrms website
    When Enter Valid Credentials
    Then UserPage Should be displayed
