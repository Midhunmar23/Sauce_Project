package logintestscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pageclass.Loginpage;
import utility.Excelutility;

public class Logintestscript extends Base
{
	
	@Test
	  public void verifyThatTheUserShoudAbleToLogingTheAppliucationWithValidUserCrediatiolas() throws IOException
	  {
		  String username= Excelutility.getStringData(1, 0, "Login");
		  String password= Excelutility.getStringData(1, 1, "Login");
		  Loginpage logingpage= new Loginpage(driver);
		  logingpage.username(username);
		  logingpage.password(password);
		  logingpage.buttonClick();
		  
	  }

}
