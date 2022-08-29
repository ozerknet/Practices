Feature: As a user, I should be able to change folder view order by using Name/Size/Modified buttons

  Background:  User can login with valid credentials
    When user open login page
    Then user enter valid username and password
    Then user see dashboard page

  Scenario:User can change folder view order by Name
    When Click on the triangle next to "Name" button.
    And if triangle is North possitioned
    Then user should see asscending "Name" order
    And if triangle is South possitioned
    Then user should see descending "Name" order

  Scenario:User can change folder view order by Size
    When Click on the triangle next to "Size" button.
    And if triangle is North possitioned
    Then user should see asscending "Size" order
    And if triangle is South possitioned
    Then user should see descending "Size" order

  Scenario:    User can change folder view order by Modified
    When Click on the triangle next to "Modified" button.
    And if triangle is North possitioned
    Then user should see asscending "Modified" order
    And if triangle is South possitioned
    Then user should see descending "Modified" order

  Scenario: User can change the folder view by clicking the
  toggle-view button at the right corner of all files tab screen
    When user clicks on list toggle-view on the right up
    Then user should see the list view
    And user cllicks on picture toggle view
    Then user should see the picture view

  Scenario: User can select all the files at once and see the total values of all files in the
  first line when clicked on the “select all” checkbox at the left top corner of the list
    When  Click on the “select all” checkbox at the left top corner of the list.
    Then  User should see the total values of all files in the first line .



