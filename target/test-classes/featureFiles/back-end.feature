@back-end
Feature: Back-end tests

Scenario: Coin Desk API
	Given User perform GET method for Coin Desk
    Then API response contains "USD" as currency
    Then API response contains "GBP" as currency
    Then API response contains "EUR" as currency
    Then The GBP description equals "British Pound Sterling"
