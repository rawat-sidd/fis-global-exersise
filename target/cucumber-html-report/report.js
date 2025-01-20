$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featureFiles/back-end.feature");
formatter.feature({
  "name": "Back-end tests",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@back-end"
    }
  ]
});
formatter.scenario({
  "name": "Coin Desk API",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@back-end"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User perform GET method for Coin Desk",
  "keyword": "Given "
});
formatter.match({
  "location": "API_Step.user_perform_GET_method()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "API response contains \"USD\" as currency",
  "keyword": "Then "
});
formatter.match({
  "location": "API_Step.currency_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "API response contains \"GBP\" as currency",
  "keyword": "Then "
});
formatter.match({
  "location": "API_Step.currency_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "API response contains \"EUR\" as currency",
  "keyword": "Then "
});
formatter.match({
  "location": "API_Step.currency_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The GBP description equals \"British Pound Sterling\"",
  "keyword": "Then "
});
formatter.match({
  "location": "API_Step.gbp_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/featureFiles/orders.feature");
formatter.feature({
  "name": "Validate order in Amazon",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@front-end"
    }
  ]
});
formatter.background({
  "name": "Open browser and navigate to Amazon place item in the shopping cart",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Amazon page",
  "keyword": "Given "
});
formatter.match({
  "location": "UI_OrdersStep.user_is_on_amazon_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Place item in the shopping cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@front-end"
    }
  ]
});
formatter.step({
  "name": "User search for \"book\" as search item",
  "keyword": "And "
});
formatter.match({
  "location": "UI_OrdersStep.search_item(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects the item to add cart",
  "keyword": "And "
});
formatter.match({
  "location": "UI_OrdersStep.clicks_button_to_add_item_in_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Add to cart icon",
  "keyword": "And "
});
formatter.match({
  "location": "UI_OrdersStep.user_clicks_on_shoping_cart_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the cart has been updated and displays the number of items in the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "UI_OrdersStep.should_be_visible_counter_yellow_badge_on_cart_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});