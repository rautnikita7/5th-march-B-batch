package kiteTestClasses_Listeners_study;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteAppBaseClass.BaseClasses;
import kiteAppPom.KitePin_page;
import kiteAppPom.Kite_HomePage;
import kiteAppPom.Kiteloginpage;
import kiteAppUtility.Utility;

public class ValidateUserID extends BaseClasses
{
	Kiteloginpage login;
	KitePin_page pin;
	Kite_HomePage home;
	@BeforeClass
	public void launchBrowser()
	{
	    openBrowser();
	    login=new Kiteloginpage(driver);
	    pin= new KitePin_page(driver);
	    home= new Kite_HomePage(driver);
	}
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
	   login.sendusername(Utility.readDataFormExcel(0, 0));
	   login.sendpassword(Utility.readDataFormExcel(0,1));
	   login.clickonlonginbutton();
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
	   pin.sendPin(Utility.readDataFormExcel(0, 2));
	   pin.clickoncontinuebutton();
	}
	@Test
	 public void validateUserName() throws EncryptedDocumentException, IOException 
	{
	    String actualUserName = home.getactualuserID();
	    String expectedUserName=Utility.readDataFormExcel(0, 0);
	    Assert.assertEquals(actualUserName, expectedUserName,"TC is FAILED actual and expected user names not matching");
	    Reporter.log("User names are matching TC is passed", true);
	    Utility.takeScreenshot(driver);
	 }
	@AfterMethod
	public void logoutfromKiteApp() throws InterruptedException
	{
	   home.clickOnLogOutButton();
	}
	@AfterClass
	public void closeBrowser()
	{
	    driver.close();
	}
}
