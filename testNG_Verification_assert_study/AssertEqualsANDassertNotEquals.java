package testNG_Verification_assert_study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsANDassertNotEquals {
  @Test
  public void myTestcase() 
  {
	  String a="nikita";
	  String b="nikita";
	  String c="pratiksha";
	  
	  //if a and b is same then tc should be passed else tc is failed
	  
	//  Assert.assertEquals(a, b,"string not matching tc is failed");
	  //Reporter.log("string not matching tc is failed");
	  
	  Assert.assertNotEquals(a, c,"string is matching tc is failed");
	  Reporter.log("string are not matching tc is passed",true);
	  
  }
}
