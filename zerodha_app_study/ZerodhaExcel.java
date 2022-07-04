package zerodha_app_study;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		{
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver_win32 (2)\\chromedriver.exe");
			 WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
			File myfile=new File("D:\\selenium\\excel3.xlsx");
			Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
			String UN = mysheet.getRow(0).getCell(0).getStringCellValue();
			String PWD = mysheet.getRow(0).getCell(1).getStringCellValue();
			String PIN = mysheet.getRow(0).getCell(2).getStringCellValue();
			
			
			 WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
			 WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
			 WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
			 
			 username.sendKeys("UN");
			 password.sendKeys("PWD");
			 loginButton.click();
			 
			 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			 
			WebElement pin = driver.findElement(By.id("pin"));
			 WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
			 
			pin.sendKeys("PIN");
			continueButton.click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
			WebElement userId = driver.findElement(By.xpath("//span[@class='user-id']"));
			 String actualuserid = userId.getText();
			 
			 String expecteduserid = UN;
			 if(actualuserid.equals(expecteduserid))
			 {
				 System.out.println("user id is match tc is pass");
			 }
			
			 else
			 {
				System.out.println("user id is not matching tc is faild"); 
			 }
			 
			 userId.click();
		     Thread.sleep(100);
		    WebElement loginbutton = driver.findElement(By.xpath("//a[@target='_self']"));
			loginbutton.click();
			Thread.sleep(200);
			driver.close();
			
			
			
		
		}

	}

}
