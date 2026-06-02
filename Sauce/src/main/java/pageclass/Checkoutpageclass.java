package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Pageutility;

public class Checkoutpageclass 
{
	
	    @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") WebElement addToCart;
	     @FindBy(xpath="//a[@class='shopping_cart_link']") WebElement cartclick;
	     @FindBy(xpath="//button[@id='checkout']") WebElement checkoutclick;
	     @FindBy(id="first-name") WebElement fristname;
	     @FindBy(id="last-name") WebElement Lastname;
	     @FindBy(name="postalCode") WebElement PostCode;
	     @FindBy(id="continue") WebElement continuebuttonclick;
	     @FindBy(xpath="//button[@id='finish' and @name='finish']") WebElement PuchaseButtonclick;
	     @FindBy(xpath="//h2[text()='Thank you for your order!']") WebElement orderPlacedMessageisDisplayed;
	     
	
	   public WebDriver driver;
	   
	
	
	   public Checkoutpageclass (WebDriver driver)
	   {
		  this.driver=driver;
		  PageFactory.initElements( driver, this);
	   }
	  
	   
	   
	      public void addToCart()
	      {
	    	  addToCart.click();
	      }
	       
	       public void cartClick()
	       {
	    	   cartclick.click();
	       }
	       
	       public void checkoutClick()
	       {
	    	   checkoutclick.click();
	       }
	       
	       
	       public void fristname(String firstname1)
	       {
	    	   fristname.sendKeys(firstname1);
	       }
	       
	       public void Lastname(String lastname1)
	       {
	    	   
	    	   Lastname.sendKeys(lastname1);
	       }
	       
	       
	       public void PostCode(String pin)
	       {
	    	   PostCode.sendKeys(pin);
	    	  
	    	  
	       }
	       
	       public void continuebuttonclick()
	       {
	    	   continuebuttonclick.click();
	       }
	       
	       public void PuchaseButtonclick()
	       {
	    	   PuchaseButtonclick.click();
	       }
	       
	     public boolean isOrderPlaced()
	     {
			return  orderPlacedMessageisDisplayed.isDisplayed();
	    	 
	     }
	       
	       
	       
	       
	    		   
   }


