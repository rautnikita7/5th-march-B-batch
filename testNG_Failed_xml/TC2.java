package testNG_Failed_xml;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC2 {
	@Test
	  public void sub1()
	  {
		  Reporter.log("sub1 is pass",true);
	  }
	  @Test
	  public void sub2()
	  {
		  Reporter.log("sub2 is pass",true);
	  }
	  @Test
	  public void sub3()
	  {
		  Assert.fail();
		  Reporter.log("sub3 is pass",true);
	  }
	  @Test
	  public void sub4()
	  {
		  Reporter.log("sub4 is pass",true);
	  }
	  @Test
	  public void sub5()
	  {
		  Assert.fail();
		  Reporter.log("sub5 is pass",true);
	  }
}
