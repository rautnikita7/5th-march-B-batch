package kiteAppPom_Listeners_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_HomePage
{
	
	//1.variables
   @FindBy(xpath = "//span[@class='user-id']") private WebElement userID;
   @FindBy(xpath = "//a[@target='_self']")private WebElement logOutButton;
   
   //2.constructor
   public Kite_HomePage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   //3. methods
   public String getactualuserID()
   {
	   String actualUserID  =userID.getText();
	   return actualUserID;
   }
   public void validateUserID(String expectedUsername)
   {
	    String actualUserID = userID.getText();
	    String exceptctedUserID = expectedUsername;
	    
	    if(actualUserID.equals(exceptctedUserID))
	    {
	    	System.out.println("user ID match then TC is paased");
	    }
	    else
	    {
	    	System.out.println("user ID not match then TC is failed");
	    }
   }  
	public void clickOnLogOutButton() throws InterruptedException
	{
		userID.click();
		Thread.sleep(1000);
		logOutButton.click();
	}
   
}
