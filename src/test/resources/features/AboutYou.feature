
Feature: Home Enquiry Form

  Background:
    Given the user is on the enquiry form page

  @wip
  Scenario:Duplicate Occupation
    Given The user enters occupation
    When The user chooses to enter another occupation
    And The occupation is the same with the first entered one
    Then System gives warning

  Scenario Outline:User can click <title>
    Given The user clicks "<title>"
    Then The title is clickable

    Examples:
      | title |
      | Mr    |
      | Mrs   |
      | Miss  |
      | Ms    |
      | Dr    |


  Scenario Outline: Title Selection

    Then Under <Title> User sees the list of following options:
    Examples:
      | Title                 |
      | Married               |
      | Single                |
      | Co-habiting / partner |
      | Divorced              |
      | Widowed               |
      | Separated             |
      | Civil partnership     |

  Scenario: User can fill the First name and Last name sections
    Given The user enters the First name
    And The user enters the Last name
    Then The First name and Last name sections are filled

    Scenario: Entrance of Date of Birth
      Given The user enters the date
      And The user enters the month
      And The user enters the year
      Then Date of Birth section is filled

  Scenario: Wrong Entrance of Date of Birth
    Given The user enters the date out of range
    Then There is warning

  Scenario: Wrong Entrance of Date of Birth
    Given The user tries to enter letters to the the date
    And The user tries to enter letters to the the month
    And The user tries to enter letter to the year
    Then Then user can not enter letters


  Scenario: User can choose marital status
    Given The user chooses its marital status
    Then Marital Status is chosen

  Scenario: Marital Status Selection
    Then Under "Marital Status" User sees the list of following options:
      | Married               |
      | Single                |
      | Co-habiting / partner |
      | Divorced              |
      | Widowed               |
      | Separated             |
      | Civil partnership     |


  Scenario: Occupation Selection
    Given The user selects its occupation
    Then The occupation is selected

  Scenario: Second Occupation Selection
    Given The user selects its occupation
    And The user clicks Yes
    Then The user can add second occupation

  Scenario: Not Select Second Occupation
    Given The user selects its occupation
    And The user clicks No
    Then The user can not add second occupation

  Scenario: Empty Second Occupation Selection
    Given The user selects its occupation
    And The user clicks Yes
    And The user does not select
    Then There is warning

  Scenario: Phone number entrance
    Given The user enters its phone number
    Then The phone number section is filled

  Scenario: Phone number entrance with letters
    Given The user enters its phone number
    And The entrance contains letters
    Then There is warning

  Scenario: E-mail address entrance
    Given The user enters its e-mail address
    Then The e-mail address ection is filled

  Scenario: Invalid E-mail address entrance
    Given The user enters invalid e-mail address
    Then There is warning










