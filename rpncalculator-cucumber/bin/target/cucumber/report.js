$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("helloworld/cucumber/helloworld.feature");
formatter.feature({
  "id": "demo",
  "description": "In order to provide a minimal project template\nAs a Developer\nI want to run a dirt-simple demo feature",
  "name": "Demo",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "demo;hello-world-hard-coded",
  "description": "",
  "name": "Hello World hard-coded",
  "keyword": "Scenario",
  "line": 6,
  "type": "scenario"
});
formatter.step({
  "name": "I am on the Greetings page",
  "keyword": "Given ",
  "line": 8
});
formatter.step({
  "name": "the language is English",
  "keyword": "And ",
  "line": 9
});
formatter.step({
  "name": "I ask it to say hello",
  "keyword": "When ",
  "line": 10
});
formatter.step({
  "name": "the greeting is Hello, World",
  "keyword": "Then ",
  "line": 11
});
formatter.step({
  "name": "I am on the Greetings page",
  "keyword": "Given ",
  "line": 13
});
formatter.step({
  "name": "the language is Spanish",
  "keyword": "And ",
  "line": 14
});
formatter.step({
  "name": "I ask it to say hello",
  "keyword": "When ",
  "line": 15
});
formatter.step({
  "name": "the greeting is Hola, Mundo",
  "keyword": "Then ",
  "line": 16
});
formatter.step({
  "name": "I am on the Greetings page",
  "keyword": "Given ",
  "line": 18
});
formatter.step({
  "name": "the language is Russian",
  "keyword": "And ",
  "line": 19
});
formatter.step({
  "name": "I ask it to say hello",
  "keyword": "When ",
  "line": 20
});
formatter.step({
  "name": "the greeting is привет, мир",
  "keyword": "Then ",
  "line": 21
});
formatter.step({
  "name": "I am on the Greetings page",
  "keyword": "Given ",
  "line": 23
});
formatter.step({
  "name": "the language is Japanese",
  "keyword": "And ",
  "line": 24
});
formatter.step({
  "name": "I ask it to say hello",
  "keyword": "When ",
  "line": 25
});
formatter.step({
  "name": "the greeting is こんにちは世界",
  "keyword": "Then ",
  "line": 26
});
formatter.match({
  "location": "HelloWorldStepdefs.on_the_greetings_page()"
});
formatter.result({
  "duration": 408637712,
  "status": "failed",
  "error_message": "java.lang.IllegalStateException: The path to the driver executable must be set by the webdriver.chrome.driver system property; for more information, see http://code.google.com/p/selenium/wiki/ChromeDriver. The latest version can be downloaded from http://code.google.com/p/chromedriver/downloads/list\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:176)\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:105)\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:69)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:107)\n\tat com.neopragma.java.pageobject.SeleniumWebDriver.startWebDriver(SeleniumWebDriver.java:74)\n\tat com.neopragma.java.pageobject.SeleniumWebDriver.webDriver(SeleniumWebDriver.java:50)\n\tat com.neopragma.java.pageobject.Page.webDriver(Page.java:50)\n\tat com.neopragma.java.pageobject.Page.navigateTo(Page.java:152)\n\tat com.neopragma.java.pageobject.Page.navigateTo(Page.java:144)\n\tat helloworld.cucumber.HelloWorldStepdefs.on_the_greetings_page(HelloWorldStepdefs.java:28)\n\tat ✽.Given I am on the Greetings page(helloworld/cucumber/helloworld.feature:8)\n"
});
formatter.match({
  "arguments": [
    {
      "val": "English",
      "offset": 16
    }
  ],
  "location": "HelloWorldStepdefs.the_language_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HelloWorldStepdefs.I_ask_it_to_say_hello()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello, World",
      "offset": 16
    }
  ],
  "location": "HelloWorldStepdefs.the_greeting_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HelloWorldStepdefs.on_the_greetings_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Spanish",
      "offset": 16
    }
  ],
  "location": "HelloWorldStepdefs.the_language_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HelloWorldStepdefs.I_ask_it_to_say_hello()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Hola, Mundo",
      "offset": 16
    }
  ],
  "location": "HelloWorldStepdefs.the_greeting_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HelloWorldStepdefs.on_the_greetings_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Russian",
      "offset": 16
    }
  ],
  "location": "HelloWorldStepdefs.the_language_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HelloWorldStepdefs.I_ask_it_to_say_hello()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "привет, мир",
      "offset": 16
    }
  ],
  "location": "HelloWorldStepdefs.the_greeting_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HelloWorldStepdefs.on_the_greetings_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Japanese",
      "offset": 16
    }
  ],
  "location": "HelloWorldStepdefs.the_language_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HelloWorldStepdefs.I_ask_it_to_say_hello()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "こんにちは世界",
      "offset": 16
    }
  ],
  "location": "HelloWorldStepdefs.the_greeting_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "id": "demo;display-localized-greetings;localized-greeting-is-displayed;2",
  "description": "",
  "name": "Display localized greetings",
  "keyword": "Scenario Outline",
  "line": 37,
  "type": "scenario"
});
formatter.step({
  "name": "I am on the Greetings page",
  "keyword": "Given ",
  "line": 30
});
formatter.step({
  "name": "the language is English",
  "keyword": "And ",
  "line": 31,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "I ask it to say hello",
  "keyword": "When ",
  "line": 32
});
formatter.step({
  "name": "the greeting is Hello, World",
  "keyword": "Then ",
  "line": 33,
  "matchedColumns": [
    1
  ]
});
formatter.match({
  "location": "HelloWorldStepdefs.on_the_greetings_page()"
});
formatter.result({
  "duration": 304176,
  "status": "failed",
  "error_message": "java.lang.IllegalStateException: The path to the driver executable must be set by the webdriver.chrome.driver system property; for more information, see http://code.google.com/p/selenium/wiki/ChromeDriver. The latest version can be downloaded from http://code.google.com/p/chromedriver/downloads/list\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:176)\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:105)\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:69)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:107)\n\tat com.neopragma.java.pageobject.SeleniumWebDriver.startWebDriver(SeleniumWebDriver.java:74)\n\tat com.neopragma.java.pageobject.SeleniumWebDriver.webDriver(SeleniumWebDriver.java:50)\n\tat com.neopragma.java.pageobject.Page.webDriver(Page.java:50)\n\tat com.neopragma.java.pageobject.Page.navigateTo(Page.java:152)\n\tat com.neopragma.java.pageobject.Page.navigateTo(Page.java:144)\n\tat helloworld.cucumber.HelloWorldStepdefs.on_the_greetings_page(HelloWorldStepdefs.java:28)\n\tat ✽.Given I am on the Greetings page(helloworld/cucumber/helloworld.feature:30)\n"
});
formatter.match({
  "arguments": [
    {
      "val": "English",
      "offset": 16
    }
  ],
  "location": "HelloWorldStepdefs.the_language_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HelloWorldStepdefs.I_ask_it_to_say_hello()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello, World",
      "offset": 16
    }
  ],
  "location": "HelloWorldStepdefs.the_greeting_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "id": "demo;display-localized-greetings;localized-greeting-is-displayed;3",
  "description": "",
  "name": "Display localized greetings",
  "keyword": "Scenario Outline",
  "line": 38,
  "type": "scenario"
});
formatter.step({
  "name": "I am on the Greetings page",
  "keyword": "Given ",
  "line": 30
});
formatter.step({
  "name": "the language is Spanish",
  "keyword": "And ",
  "line": 31,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "I ask it to say hello",
  "keyword": "When ",
  "line": 32
});
formatter.step({
  "name": "the greeting is Hola, Mundo",
  "keyword": "Then ",
  "line": 33,
  "matchedColumns": [
    1
  ]
});
formatter.match({
  "location": "HelloWorldStepdefs.on_the_greetings_page()"
});
formatter.result({
  "duration": 294214,
  "status": "failed",
  "error_message": "java.lang.IllegalStateException: The path to the driver executable must be set by the webdriver.chrome.driver system property; for more information, see http://code.google.com/p/selenium/wiki/ChromeDriver. The latest version can be downloaded from http://code.google.com/p/chromedriver/downloads/list\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:176)\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:105)\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:69)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:107)\n\tat com.neopragma.java.pageobject.SeleniumWebDriver.startWebDriver(SeleniumWebDriver.java:74)\n\tat com.neopragma.java.pageobject.SeleniumWebDriver.webDriver(SeleniumWebDriver.java:50)\n\tat com.neopragma.java.pageobject.Page.webDriver(Page.java:50)\n\tat com.neopragma.java.pageobject.Page.navigateTo(Page.java:152)\n\tat com.neopragma.java.pageobject.Page.navigateTo(Page.java:144)\n\tat helloworld.cucumber.HelloWorldStepdefs.on_the_greetings_page(HelloWorldStepdefs.java:28)\n\tat ✽.Given I am on the Greetings page(helloworld/cucumber/helloworld.feature:30)\n"
});
formatter.match({
  "arguments": [
    {
      "val": "Spanish",
      "offset": 16
    }
  ],
  "location": "HelloWorldStepdefs.the_language_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HelloWorldStepdefs.I_ask_it_to_say_hello()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Hola, Mundo",
      "offset": 16
    }
  ],
  "location": "HelloWorldStepdefs.the_greeting_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "id": "demo;display-localized-greetings;localized-greeting-is-displayed;4",
  "description": "",
  "name": "Display localized greetings",
  "keyword": "Scenario Outline",
  "line": 39,
  "type": "scenario"
});
formatter.step({
  "name": "I am on the Greetings page",
  "keyword": "Given ",
  "line": 30
});
formatter.step({
  "name": "the language is this one",
  "keyword": "And ",
  "line": 31,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "I ask it to say hello",
  "keyword": "When ",
  "line": 32
});
formatter.step({
  "name": "the greeting is will fail",
  "keyword": "Then ",
  "line": 33,
  "matchedColumns": [
    1
  ]
});
formatter.match({
  "location": "HelloWorldStepdefs.on_the_greetings_page()"
});
formatter.result({
  "duration": 448735,
  "status": "failed",
  "error_message": "java.lang.IllegalStateException: The path to the driver executable must be set by the webdriver.chrome.driver system property; for more information, see http://code.google.com/p/selenium/wiki/ChromeDriver. The latest version can be downloaded from http://code.google.com/p/chromedriver/downloads/list\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:176)\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:105)\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:69)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:107)\n\tat com.neopragma.java.pageobject.SeleniumWebDriver.startWebDriver(SeleniumWebDriver.java:74)\n\tat com.neopragma.java.pageobject.SeleniumWebDriver.webDriver(SeleniumWebDriver.java:50)\n\tat com.neopragma.java.pageobject.Page.webDriver(Page.java:50)\n\tat com.neopragma.java.pageobject.Page.navigateTo(Page.java:152)\n\tat com.neopragma.java.pageobject.Page.navigateTo(Page.java:144)\n\tat helloworld.cucumber.HelloWorldStepdefs.on_the_greetings_page(HelloWorldStepdefs.java:28)\n\tat ✽.Given I am on the Greetings page(helloworld/cucumber/helloworld.feature:30)\n"
});
formatter.match({
  "arguments": [
    {
      "val": "this one",
      "offset": 16
    }
  ],
  "location": "HelloWorldStepdefs.the_language_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HelloWorldStepdefs.I_ask_it_to_say_hello()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "will fail",
      "offset": 16
    }
  ],
  "location": "HelloWorldStepdefs.the_greeting_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "id": "demo;display-localized-greetings;localized-greeting-is-displayed;5",
  "description": "",
  "name": "Display localized greetings",
  "keyword": "Scenario Outline",
  "line": 40,
  "type": "scenario"
});
formatter.step({
  "name": "I am on the Greetings page",
  "keyword": "Given ",
  "line": 30
});
formatter.step({
  "name": "the language is Russian",
  "keyword": "And ",
  "line": 31,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "I ask it to say hello",
  "keyword": "When ",
  "line": 32
});
formatter.step({
  "name": "the greeting is привет, мир",
  "keyword": "Then ",
  "line": 33,
  "matchedColumns": [
    1
  ]
});
formatter.match({
  "location": "HelloWorldStepdefs.on_the_greetings_page()"
});
formatter.result({
  "duration": 353402,
  "status": "failed",
  "error_message": "java.lang.IllegalStateException: The path to the driver executable must be set by the webdriver.chrome.driver system property; for more information, see http://code.google.com/p/selenium/wiki/ChromeDriver. The latest version can be downloaded from http://code.google.com/p/chromedriver/downloads/list\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:176)\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:105)\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:69)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:107)\n\tat com.neopragma.java.pageobject.SeleniumWebDriver.startWebDriver(SeleniumWebDriver.java:74)\n\tat com.neopragma.java.pageobject.SeleniumWebDriver.webDriver(SeleniumWebDriver.java:50)\n\tat com.neopragma.java.pageobject.Page.webDriver(Page.java:50)\n\tat com.neopragma.java.pageobject.Page.navigateTo(Page.java:152)\n\tat com.neopragma.java.pageobject.Page.navigateTo(Page.java:144)\n\tat helloworld.cucumber.HelloWorldStepdefs.on_the_greetings_page(HelloWorldStepdefs.java:28)\n\tat ✽.Given I am on the Greetings page(helloworld/cucumber/helloworld.feature:30)\n"
});
formatter.match({
  "arguments": [
    {
      "val": "Russian",
      "offset": 16
    }
  ],
  "location": "HelloWorldStepdefs.the_language_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HelloWorldStepdefs.I_ask_it_to_say_hello()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "привет, мир",
      "offset": 16
    }
  ],
  "location": "HelloWorldStepdefs.the_greeting_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "id": "demo;display-localized-greetings;localized-greeting-is-displayed;6",
  "description": "",
  "name": "Display localized greetings",
  "keyword": "Scenario Outline",
  "line": 41,
  "type": "scenario"
});
formatter.step({
  "name": "I am on the Greetings page",
  "keyword": "Given ",
  "line": 30
});
formatter.step({
  "name": "the language is Japanese",
  "keyword": "And ",
  "line": 31,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "I ask it to say hello",
  "keyword": "When ",
  "line": 32
});
formatter.step({
  "name": "the greeting is こんにちは世界",
  "keyword": "Then ",
  "line": 33,
  "matchedColumns": [
    1
  ]
});
formatter.match({
  "location": "HelloWorldStepdefs.on_the_greetings_page()"
});
formatter.result({
  "duration": 308379,
  "status": "failed",
  "error_message": "java.lang.IllegalStateException: The path to the driver executable must be set by the webdriver.chrome.driver system property; for more information, see http://code.google.com/p/selenium/wiki/ChromeDriver. The latest version can be downloaded from http://code.google.com/p/chromedriver/downloads/list\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:176)\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:105)\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:69)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:107)\n\tat com.neopragma.java.pageobject.SeleniumWebDriver.startWebDriver(SeleniumWebDriver.java:74)\n\tat com.neopragma.java.pageobject.SeleniumWebDriver.webDriver(SeleniumWebDriver.java:50)\n\tat com.neopragma.java.pageobject.Page.webDriver(Page.java:50)\n\tat com.neopragma.java.pageobject.Page.navigateTo(Page.java:152)\n\tat com.neopragma.java.pageobject.Page.navigateTo(Page.java:144)\n\tat helloworld.cucumber.HelloWorldStepdefs.on_the_greetings_page(HelloWorldStepdefs.java:28)\n\tat ✽.Given I am on the Greetings page(helloworld/cucumber/helloworld.feature:30)\n"
});
formatter.match({
  "arguments": [
    {
      "val": "Japanese",
      "offset": 16
    }
  ],
  "location": "HelloWorldStepdefs.the_language_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HelloWorldStepdefs.I_ask_it_to_say_hello()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "こんにちは世界",
      "offset": 16
    }
  ],
  "location": "HelloWorldStepdefs.the_greeting_is(String)"
});
formatter.result({
  "status": "skipped"
});
});