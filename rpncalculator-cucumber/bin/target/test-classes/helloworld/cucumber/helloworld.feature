Feature: Demo
  In order to provide a minimal project template
  As a Developer
  I want to run a dirt-simple demo feature

  Scenario: Hello World hard-coded
  
    Given I am on the Greetings page
    And the language is English
    When I ask it to say hello
    Then the greeting is Hello, World
  
    Given I am on the Greetings page
    And the language is Spanish
    When I ask it to say hello
    Then the greeting is Hola, Mundo
  
    Given I am on the Greetings page
    And the language is Russian
    When I ask it to say hello
    Then the greeting is привет, мир
  
    Given I am on the Greetings page
    And the language is Japanese
    When I ask it to say hello
    Then the greeting is こんにちは世界
    
        
  Scenario Outline: Display localized greetings
    Given I am on the Greetings page
    And the language is <Language>
    When I ask it to say hello
    Then the greeting is <Greeting>
    
    Examples: Localized greeting is displayed
      | Language | Greeting     |
      | English  | Hello, World |
      | Spanish  | Hola, Mundo  |
      | this one | will fail |              
      | Russian  | привет, мир  |
      | Japanese | こんにちは世界  |
 

    