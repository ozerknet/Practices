Feature: user can login MeetSky page with valid credentials

  Scenario: user can login MeetSky page with valid credentials
    When user open login page
    Then user enter valid username and password
    Then user see dashboard page
