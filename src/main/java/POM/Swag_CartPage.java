package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swag_CartPage
{
	
	@FindBy (xpath = "//div[text()=\"Sauce Labs Fleece Jacket\"]") private WebElement product;
	@FindBy (xpath = "//div[@class=\"inventory_item_price\"]") private WebElement itemvalue;
	@FindBy (xpath = "inventory_item_price") private WebElement itemprice;
	
	                 

    public Swag_CartPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	}

    
    public String getmsage()
    {
    	String actualmsg = product.getText();
    			return actualmsg;
    
    }
    
    public String getprice()
    {
    	String actualvlue = itemprice.getText();
		return actualvlue;
    }
    
   
   

   

}
