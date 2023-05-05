package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	
	public static String getdatafromexcel (int rownum , int clmun) throws IOException
	{
		
		FileInputStream myfile = new FileInputStream("C:\\Users\\mohsinp\\Desktop\\Talent Pool\\Excel_Reading.xlsx");
		Sheet sh = WorkbookFactory.create(myfile).getSheet("sheet1");
		String value =sh.getRow(rownum).getCell(clmun).getStringCellValue();
		return value;
	
	}
	
	public static void capturescrensht(WebDriver driver , int TCID) throws IOException
	{
		//File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
	// File dest = new File ("C:\\Users\\mohsinp\\Desktop\\Automation testing screenshots\\TestID"+TCID+".png");
	 
	// FileHandler.copy(src, dest);
	 
		
	}
	
}
