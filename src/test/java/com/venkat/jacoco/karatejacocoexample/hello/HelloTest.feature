Feature: Test Hello World from Sample Spring Application

@HelloWorld
Scenario: Test Hello World from Sample
    Given url 'http://localhost:8080'
    And path '/hello'
    When method GET
    Then status 200
