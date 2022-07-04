package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
  @Test
  public void testcase1()
  {
	  Reporter.log("testcase1 is running ",true);
  }
 @BeforeMethod
  public void testcase2()
  {
	  Reporter.log(" beforemethod testcase2 is running ",true);
  }
 @AfterMethod
  public void testcase3()
  {
	  Reporter.log("aftermethod testcase3 is running ",true);
  }
 @AfterClass
  public void testcase4()
  {
	  Reporter.log(" afterclass testcase4 is running ",true);
  }
 @BeforeClass
 public void testcase5()
 {
	  Reporter.log(" beforeclass testcas5 is running ",true);
 }
}
