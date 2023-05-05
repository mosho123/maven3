package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass 
{
	
	protected WebDriver driver;
	
	public void browserinitialisation() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chrom file\\chromedriver.exe\\");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--ignore--errors");
		driver = new ChromeDriver(options);
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	 }
	
	
	
	
		
	
	
	
	

}
