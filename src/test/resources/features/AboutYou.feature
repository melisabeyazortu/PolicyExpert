@wip
Feature: Home Enquiry Form

  Background: Given the user is on the enquiry form page

  Scenario:Duplicate Occupation
    Given The user enters occupation
    When The user chooses to enter another occupation
    And The occupation is the same with the first entered one
    Then System gives warning

  Scenario Outline:User can click <title>
    Given The user clicks "<title>"
    Then The title is clickable

    Examples:
    |title|
    |Mr   |
    |Mrs  |
    |Miss |
    |Ms   |
    |Dr   |

    Scenario: User can fill the First name and Last name sections
      Given The user enters the First name
      And The user enters the Last name
      Then The First name and Last name sections are filled

     Scenario: User can choose marital status
       Given The user chooses its marital status
       Then Marital Status is chosen


      Scenario: Occupation Selection
        Given The user selects its occupation
        Then The occupation is selected

      Scenario: Second Occupation Selection
        Given The user selects its occupation
        And The user clicks Yes
        Then The user can add second occupation







