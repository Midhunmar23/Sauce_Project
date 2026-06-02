package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	
	@FindBy(xpath="//input[@id='user-name']") WebElement username;
	@FindBy(xpath="//input[@id='password']") WebElement password;
	@FindBy(xpath=("//input[@id='login-button']")) WebElement loginbuttonclick;
	
	
	public WebDriver driver;
	
	 public Loginpage (WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
	 }
	 
	 public void username(String username1)
	 {
		username.sendKeys(username1);
	 }
	 
	 public void password(String password1)
	 {
		password.sendKeys(password1);
	 }
	 
	 public void buttonClick()
	 {
		 loginbuttonclick.click();
	 }
	
	 

}
