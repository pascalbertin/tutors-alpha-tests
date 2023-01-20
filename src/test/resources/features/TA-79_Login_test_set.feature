@TA-79
Feature: TA-79: Login- test set (TA-79)

  @TA-123
  Scenario: Check if user unauthorized message is working correctly
    Given Go to "login" page
    When Fill login inputs with "aaa" username and "aaa@test.pl" email and "aaa" password
    Then User receives unauthorized message
    Then Close the site

  @TA-xx
  Scenario: Check if user incorrect message is working correctly
    Given Go to "login" page
    When Fill login inputs with "adminPascal" username and "aaa@test.pl" email and "aaa" password
    Then User receives incorrect login data message
    Then Close the site

  @TA-xx
  Scenario: Check if user log in
    Given Go to "login" page
    When Fill login inputs with "PascalBertin" username and "pasber@st.amu.edu.pl" email and "password" password
    Then Username "PascalBertin" should be displayed
    Then Close the site