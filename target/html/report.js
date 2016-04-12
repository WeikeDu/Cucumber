$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testcase.feature");
formatter.feature({
  "line": 1,
  "name": "cucumber BDD test scenario",
  "description": "",
  "id": "cucumber-bdd-test-scenario",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Sign-in functional testing",
  "description": "",
  "id": "cucumber-bdd-test-scenario;sign-in-functional-testing",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@sign-in"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I navigate to the certain page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click the sign up button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I fill in the account and password",
  "rows": [
    {
      "cells": [
        "Fields",
        "Value"
      ],
      "line": 8
    },
    {
      "cells": [
        "E-mail",
        "15802881436"
      ],
      "line": 9
    },
    {
      "cells": [
        "Password",
        "19890104dwk"
      ],
      "line": 10
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I go to a welcome page",
  "keyword": "Then "
});
formatter.match({
  "location": "TestStepsDefs.iNavigateToTheCertainPage()"
});
formatter.result({
  "duration": 10590254492,
  "status": "passed"
});
formatter.match({
  "location": "TestStepsDefs.iClickTheSignUpButton()"
});
formatter.result({
  "duration": 816680736,
  "status": "passed"
});
formatter.match({
  "location": "TestStepsDefs.iFillInTheAccountAndPassword(DataTable)"
});
formatter.result({
  "duration": 2305379874,
  "status": "passed"
});
formatter.match({
  "location": "TestStepsDefs.iGoToAWelcomePage()"
});
formatter.result({
  "duration": 50044403,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Purchase product functional testing",
  "description": "",
  "id": "cucumber-bdd-test-scenario;purchase-product-functional-testing",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@buy"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I am at homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I search for a certain product \"软件测试\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I click the product I want to purchase",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Page shows that the product has been added to your shopping cart",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Delete the product in shopping cart",
  "keyword": "And "
});
formatter.match({
  "location": "TestStepsDefs.iAmAtHomepage()"
});
formatter.result({
  "duration": 1982768280,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "软件测试",
      "offset": 32
    }
  ],
  "location": "TestStepsDefs.iSearchForACertainProduct(String)"
});
formatter.result({
  "duration": 1693062708,
  "status": "passed"
});
formatter.match({
  "location": "TestStepsDefs.iClickTheProductIWantToPurchase()"
});
formatter.result({
  "duration": 8796625304,
  "status": "passed"
});
formatter.match({
  "location": "TestStepsDefs.pageShowsThatTheProductHasBeenAddedToYourShoppingCart()"
});
formatter.result({
  "duration": 29211138,
  "status": "passed"
});
formatter.match({
  "location": "TestStepsDefs.deleteTheProductInShoppingCart()"
});
formatter.result({
  "duration": 2279788862,
  "status": "passed"
});
});