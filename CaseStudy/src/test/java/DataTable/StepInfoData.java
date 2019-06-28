package DataTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Cucumber.CaseStudy.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepInfoData {
	WebDriver driver;
	@Given("User enters into the TestMeApp LoginPage")
	public void user_enters_into_the_TestMeApp_LoginPage() {
		driver=Driver.getserver("Chrome");
		   driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}
	@Then("Login page is displayed")
	public void login_page_is_displayed() {
	    System.out.println("Signin page displayed");
	}

	@And("User enters username {string}")
	public void user_enters(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
	}

	@And("User enter the password {string}")
	public void user_enter_the_password(String string) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string);
	}
	@When("User click the login button")
	public void user_click_the_login_button() {
		driver.findElement(By.name("Login")).click();
	}

	@Then("User logged in and Home page is displayed")
	public void user_logged_in_and_Home_page_is_displayed() {
	    System.out.println("User logged in successfully");
	}

}
