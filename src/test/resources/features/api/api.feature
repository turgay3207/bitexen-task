@api
  Feature: generator.swagger.io API Test

    Scenario: TC_01 user GET request status code

      Given send get request to getClientOptions
      Then verifies that status code is 200

    Scenario: TC_02 user POST request status code

      Given send post request to getClientOptions
      Then verifies that status code is 200 post request