package testNG_keywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InvocationCount {
  @Test(invocationCount = 3)
  public void myMethod() 
  {
	  Reporter.log("method is running",true);
  }
  @AfterMethod
  public void close() 
  {
	  Reporter.log("close browser",true);
  }
  
}
