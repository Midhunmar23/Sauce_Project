package logintestscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pageclass.Checkoutpageclass;
import pageclass.Loginpage;
import utility.Excelutility;

public class Checkouttestclass extends Base
{
	
	@Test(groups="SmokeTest", description="verifyThatTheUserShouldAbleToParchaseaproduct")
	public void verifyThatTheUserShouldAbleToParchaseaproduct() throws IOException
	{
		
		   String username= Excelutility.getStringData(1, 0, "Login");
		   String password= Excelutility.getStringData(1, 1, "Login");
		   
		    Loginpage loginpage=new Loginpage(driver);
		    loginpage.username(username);
		    loginpage.password(password);
		    loginpage.buttonClick();
		    
		    
		    Checkoutpageclass checkoutpageclass= new Checkoutpageclass(driver);
		    checkoutpageclass.addToCart();
		    checkoutpageclass.cartClick();
		    checkoutpageclass.checkoutClick();
		    
		    String Firstname= Excelutility.getStringData(0,0, "UserData");
		    String Lastname= Excelutility.getStringData(1, 0, "UserData");
		    String Pincode= Excelutility.getIntegerData(2, 0, "UserData");
		    
		    checkoutpageclass.fristname(Firstname);
		    checkoutpageclass.Lastname(Lastname);
		    checkoutpageclass.PostCode(Pincode);
		    
		    checkoutpageclass.continuebuttonclick();
		    checkoutpageclass.PuchaseButtonclick();
		    
		   boolean orderplace=  checkoutpageclass.isOrderPlaced();
		    Assert.assertTrue(orderplace,Constant.ORDERPLACEMESSAGE);
		    
		    
		    
		    
		    
		   
		   
	}

}

