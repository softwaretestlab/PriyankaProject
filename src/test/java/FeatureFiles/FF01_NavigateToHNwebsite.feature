#Feature is like user story
Feature: HN Homepage
  #Scenario is like test cases, that means we can have multiple scenarios
  #Given, When , Then ....these are steps
  Scenario: Navigate to HN website
    Given open browser and enter url and navigate to HN website
    Then get title and assert

