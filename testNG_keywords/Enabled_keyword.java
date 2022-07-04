package testNG_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled_keyword {
  
	@Test(enabled = false)
	  public void myMethod1() 
	  {
		  Reporter.log("myMethod1 is pass",true);
	  }
	@Test
	  public void myMethod2() 
	  {
		  Reporter.log("myMethod2 is pass",true);
	  }
	@Test
	  public void myMethod3() 
	  {
		  Reporter.log("myMethod3 is pass",true);
	  }
	@Test
	  public void myMethod4() 
	  {
		  Reporter.log("myMethod4 is pass",true);
	  }
}
