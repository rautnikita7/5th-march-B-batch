package testNG_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_keyword {
 
	 @Test(priority = -1)
	  public void E()
	  {
		  Reporter.log("E is running ",true);
	  }
	 @Test
	  public void C()
	  {
		  Reporter.log("c is running ",true);
	  }
	 @Test
	  public void D()
	  {
		  Reporter.log("D is running ",true);
	  }
	 @Test(priority = -3)
	  public void A()
	  {
		  Reporter.log("A is running ",true);
	  }
  
}
