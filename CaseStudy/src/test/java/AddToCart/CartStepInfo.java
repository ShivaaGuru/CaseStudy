package AddToCart;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Cucumber.CaseStudy.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CartStepInfo {
	WebDriver driver;
	@Given("User logged into the TestMeApp")
	public void user_logged_into_the_TestMeApp() {
		driver=Driver.getserver("Chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		driver.manage().window().maximize();
		driver.findElement( By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password123");
		driver.findElement(By.name("Login")).click();
		Assert.assertEquals(driver.getTitle(),"Home");
	}

	@And("User searched for the product {string}")
	public void user_searched_for_the_product(String string) {
		driver.findElement(By.id("myInput")).sendKeys(string);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@When("User tried to purchase the item without clicking Add To Cart button")
	public void user_tried_to_purchase_the_item_without_clicking_Add_To_Cart_button() {
	    System.out.println("Tried to purchase item without clickiing Add to cart");
	}

	@Then("Error shown because of invalid process")
	public void error_shown_because_of_invalid_process() {
	    Assert.assertEquals(driver.getTitle(), "View Cart");
	    System.out.println("Error loading the page without clicking Add to cart");
	}

	@Given("User logged into the account")
	public void user_logged_into_the_account() {
		driver=Driver.getserver("Chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		driver.manage().window().maximize();
		driver.findElement( By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password123");
		driver.findElement(By.name("Login")).click();
		Assert.assertEquals(driver.getTitle(),"Home");
	}

	@And("User searches the product in the TestMeApp {string}")
	public void user_searches_the_product_in_the_TestMeApp(String string) {
		driver.findElement(By.id("myInput")).sendKeys(string);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Assert.assertEquals(driver.getTitle(),"Search");
	}

	@And("User clicks the Add To Cart button")
	public void user_clicks_the_Add_To_Cart_button() {
		driver.findElement(By.xpath("//html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		String cartNo=driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]/b")).getText();
		System.out.println(cartNo);
		Assert.assertEquals("1",cartNo);
	}

	@And("Product added to the Cart")
	public void product_added_to_the_Cart() {
	    System.out.println("Product successfully added to the cart");
	}

	@And("User clicks the Add to cart button")
	public void user_clicks_the_Add_to_cart_button() {
		
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]/b")).click();
		
		
	}

	@And("Checkout page is dispalyed")
	public void checkout_page_is_dispalyed() {
	   System.out.println("Checkout page displayed");
	}

	@When("User clicks Checkout button")
	public void user_clicks_Checkout_button() {
		driver.findElement(By.xpath("//*[@id='cart']/tfoot/tr[2]/td[5]/a")).click();
		
	}

	@Then("The payment page is displayed")
	public void the_payment_page_is_displayed() {
		System.out.println("Payment page displayed");
	}

	@And("User clicks the proceed to pay button")
	public void user_clicks_the_proceed_to_pay_button() {
		driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	}

	@And("Page redirected to the payment gateway")
	public void page_redirected_to_the_payment_gateway() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h3")));
	}

	@And("User clicks the Bank name for payment")
	public void user_clicks_the_Bank_name_for_payment() {
		driver.findElement(By.xpath("//*[@id='swit']/div[1]/div/label")).click(); 
		driver.findElement(By.id("btn")).click();
		Assert.assertEquals(driver.getTitle(), "Payment Gateway");
	}
	@And("User enters the Username")
	public void user_enters_the_Username() {
		driver.findElement(By.name("username")).sendKeys("123456");
	}

	@And("User enters the password for banking")
	public void user_enters_the_password_for_banking() {
		driver.findElement(By.name("password")).sendKeys("Pass@456");
	}

	@And("User clicks the continue option")
	public void user_clicks_the_continue_option() {
		driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	}

	@And("Transaction page is displayed")
	public void transaction_page_is_displayed() {
	    System.out.println("Transaction page is displayed");
	}

	@And("User enters the Transaction password")
	public void user_enters_the_Transaction_password() {
		driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
		
	}

	@When("User clicks the Proceed button")
	public void user_clicks_the_Proceed_button() {
		driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	}

	@Then("the order confirmed page displayed")
	public void the_order_confirmed_page_displayed() {
		Assert.assertEquals(driver.getTitle(), "Order Details");
		System.out.println("Order Confirmed");
	}
}
