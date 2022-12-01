@RegressionTest
Feature:  test
  @SanityTesting
  Scenario: First test
    Given user opens browser first
    When user on homepage first
    Then user clicks on account link first
  @SmokeTesting
  Scenario:  Second test
    Given user opens browser Second
    When user on homepage Second
    Then user clicks on account link Second