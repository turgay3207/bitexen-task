@amazonMobile
Feature: Amazon Mobile Android Test

  Scenario: TC01 Checking add to cart function
    Given User open the app
    When user clicks the skipSignIn button
    When user clicks search button
    When user enter "iphone" on the search button
    When user select first product
    Then the user verifies the resulting product
