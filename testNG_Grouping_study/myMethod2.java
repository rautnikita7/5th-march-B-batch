package testNG_Grouping_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class myMethod2 {
  @Test(groups = "sanity")
  public void TestCase1() 
  {
	  Reporter.log("sanity TC1 is pass",true);
  }
  @Test(groups = "regression")
  public void TestCase2()
  {
	  Reporter.log("regression TC2 is pass",true); 
  }
  @Test(groups = "sanity")
  public void TestCase3()
  {
	  Reporter.log("sanity TC3 is pass",true);
  }
  @Test(groups = "sanity")
  public void TestCase4() 
  {
	  Reporter.log("sanity TC4 is pass",true);
  }
  @Test(groups = "regression")
  public void TestCase5()
  {
	  Reporter.log("regression TC5 is pass",true);
  }
}
