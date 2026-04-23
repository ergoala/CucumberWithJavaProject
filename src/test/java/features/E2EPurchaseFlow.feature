@e2e
Feature: End to End Purchase Flow - Shoe Buying Journey
  As a registered user
  I want to browse the shoe catalogue and add a product to my cart
  So that I can complete an online shoe purchase

  Scenario: User logs in, selects a Formal Shoe and adds it to the cart
    Given User is on the Home page
    And User opens the navigation menu
    And User clicks the Sign In option
    And User enters username "testuser" and password "testpass"
    And User clicks the Login button
    Then User should be on the Shoe Types page
    When User clicks on the Formal Shoes exclusive collection
    Then User should be on the Formal Shoes list page
    When User selects the shoe "Classic Cheltenham"
    And User selects color "Black" for shoe "Classic Cheltenham"
    And User selects size "9" for shoe "Classic Cheltenham"
    And User clicks Add to Cart for shoe "Classic Cheltenham"
    Then User should see the confirmation message "Added to Cart Successfully !!!"
