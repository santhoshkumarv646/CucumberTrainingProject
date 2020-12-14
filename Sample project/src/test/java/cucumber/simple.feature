@Simple
Feature: CucumberJava

@Tag9
Scenario Outline: Check if String is Palindrome
  Given I entered word <wordToTest>
#  When I test it for Palindrome
#  Then the output should be <output>
  Examples:
    | wordToTest                   | output  |
    | Deposit(BREF) - Finance      | "true"  |
