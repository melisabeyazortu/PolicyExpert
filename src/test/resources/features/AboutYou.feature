Feature: Home Enquiry Form

  @wip
  Scenario:Duplicate Occupation
    Given the user is on the enquiry form page
    And the user enters occupation
    When the user chooses to enter another occupation
    Then the occupation is not the same with the first entered one

  Scenario:Duplicate Occupation
