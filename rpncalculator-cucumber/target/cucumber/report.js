$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("calc/web/sample/cucumber/rpncalculator.feature");
formatter.feature({
  "id": "as-a-person-who-likes-numbers,",
  "description": "I want a Reverse Polish Notation calculator \nso that I can perform arithmetic operations.",
  "name": "As a person who likes numbers,",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "as-a-person-who-likes-numbers,;the-welcome-message-is-displayed",
  "description": "",
  "name": "The welcome message is displayed",
  "keyword": "Scenario",
  "line": 5,
  "type": "scenario"
});
formatter.step({
  "name": "I am on the RPN Calculator page",
  "keyword": "Given ",
  "line": 6
});
formatter.step({
  "name": "the welcome message reads \"Welcome to the Java RPN calculator\"",
  "keyword": "Then ",
  "line": 7
});
formatter.match({
  "location": "RpnCalculatorStepdefs.on_the_greetings_page()"
});
formatter.result({
  "duration": 2693109382,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome to the Java RPN calculator",
      "offset": 27
    }
  ],
  "location": "RpnCalculatorStepdefs.the_welcome_message_reads(String)"
});
formatter.result({
  "duration": 67554759,
  "status": "passed"
});
formatter.scenario({
  "id": "as-a-person-who-likes-numbers,;adding-two-integers",
  "description": "",
  "name": "Adding two integers",
  "keyword": "Scenario",
  "line": 9,
  "type": "scenario"
});
formatter.step({
  "name": "I enter \"5 3 +\"",
  "keyword": "Given ",
  "line": 10
});
formatter.step({
  "name": "I get the result",
  "keyword": "When ",
  "line": 11
});
formatter.step({
  "name": "the calculator returns \"8\"",
  "keyword": "Then ",
  "line": 12
});
formatter.match({
  "arguments": [
    {
      "val": "5 3 +",
      "offset": 9
    }
  ],
  "location": "RpnCalculatorStepdefs.enter_tokens(String)"
});
formatter.result({
  "duration": 178297265,
  "status": "passed"
});
formatter.match({
  "location": "RpnCalculatorStepdefs.get_result()"
});
formatter.result({
  "duration": 180341289,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 24
    }
  ],
  "location": "RpnCalculatorStepdefs.assert_returned_value(String)"
});
formatter.result({
  "duration": 87142415,
  "status": "failed",
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[8]\u003e but was:\u003c[call the rpncalculator here]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat calc.web.sample.cucumber.RpnCalculatorStepdefs.assert_returned_value(RpnCalculatorStepdefs.java:52)\n\tat ✽.Then the calculator returns \"8\"(calc/web/sample/cucumber/rpncalculator.feature:12)\n"
});
formatter.scenario({
  "id": "as-a-person-who-likes-numbers,;subtracting-two-integers",
  "description": "",
  "name": "Subtracting two integers",
  "keyword": "Scenario",
  "line": 15,
  "type": "scenario"
});
formatter.step({
  "name": "I enter \"5 3 -\"",
  "keyword": "Given ",
  "line": 16
});
formatter.step({
  "name": "I get the result",
  "keyword": "When ",
  "line": 17
});
formatter.step({
  "name": "the calculator returns \"2\"",
  "keyword": "Then ",
  "line": 18
});
formatter.match({
  "arguments": [
    {
      "val": "5 3 -",
      "offset": 9
    }
  ],
  "location": "RpnCalculatorStepdefs.enter_tokens(String)"
});
formatter.result({
  "duration": 167547287,
  "status": "passed"
});
formatter.match({
  "location": "RpnCalculatorStepdefs.get_result()"
});
formatter.result({
  "duration": 166486128,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 24
    }
  ],
  "location": "RpnCalculatorStepdefs.assert_returned_value(String)"
});
formatter.result({
  "duration": 68500772,
  "status": "failed",
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[2]\u003e but was:\u003c[call the rpncalculator here]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat calc.web.sample.cucumber.RpnCalculatorStepdefs.assert_returned_value(RpnCalculatorStepdefs.java:52)\n\tat ✽.Then the calculator returns \"2\"(calc/web/sample/cucumber/rpncalculator.feature:18)\n"
});
formatter.scenario({
  "id": "as-a-person-who-likes-numbers,;multiplying-two-integers",
  "description": "",
  "name": "Multiplying two integers",
  "keyword": "Scenario",
  "line": 20,
  "type": "scenario"
});
formatter.step({
  "name": "I enter \"5 3 *\"",
  "keyword": "Given ",
  "line": 21
});
formatter.step({
  "name": "I get the result",
  "keyword": "When ",
  "line": 22
});
formatter.step({
  "name": "the calculator returns \"15\"",
  "keyword": "Then ",
  "line": 23
});
formatter.match({
  "arguments": [
    {
      "val": "5 3 *",
      "offset": 9
    }
  ],
  "location": "RpnCalculatorStepdefs.enter_tokens(String)"
});
formatter.result({
  "duration": 158534118,
  "status": "passed"
});
formatter.match({
  "location": "RpnCalculatorStepdefs.get_result()"
});
formatter.result({
  "duration": 136416613,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "15",
      "offset": 24
    }
  ],
  "location": "RpnCalculatorStepdefs.assert_returned_value(String)"
});
formatter.result({
  "duration": 56121129,
  "status": "failed",
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[15]\u003e but was:\u003c[call the rpncalculator here]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat calc.web.sample.cucumber.RpnCalculatorStepdefs.assert_returned_value(RpnCalculatorStepdefs.java:52)\n\tat ✽.Then the calculator returns \"15\"(calc/web/sample/cucumber/rpncalculator.feature:23)\n"
});
formatter.scenario({
  "id": "as-a-person-who-likes-numbers,;dividing-two-integers",
  "description": "",
  "name": "Dividing two integers",
  "keyword": "Scenario",
  "line": 25,
  "type": "scenario"
});
formatter.step({
  "name": "I enter \"54 13 /\"",
  "keyword": "Given ",
  "line": 26
});
formatter.step({
  "name": "I get the result",
  "keyword": "When ",
  "line": 27
});
formatter.step({
  "name": "the calculator returns \"4\" plus or minus \"0.5\"",
  "keyword": "Then ",
  "line": 28
});
formatter.match({
  "arguments": [
    {
      "val": "54 13 /",
      "offset": 9
    }
  ],
  "location": "RpnCalculatorStepdefs.enter_tokens(String)"
});
formatter.result({
  "duration": 164625284,
  "status": "passed"
});
formatter.match({
  "location": "RpnCalculatorStepdefs.get_result()"
});
formatter.result({
  "duration": 136973032,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "as-a-person-who-likes-numbers,;modulus",
  "description": "",
  "name": "Modulus",
  "keyword": "Scenario",
  "line": 30,
  "type": "scenario"
});
formatter.step({
  "name": "I enter \"54 13 %\"",
  "keyword": "Given ",
  "line": 31
});
formatter.step({
  "name": "I get the result",
  "keyword": "When ",
  "line": 32
});
formatter.step({
  "name": "the calculator returns \"2\"",
  "keyword": "Then ",
  "line": 33
});
formatter.match({
  "arguments": [
    {
      "val": "54 13 %",
      "offset": 9
    }
  ],
  "location": "RpnCalculatorStepdefs.enter_tokens(String)"
});
formatter.result({
  "duration": 319500710,
  "status": "passed"
});
formatter.match({
  "location": "RpnCalculatorStepdefs.get_result()"
});
formatter.result({
  "duration": 126311029,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 24
    }
  ],
  "location": "RpnCalculatorStepdefs.assert_returned_value(String)"
});
formatter.result({
  "duration": 57670333,
  "status": "failed",
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[2]\u003e but was:\u003c[call the rpncalculator here]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat calc.web.sample.cucumber.RpnCalculatorStepdefs.assert_returned_value(RpnCalculatorStepdefs.java:52)\n\tat ✽.Then the calculator returns \"2\"(calc/web/sample/cucumber/rpncalculator.feature:33)\n"
});
formatter.scenario({
  "id": "as-a-person-who-likes-numbers,;exponentiation",
  "description": "",
  "name": "Exponentiation",
  "keyword": "Scenario",
  "line": 35,
  "type": "scenario"
});
formatter.step({
  "name": "I enter \"4 3 ^\"",
  "keyword": "Given ",
  "line": 36
});
formatter.step({
  "name": "I get the result",
  "keyword": "When ",
  "line": 37
});
formatter.step({
  "name": "the calculator returns \"64\"",
  "keyword": "Then ",
  "line": 38
});
formatter.match({
  "arguments": [
    {
      "val": "4 3 ^",
      "offset": 9
    }
  ],
  "location": "RpnCalculatorStepdefs.enter_tokens(String)"
});
formatter.result({
  "duration": 146950889,
  "status": "passed"
});
formatter.match({
  "location": "RpnCalculatorStepdefs.get_result()"
});
formatter.result({
  "duration": 129814576,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "64",
      "offset": 24
    }
  ],
  "location": "RpnCalculatorStepdefs.assert_returned_value(String)"
});
formatter.result({
  "duration": 68049494,
  "status": "failed",
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[64]\u003e but was:\u003c[call the rpncalculator here]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat calc.web.sample.cucumber.RpnCalculatorStepdefs.assert_returned_value(RpnCalculatorStepdefs.java:52)\n\tat ✽.Then the calculator returns \"64\"(calc/web/sample/cucumber/rpncalculator.feature:38)\n"
});
formatter.scenario({
  "id": "as-a-person-who-likes-numbers,;adding-two-real-numbers",
  "description": "",
  "name": "Adding two real numbers",
  "keyword": "Scenario",
  "line": 40,
  "type": "scenario"
});
formatter.step({
  "name": "I enter \"5.3 3.6 +\"",
  "keyword": "Given ",
  "line": 41
});
formatter.step({
  "name": "I get the result",
  "keyword": "When ",
  "line": 42
});
formatter.step({
  "name": "the calculator returns \"8.9\"",
  "keyword": "Then ",
  "line": 43
});
formatter.match({
  "arguments": [
    {
      "val": "5.3 3.6 +",
      "offset": 9
    }
  ],
  "location": "RpnCalculatorStepdefs.enter_tokens(String)"
});
formatter.result({
  "duration": 185010141,
  "status": "passed"
});
formatter.match({
  "location": "RpnCalculatorStepdefs.get_result()"
});
formatter.result({
  "duration": 143597496,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8.9",
      "offset": 24
    }
  ],
  "location": "RpnCalculatorStepdefs.assert_returned_value(String)"
});
formatter.result({
  "duration": 74440729,
  "status": "failed",
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[8.9]\u003e but was:\u003c[call the rpncalculator here]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat calc.web.sample.cucumber.RpnCalculatorStepdefs.assert_returned_value(RpnCalculatorStepdefs.java:52)\n\tat ✽.Then the calculator returns \"8.9\"(calc/web/sample/cucumber/rpncalculator.feature:43)\n"
});
formatter.scenario({
  "id": "as-a-person-who-likes-numbers,;subtracting-two-real-numbers",
  "description": "",
  "name": "Subtracting two real numbers",
  "keyword": "Scenario",
  "line": 45,
  "type": "scenario"
});
formatter.step({
  "name": "I enter \"5.3 3.6 -\"",
  "keyword": "Given ",
  "line": 46
});
formatter.step({
  "name": "I get the result",
  "keyword": "When ",
  "line": 47
});
formatter.step({
  "name": "the calculator returns \"1.7\"",
  "keyword": "Then ",
  "line": 48
});
formatter.match({
  "arguments": [
    {
      "val": "5.3 3.6 -",
      "offset": 9
    }
  ],
  "location": "RpnCalculatorStepdefs.enter_tokens(String)"
});
formatter.result({
  "duration": 287366327,
  "status": "passed"
});
formatter.match({
  "location": "RpnCalculatorStepdefs.get_result()"
});
formatter.result({
  "duration": 135665330,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1.7",
      "offset": 24
    }
  ],
  "location": "RpnCalculatorStepdefs.assert_returned_value(String)"
});
formatter.result({
  "duration": 74852072,
  "status": "failed",
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[1.7]\u003e but was:\u003c[call the rpncalculator here]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat calc.web.sample.cucumber.RpnCalculatorStepdefs.assert_returned_value(RpnCalculatorStepdefs.java:52)\n\tat ✽.Then the calculator returns \"1.7\"(calc/web/sample/cucumber/rpncalculator.feature:48)\n"
});
formatter.scenario({
  "id": "as-a-person-who-likes-numbers,;multiplying-two-real-numbers",
  "description": "",
  "name": "Multiplying two real numbers",
  "keyword": "Scenario",
  "line": 50,
  "type": "scenario"
});
formatter.step({
  "name": "I enter \"5.3 3.6 *\"",
  "keyword": "Given ",
  "line": 51
});
formatter.step({
  "name": "I get the result",
  "keyword": "When ",
  "line": 52
});
formatter.step({
  "name": "the calculator returns \"19.08\"",
  "keyword": "Then ",
  "line": 53
});
formatter.match({
  "arguments": [
    {
      "val": "5.3 3.6 *",
      "offset": 9
    }
  ],
  "location": "RpnCalculatorStepdefs.enter_tokens(String)"
});
formatter.result({
  "duration": 293779717,
  "status": "passed"
});
formatter.match({
  "location": "RpnCalculatorStepdefs.get_result()"
});
formatter.result({
  "duration": 127045577,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "19.08",
      "offset": 24
    }
  ],
  "location": "RpnCalculatorStepdefs.assert_returned_value(String)"
});
formatter.result({
  "duration": 69260846,
  "status": "failed",
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[19.08]\u003e but was:\u003c[call the rpncalculator here]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat calc.web.sample.cucumber.RpnCalculatorStepdefs.assert_returned_value(RpnCalculatorStepdefs.java:52)\n\tat ✽.Then the calculator returns \"19.08\"(calc/web/sample/cucumber/rpncalculator.feature:53)\n"
});
formatter.scenario({
  "id": "as-a-person-who-likes-numbers,;dividing-two-real-numbers",
  "description": "",
  "name": "Dividing two real numbers",
  "keyword": "Scenario",
  "line": 55,
  "type": "scenario"
});
formatter.step({
  "name": "I enter \"54.75 13.6 /\"",
  "keyword": "Given ",
  "line": 56
});
formatter.step({
  "name": "I get the result",
  "keyword": "When ",
  "line": 57
});
formatter.step({
  "name": "the calculator returns \"4.0257\" plus or minus \"0.0005\"",
  "keyword": "Then ",
  "line": 58
});
formatter.match({
  "arguments": [
    {
      "val": "54.75 13.6 /",
      "offset": 9
    }
  ],
  "location": "RpnCalculatorStepdefs.enter_tokens(String)"
});
formatter.result({
  "duration": 327401651,
  "status": "passed"
});
formatter.match({
  "location": "RpnCalculatorStepdefs.get_result()"
});
formatter.result({
  "duration": 123278283,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "as-a-person-who-likes-numbers,;exponentiation---real-number",
  "description": "",
  "name": "Exponentiation - real number",
  "keyword": "Scenario",
  "line": 60,
  "type": "scenario"
});
formatter.step({
  "name": "I enter \"5.5 3 ^\"",
  "keyword": "Given ",
  "line": 61
});
formatter.step({
  "name": "I get the result",
  "keyword": "When ",
  "line": 62
});
formatter.step({
  "name": "the calculator returns \"166.375\" plus or minus \"0.0005\"",
  "keyword": "Then ",
  "line": 63
});
formatter.match({
  "arguments": [
    {
      "val": "5.5 3 ^",
      "offset": 9
    }
  ],
  "location": "RpnCalculatorStepdefs.enter_tokens(String)"
});
formatter.result({
  "duration": 301815128,
  "status": "passed"
});
formatter.match({
  "location": "RpnCalculatorStepdefs.get_result()"
});
formatter.result({
  "duration": 117163484,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "as-a-person-who-likes-numbers,;clearing-memory",
  "description": "",
  "name": "Clearing memory",
  "keyword": "Scenario",
  "line": 65,
  "type": "scenario"
});
formatter.step({
  "name": "I enter \"2\"",
  "keyword": "Given ",
  "line": 66
});
formatter.step({
  "name": "I get the result",
  "keyword": "When ",
  "line": 67
});
formatter.step({
  "name": "the calculator returns \"2\"",
  "keyword": "Then ",
  "line": 68
});
formatter.step({
  "name": "I enter \"4 5 c\"",
  "keyword": "Given ",
  "line": 70
});
formatter.step({
  "name": "I get the result",
  "keyword": "When ",
  "line": 71
});
formatter.step({
  "name": "the calculator returns \"\"",
  "keyword": "Then ",
  "line": 72
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 9
    }
  ],
  "location": "RpnCalculatorStepdefs.enter_tokens(String)"
});
formatter.result({
  "duration": 132655105,
  "status": "passed"
});
formatter.match({
  "location": "RpnCalculatorStepdefs.get_result()"
});
formatter.result({
  "duration": 116417728,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 24
    }
  ],
  "location": "RpnCalculatorStepdefs.assert_returned_value(String)"
});
formatter.result({
  "duration": 61918655,
  "status": "failed",
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[2]\u003e but was:\u003c[call the rpncalculator here]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat calc.web.sample.cucumber.RpnCalculatorStepdefs.assert_returned_value(RpnCalculatorStepdefs.java:52)\n\tat ✽.Then the calculator returns \"2\"(calc/web/sample/cucumber/rpncalculator.feature:68)\n"
});
formatter.match({
  "arguments": [
    {
      "val": "4 5 c",
      "offset": 9
    }
  ],
  "location": "RpnCalculatorStepdefs.enter_tokens(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RpnCalculatorStepdefs.get_result()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 24
    }
  ],
  "location": "RpnCalculatorStepdefs.assert_returned_value(String)"
});
formatter.result({
  "status": "skipped"
});
});