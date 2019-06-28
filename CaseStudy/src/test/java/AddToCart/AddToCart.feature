Feature: Add to Cart

  @tag1
  Scenario: Without Add to Cart option
  Given User logged into the TestMeApp
  And User searched for the product "HeadPhone"
  And User tried to purchase the item without clicking Add To Cart button
  Then Error shown because of invalid process
  
	@tag2
  Scenario: Proceed to the Payment page successfully
  Given User logged into the account
  And User searches the product in the TestMeApp "Headphone"
	And User clicks the Add To Cart button
	And Product added to the Cart
	And User clicks the Add to cart button
	And Checkout page is dispalyed
	When User clicks Checkout button
	Then The payment page is displayed
	And User clicks the proceed to pay button
	And Page redirected to the payment gateway
	And User clicks the Bank name for payment
	And User enters the Username
	And User enters the password for banking
	And User clicks the continue option
	And Transaction page is displayed
	And User enters the Transaction password
	When User clicks the Proceed button
	Then the order confirmed page displayed