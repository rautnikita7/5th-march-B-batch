package softAssert_study;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEquals_andNotAssert {
	
	SoftAssert soft = new SoftAssert();
  @Test
  public void mymethod()
  {
	String a = "pune";
	String b = "pune";
	String c = "mumbai";
	
	soft.assertNotEquals(a, c,"TC is failed both are not equal");
	soft.assertAll();
	
  }
  @Test
  public void mymethod2()
  {
	  boolean a = true;
	  
	  soft.assertTrue(a, "A is not true TC is failed");
	  soft.assertAll();
  }
}
