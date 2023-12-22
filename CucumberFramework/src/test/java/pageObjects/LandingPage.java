package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	private By search = By.cssSelector("input[type='search']");
	private By productName = By.cssSelector("h4.product-name");
	private By topDeals = By.cssSelector("a[href='#/offers']");

	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public String getProductName()
	{
		return driver.findElement(productName).getText();
	}
	
	public void selectTopDealsPage ()
	{
		driver.findElement(topDeals).click();
	}
}
