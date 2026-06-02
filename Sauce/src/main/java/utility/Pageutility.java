package utility;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pageutility 
{
	
	public WebDriver driver;
	public Actions newactions;
	JavascriptExecutor js;
	
	
	public Pageutility (WebDriver driver) {
        this.driver = driver;
        this.newactions = new Actions(driver);
        this.js = (JavascriptExecutor) driver;
    }

	
	  
	  public void alertSimple(WebElement element)
	  {
		
	        driver.switchTo().alert().accept();
	  }
	  
	  
	  public void confirmationAlert(WebElement Element)
	  {
		  driver.switchTo().alert().dismiss();
	  }
	  
	  
	   
	   public void promtAlert(WebElement Element, String value)
	   {
		   driver.switchTo().alert().sendKeys(value);
		   driver.switchTo().alert().accept();
		   
	   }
	   
	   public void dagAndDrop(WebElement target, WebElement sorce)
	   {
		   newactions.dragAndDrop(sorce, target).perform();
	   }
	  
	   
	   public void javascriptExecutor(WebDriver driver) {
	        this.driver = driver;
	        this.js = (JavascriptExecutor) driver;
	    }
		
		public void scrollIntoView(String xpath) {
	        js.executeScript(
	            "document.evaluate(arguments[0], document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.scrollIntoView(true);",
	            xpath
	        );
	    }

	    public void scrollToBottom() {
	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    }
		
	  

}
