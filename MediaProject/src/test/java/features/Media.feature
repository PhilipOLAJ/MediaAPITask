Feature: Send Get request and validate response

  User Story
  As a user
  I want to make a GET request
  So I can validate the response

  Scenario: Make Get request to an endpoint and validate the status code
    Given I have the endpoint to testapi.io
    When I send a Get request to https://testapi.io/api/ottplatform/media
    Then I should get the response
    And status code should be 200