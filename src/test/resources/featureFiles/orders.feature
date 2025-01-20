@front-end
Feature: Validate order in Amazon

Background: Open browser and navigate to Amazon place item in the shopping cart
Given User is on Amazon page

  Scenario: Place item in the shopping cart
    And User search for "book" as search item
	And User selects the item to add cart
    And User clicks on Add to cart icon
	Then Verify the cart has been updated and displays the number of items in the cart


