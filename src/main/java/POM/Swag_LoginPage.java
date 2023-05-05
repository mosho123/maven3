package POM;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swag_LoginPage 
{
	
	
	@FindBy (id="user-name") private WebElement UserName;
	@FindBy (id="password") private WebElement Password;
	@FindBy (id="login-button") private WebElement LoginButtonClick;
	
	
	public Swag_LoginPage(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);	
	}
	
	public void enterusername(String nameuser)
	{
		UserName.sendKeys (nameuser);
	}
	
	public void enterpass(String pass)
	{
		Password.sendKeys(pass);
	}
	
	
	
	public void buttonclick()
	{
	
		LoginButtonClick.click();
		
	}
	
	
	
	
	

}
