package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swag_HomePage 
{
	
	
	@FindBy (xpath = "//option [text()=\"Price (high to low)\"]")private WebElement pricelistclick;
	@FindBy (xpath = "(//div[@class=\"inventory_item_name\"])[1]")private WebElement soucelabclick;
	@FindBy (id = "add-to-cart-sauce-labs-fleece-jacket")private WebElement addtocrtclick;
	@FindBy (xpath = "//a[@class=\"shopping_cart_link\"]")private WebElement orderclick;
	
	
	public Swag_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void prslstclk() throws InterruptedException
	{
		Thread.sleep(1000);
		pricelistclick.click();
	}
	
	
	public void soulabclk() throws InterruptedException
	{
		Thread.sleep(1000);
		soucelabclick.click();	
	}
	
	public void adcrtclk() throws InterruptedException
	{
		Thread.sleep(1000);
		addtocrtclick.click();
	}
	
	
	public void ordclk()
	{
		orderclick.click();
	}
	


}
