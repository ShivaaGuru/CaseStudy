package Registration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Cucumber.CaseStudy.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class driver1
{
	   WebDriver driver; 
		@Given("User enters into TestMeApp Homepage")
		public void user_enters_into_TestMeApp_Homepage() {
			driver = Driver.getserver("chrome");
		    driver.get("http://10.232.237.143:443/TestMeApp/");
		    
		}

		@When("User clicks the signUp link")
		public void user_clicks_the_signUp_link() {
		    driver.findElement(By.linkText("SignUp")).click();
		}

		@Then("The Registration page will open")
		public void the_Registration_page_will_open() {
		  System.out.println("Registration page opened");
		}

		@Then("User enters the new UserName {string}")
		public void user_enters_the_new_UserName(String string) {
		    driver.findElement(By.id("userName")).sendKeys(string);
		}

		@Then("User enters the FirstName {string}")
		public void user_enters_the_FirstName(String string) {
		    driver.findElement(By.name("firstName")).sendKeys(string);
		}

		@Then("User enters the LastName {string}")
		public void user_enters_the_LastName(String string) {
		    driver.findElement(By.name("lastName")).sendKeys(string);
		}

		@Then("User enters the new password {string}")
		public void user_enters_the_new_password(String string) {
		     driver.findElement(By.id("password")).sendKeys(string);
		}

		@Then("User enter the new password for confirmation {string}")
		public void user_enter_the_new_password_for_confirmation(String string) {
		   driver.findElement(By.id("pass_confirmation")).sendKeys(string);
		}

		@Then("click the Gender option {string}")
		public void click_the_Gender_option(String string) {
		    driver.findElement(By.xpath("//*[@id='gender']")).click();
		}

		@Then("User enters the Email address {string}")
		public void user_enters_the_Email_address(String string) {
		    driver.findElement(By.id("emailAddress")).sendKeys(string);
		}

		@Then("User enters the Mobile Number {string}")
		public void user_enters_the_Mobile_Number(String string) {
		    driver.findElement(By.id("mobileNumber")).sendKeys(string);
		}

		@Then("User select the Date Of Birth {string}")
		public void user_select_the_Date_Of_Birth(String string) {
		     driver.findElement(By.name("dob")).sendKeys("10/14/1997");
		}

		@Then("User types the Address {string}")
		public void user_types_the_Address(String string) {
		    driver.findElement(By.id("address")).sendKeys(string);
		}

		@Then("User select the security question")
		public void user_select_the_security_question() {
		    Select question = new Select(driver.findElement(By.id("securityQuestion")));
			        question.selectByValue("411011");
		}

		@Then("User enters answer for security question {string}")
		public void user_enters_answer_for_security_question(String string) {
		    driver.findElement(By.id("answer")).sendKeys(string);
		}

		@When("User clicks the Registration button")
		public void user_clicks_the_Registration_button() {
		    driver.findElement(By.name("Submit")).click();
		}

		@Then("Registration will be succesfull")
		public void registration_will_be_succesfull() {
		   System.out.println("User registered successfully");
		}
}



