@TA-76
Feature: TA-76: Registration- test set (TA-76)

  @TA-124
  Scenario: Check if username duplicated message is working correctly
    Given Go to "register" page
    When Fill register inputs with "testtest" username and "testtest@test.pl" email and "password" password
    Then User receives duplicated username message