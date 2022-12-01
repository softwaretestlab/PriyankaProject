Feature: Create an account
  #data driven testing
  Scenario Outline: Create an account with valid data
    Given user navigates to Create and Account screen
    #parameter are defined in the test step
    Then Enter data "<FirstName>","<LastName>","<EmailAddress>"
    #test data is provided as below
    Examples:
    |FirstName|LastName|EmailAddress|
    |FirstName01|LastName01|EmailAddress01@gmail.com|
    |FirstName02|LastName02|EmailAddress02@gmail.com|
    |FirstName03|LastName03|EmailAddress03@gmail.com|