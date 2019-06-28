package Cucumber.CaseStudy;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
	static WebDriver driver;
	public static WebDriver getserver(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.05.05\\Desktop\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("internet explorer"))
		{
			System.setProperty("webdriver.ie.driver","C:\\Users\\training_c2a.05.05\\Desktop\\SeleniumDrivers\\IEdriver.exe");
			  driver = new InternetExplorerDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\training_c2a.05.05\\Desktop\\SeleniumDrivers\\geckodriver.exe");
			  driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Invalid Browser");
		}
		return driver;
		
	}

}