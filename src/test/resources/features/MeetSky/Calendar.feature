Feature: User can see Daily-Weekly-Monthly calendar view and create new event
  under calendar module

  Background:
    When user open login page
    Then user enter valid username and password
    Then user see dashboard page

  Scenario: User can display daily calendar view
    Then click on the calendar icon on the home page
    And click on the menu toggle icon on calendar page


  Scenario: User can click day button on calendar menu
    Then click on the calendar icon on the home page
    And click on the menu toggle icon on calendar page
    Then User can click day button on calendar menu


  Scenario: User can click week button on calendar menu
    Then click on the calendar icon on the home page
    And click on the menu toggle icon on calendar page
    Then User can click week button on calendar menu


  Scenario: User can click month button on calendar menu
    Then click on the calendar icon on the home page
    And click on the menu toggle icon on calendar page
    Then User can click month button on calendar menu


  Scenario: User can create a new event on calendar page
    Then click on the calendar icon on the home page
    And User can create a new event on calendar page

  Scenario: user can delete an event on calendar page
    Then click on the calendar icon on the home page
    And User can create a new event on calendar page
    And User should click save button
    Then user need to choose untitled event on calendar
    And user should click dots on event page
    Then user can delete an event on calendar page

