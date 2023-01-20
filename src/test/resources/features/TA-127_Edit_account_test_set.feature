@TA-127
Feature: TA-127: Edit account- test set (TA-127)

  @TA-xx
  Scenario: Check if user can change back account
    Given Go to "login" page
    When Fill login inputs with "adminPascal" username and "p.bertin@wp.pl" email and "password" password
    Then Username "adminPascal" should be displayed
    When Click on edit profile button
    When Fill bank account with "08116222020000000376855418" and password "password"
    Then User receives edit profile success message
    Then Close the site