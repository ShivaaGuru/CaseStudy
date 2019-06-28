
Feature: Search for products

  Scenario: finding product for purchase
  Given User enters into login page
  And User enters the username "Lalitha"
  And User entersthe password "password123"
  When User clicks the Login Button
  Then the homepage is displayed
  And User type the product name in search box "Headphone"
  And User click the search button
  Then the product page is displayed