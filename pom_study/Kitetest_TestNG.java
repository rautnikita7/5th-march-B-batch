package pom_study;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Kitetest_TestNG {
	
	Kiteloginpage login;
	KitePin_page pin;
	Kite_HomePage home;
	WebDriver driver;
	Sheet mySheet;
	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException
	{
		
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver_win32 (2)\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	Reporter.log("lauching url",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	login= new Kiteloginpage(driver);
	home= new Kite_HomePage(driver);
	pin=new KitePin_page(driver);
	File MyFile=new File("D:\\selenium\\Book2 xlsheet.xlsx");
	mySheet=WorkbookFactory.create(MyFile).getSheet("Sheet1");
	
	}
	@BeforeMethod
	public void loginToKite() 
	{
	login.sendusername(mySheet.getRow(0).getCell(0).getStringCellValue());
	Reporter.log("Sending Username", true);
	login.sendpassword(mySheet.getRow(0).getCell(1).getStringCellValue());
	Reporter.log("Sending Password",true);
	login.clickonlonginbutton();
	Reporter.log("Clicking on login button",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
	pin.sendPin(mySheet.getRow(0).getCell(2).getStringCellValue());
	Reporter.log("Sending PIN",true);
	pin.clickoncontinuebutton();
	Reporter.log("Clicking on continue button",true);
	}
	@Test
	public void verifyKiteUserName() 
	{
	// expected uSernAMe--> excell
	//actual userNAme???
	String expectedUserID = mySheet.getRow(0).getCell(0).getStringCellValue();
	String actualUserID = home.getactualuserID();
	Reporter.log("Validating user ID ",true);
	Assert.assertEquals(expectedUserID, actualUserID,"Expected UserID and Actual UserID are not matching TC is FAILED");
	Reporter.log("Expected UserID and Actual UserID are matching TC is PASSED", 
	true);
	}
	@AfterMethod 
	public void logOutFromKiteApp() throws InterruptedException
	{
	home.clickOnLogOutButton();
	Reporter.log("Logging out.......",true);
	}
	@AfterClass
	public void closeBrowser()
	{
	Reporter.log("closing browser", true);
	driver.close();
	}
	}
