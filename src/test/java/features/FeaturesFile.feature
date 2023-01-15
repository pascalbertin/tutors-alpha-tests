Feature: Tutors Alpha Home Page Tests


  @Test-0001
  Scenario: Checking login page
    When Go to "login" page
    Then Site title should be "Tutors Alpha"
    Then Close the site


  @Test-0002
  Scenario: Checking register page
    When Go to "register" page
    Then Site title should be "Tutors Alpha"
    Then Close the site