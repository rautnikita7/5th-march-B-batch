package kitetest_testNG_with_excel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_class {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		File myfile = new File("D:\\selenium\\Book2 xlsheet.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
		String userName = mysheet.getRow(0).getCell(0).getStringCellValue();
		String password = mysheet.getRow(0).getCell(1).getStringCellValue();
		String kitepin = mysheet.getRow(0).getCell(2).getStringCellValue();
		
		Kiteloginpage login= new Kiteloginpage(driver);
	    login.sendusername(mysheet.getRow(0).getCell(0).getStringCellValue());
	    login.sendpassword(password);
	    login.clickonlonginbutton();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    KitePin_page pin = new KitePin_page(driver);
	    pin.sendPin(kitepin);
	    pin.clickoncontinuebutton();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    Kite_HomePage home = new Kite_HomePage(driver);
	    home.validateUserID(userName);
	    home.clickOnLogOutButton();
	    Thread.sleep(100);
	    driver.close();
	
	
	
	
	
	}

}
