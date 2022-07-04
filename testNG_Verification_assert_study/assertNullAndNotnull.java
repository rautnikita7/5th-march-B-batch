package testNG_Verification_assert_study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertNullAndNotnull {
  @Test
  public void myMethod()
  {
	  String a=null;
	  String b="by";
	
	  
	 // Assert.assertNotNull(a,"value is null tc is failed");
	 // Reporter.log("value is notnull tc is passed",true);
	  
	  Assert.assertNull( a,"value is notnull tc is failed");
	  Reporter.log("value is null tc is passed",true);
	  
	  //assert.fail();--->when our tc is passed but we use assert.fail then tc is by default failed
  }
}
