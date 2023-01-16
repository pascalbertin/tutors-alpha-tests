@TA-79
Feature: TA-79: Login- test set (TA-79)

  @TA-123
  Scenario: Check if user unauthorized message is working correctly
    Given Go to "login" page
    When Fill login inputs with "aaa" username and "aaa@test.pl" email and "aaa" password
    Then User receives unauthorized message