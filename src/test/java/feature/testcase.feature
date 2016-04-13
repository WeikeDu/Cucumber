Feature: cucumber BDD test scenario
  @sign-in
  Scenario: Sign-in functional testing

    Given I navigate to the certain page
    When  I click the sign up button
    And I fill in the account and password
    | Fields    | Value       |
    | E-mail    | 15802881436 |
    | Password  | 19890104dwk |
    Then I go to a welcome page

  @buy
  Scenario: Purchase product functional testing

    Given I am at homepage
    When I search for a certain product "软件测试"
    And I click the product I want to purchase
    Then Page shows that the product has been added to your shopping cart
    And Delete the product in shopping cart

  @add-address
  Scenario: Add address functional testing

    Given I am at my account page
    When I click add a new address
    And I fill in the detail about the address info
    Then I click save my address
    And Delete the address
