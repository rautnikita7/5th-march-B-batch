package testNG_Verification_assert_study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertTrueAndassertFalse {
  @Test
  public void myMethod()
  {
	  boolean x=true;
	  boolean y=false;
	  boolean z=true;
	  
	 // Assert.assertTrue(x, "value is false then tc is failed");
	  //Reporter.log("value is true then tc is passed");
	  
	  Assert.assertFalse(y,"value is true then tc is failed");
	  Reporter.log("value is false tc is passed",true);
  }
}
