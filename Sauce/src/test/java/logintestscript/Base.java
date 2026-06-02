package logintestscript;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utility.Screenshotutilities;
import utility.Waitutility;

public class Base 
{
	
	
	   public WebDriver driver;
	   
	   
	   @Parameters("browser")
	   @BeforeMethod
	  
	   
	     public void intilaizeBrowser(String browser) throws Exception
	     {
		   
		   if(browser.equalsIgnoreCase("Chrome"))
		   {
			   driver = new ChromeDriver();
		   }
		   
		   else if(browser.equalsIgnoreCase("Firefox"))
		   {
			   driver= new FirefoxDriver();
		   }
		   
		   else
		   {
			   throw new Exception("Not connected");
		   }
		   
		   
	    	 driver.get("https://www.saucedemo.com/");
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Waitutility.IMPICITWAIT));
	    	 driver.manage().window().maximize();
	    	 
	     }
	   
	   @AfterMethod (alwaysRun = true)
		public void closeBrowser(ITestResult iTestResult) throws IOException
		{
			
			{if (iTestResult.getStatus() == ITestResult.FAILURE) 
			{
				Screenshotutilities scrshot = new Screenshotutilities();
				scrshot.getScreenshot(driver, iTestResult.getName());

			  }
			}
		}
	   
	   
	   

}
