Feature: New user registration

  Scenario: Validate user is able to view after login
    Given User navigates to Login page
    When User clicks on new registration button
    And User enters the Registration details
    Then User should be able to view the Registration page