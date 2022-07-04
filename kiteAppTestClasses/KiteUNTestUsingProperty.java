package kiteAppTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteAppBaseClass.BaseClass_using_Propertres;
import kiteAppPom.KitePin_page;
import kiteAppPom.Kite_HomePage;
import kiteAppPom.Kiteloginpage;
import kiteAppUtility.Utility_properties_study;

public class KiteUNTestUsingProperty extends BaseClass_using_Propertres
{
	Kiteloginpage login;
	KitePin_page pin;
	Kite_HomePage home;
	@BeforeClass
	public void launchBrowser() throws IOException
	{
	    launchBrowser();
	    login = new Kiteloginpage(driver);
	    pin= new KitePin_page(driver);
	   home= new Kite_HomePage(driver);
	}
	@BeforeMethod
	public void loginToKiteApp() throws IOException
	{
	     login.sendusername(Utility_properties_study.readDataFromProprty("UN"));
	     login.sendpassword(Utility_properties_study.readDataFromProprty("PWD"));
	     login.clickonlonginbutton();
	     Utility_properties_study.implicitWait(driver, 200);
	     pin.sendPin(Utility_properties_study.readDataFromProprty("PIN"));
	     pin.clickoncontinuebutton();
	     Utility_properties_study.implicitWait(driver, 200);
	}
	@Test
	 public void ValidateUserName() throws IOException 
	{
	       String actualUserID=home.getactualuserID();
	      String expectedUserID = 
	      Utility_properties_study.readDataFromProprty("UN");
	      Assert.assertEquals(actualUserID, expectedUserID,"Actual and Expected are not matching, TC is failed");
	      Reporter.log("Actual and Expected are matching, TC is PASSED", true);
	      Utility_properties_study.takeScreenshot(driver);
	}
	
	@AfterMethod
	public void logOutFromKite() throws InterruptedException
	{
	     home.clickOnLogOutButton();
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
	     Thread.sleep(2000);
	     driver.close();
	}
}
