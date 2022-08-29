Feature: As a user, I should be able to create a new group and add any contact into a group under Contacts module

  Background:
    When user open login page
    Then user enter valid username and password
    Then user see dashboard page

  Scenario: User can create a new group under Contacts Module
    When Click on the Contacts icon top up to the page
    And Verify that user can see the contact page
    And Click on the plus button on the right of the Groups
    And Enter a new group name
    And Click the arrow on the right side of the input box
    Then Verify that user can see There are no contacts in this group message in the new group page

  Scenario: User can add any existing contact from the groups dropdown menu existing inside that specific contact’s own info menu
    When Click on the Contacts icon top up to the page
    And Verify that user can see the contact page
    And Click on the three dots button next to the group name
    And Click Add contacts button
    Then Verify that user can see the contacts list on the new small window
    And Click the any contact name from the list of contact
    And Click the Add to group name button
    And Click the Group Name which one you add a new contact name
    Then Verify that user can see the all contacts of group as a list inside middle column

  Scenario: User can see all the available groups name through the groups dropdown menu existing in the contact’s own info menu
    When Click on the Contacts icon top up to the page
    And Verify that user can see the contact page
    And Click the Groups box in the contact’s own info menu
    Then Verify that user can see all the available groups name through the groups dropdown menu existing

  Scenario: User can add a new property as 'Birthday' to the contact’s info page from the 'Add new property' dropdown menu
    When Click on the Contacts icon top up to the page
    And Verify that user can see the contact page
    And Click the any contact from the list of contact
    And Click the dropdown menu under the Add new property
    Then Verify that user can see Birthday property inside the different properties
    And Click the Birthday property
    Then Verify that user can see Birthday property as a dropdown menu in the contact info page
