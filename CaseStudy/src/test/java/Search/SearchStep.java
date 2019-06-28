package Search;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Cucumber.CaseStudy.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SearchStep {
	
	WebDriver driver;
	@Given("User enters into login page")
	public void user_enters_into_login_page() {
		driver=Driver.getserver("Chrome");
		  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@And("User enters the username {string}")
	public void user_enters_the_username(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
	}

	@And("User entersthe password {string}")
	public void user_entersthe_password(String string) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string);
	}

	@When("User clicks the Login Button")
	public void user_clicks_the_Login_Button() {
		   driver.findElement(By.name("Login")).click();
	}

	@Then("the homepage is displayed")
	public void the_homepage_is_displayed() {
	  System.out.println("Homepage displayed");
	}

	@And("User type the product name in search box {string}")
	public void user_type_the_product_name_in_search_box(String string) {
		driver.findElement(By.id("myInput")).sendKeys(string);
	}

	@When("User click the search button")
	public void user_click_the_search_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("the product page is displayed")
	public void the_product_page_is_displayed() {
		Assert.assertEquals(driver.getTitle(),"Search");
		System.out.println("Product displayed");
	}
}
