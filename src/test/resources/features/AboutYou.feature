Feature: Home Enquiry Form

  @wip
  Scenario:Duplicate Occupation
    Given the user is on the enquiry form page
    And the user enters occupation
    When the user chooses to enter another occupation
    And the occupation is the same with the first entered one
    Then System gives warning


