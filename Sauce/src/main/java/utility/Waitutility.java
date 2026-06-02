package utility;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitutility 
{
	
	  public static final int IMPICITWAIT=5;
	  public static final int EXPLESITWAIT=10;
	  public static final int FUENTWAIT= 15;
	  public static final int POLLWAIT=5;
	  
	  
	     public void elementToBeClicable(WebDriver driver, WebElement Element )
	     {
	    	 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(EXPLESITWAIT));
	    	 wait.until(ExpectedConditions.elementToBeClickable(Element));
	     }
	     
	     
	     public void alertIsPresent(WebDriver driver)
	     {
	    	 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(EXPLESITWAIT));
	    	 wait.until(ExpectedConditions.alertIsPresent());
	    	 
	     }
	     
	     
	     public void  elementToBeClickable(WebDriver driver, WebElement element)
	     {
	    	 Wait<WebDriver> fuentwait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(FUENTWAIT))
	    			 .pollingEvery(Duration.ofSeconds(POLLWAIT)).ignoring(NoSuchElementException.class);
	    	 fuentwait.until(ExpectedConditions.elementToBeClickable(element));
	    	
	     }
	     
	     
	     
	   
	  
	  
	  
	  
	    

}
