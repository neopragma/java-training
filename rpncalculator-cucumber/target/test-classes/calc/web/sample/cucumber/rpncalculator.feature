Feature: As a person who likes numbers, 
  I want a Reverse Polish Notation calculator 
  so that I can perform arithmetic operations.
  
  Scenario: The welcome message is displayed
    Given I am on the RPN Calculator page
    Then the welcome message reads "Welcome to the Java RPN calculator"    

  Scenario: Adding two integers
    Given I enter "5 3 +"
    When I get the result
    Then the calculator returns "8"
    
 
  Scenario: Subtracting two integers
    Given I enter "5 3 -"
    When I get the result
    Then the calculator returns "2"

  Scenario: Multiplying two integers
    Given I enter "5 3 *"
    When I get the result
    Then the calculator returns "15"

  Scenario: Dividing two integers
    Given I enter "54 13 /"
    When I get the result
    Then the calculator returns "4" plus or minus "0.5"

  Scenario: Modulus
    Given I enter "54 13 %"
    When I get the result
    Then the calculator returns "2"

  Scenario: Exponentiation
    Given I enter "4 3 ^"
    When I get the result
    Then the calculator returns "64"

  Scenario: Adding two real numbers
    Given I enter "5.3 3.6 +"
    When I get the result
    Then the calculator returns "8.9"

  Scenario: Subtracting two real numbers
    Given I enter "5.3 3.6 -"
    When I get the result
    Then the calculator returns "1.7"

  Scenario: Multiplying two real numbers
    Given I enter "5.3 3.6 *"
    When I get the result
    Then the calculator returns "19.08"

  Scenario: Dividing two real numbers
    Given I enter "54.75 13.6 /"
    When I get the result
    Then the calculator returns "4.0257" plus or minus "0.0005"

  Scenario: Exponentiation - real number
    Given I enter "5.5 3 ^"
    When I get the result
    Then the calculator returns "166.375" plus or minus "0.0005"

  Scenario: Clearing memory
    Given I enter "2"
    When I get the result
    Then the calculator returns "2"

    Given I enter "4 5 c"
    When I get the result
    Then the calculator returns ""  
    