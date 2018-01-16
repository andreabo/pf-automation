Feature: Test

  Scenario: Lib tests
    Given I have the template of a request for a service with following info:
      | Service | Offers    |
      | Path    | factoring |
      | Method  | GET       |
    When I send a request to the service
    Then