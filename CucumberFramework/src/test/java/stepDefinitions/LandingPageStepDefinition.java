package stepDefinitions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import Utils.TestSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;


public class LandingPageStepDefinition {
	public WebDriver driver;
	public String landingPageproductname;
	public String offerPageproductname;
	TestSetup setup;
	public LandingPageStepDefinition(TestSetup setup ) {
		
		this.setup = setup;
		
	}
	
	@Given("User is on Greenkart landing page")
	public void user_is_on_greenkart_landing_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        setup.driver = new ChromeDriver(option);
        setup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	
	
	
	@When("User searched with short name {string} and extract actual name of the product")
	public void user_searched_with_short_name_and_extract_actual_name_of_the_product(String shortName) throws InterruptedException {
	    
		LandingPage landingPage = setup.pageobjectManager.getLandingPage();
		landingPage.searchItem(shortName);
		Thread.sleep(2000);
		setup.landingPageproductname = landingPage.getProductName().split("-")[0].trim();
		System.out.println(landingPageproductname+" is extracted successfully");
	}
	
	
	

}
