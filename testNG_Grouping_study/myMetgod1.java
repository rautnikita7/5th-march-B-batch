package testNG_Grouping_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class myMetgod1 {
  @Test(groups = "regression")
  public void TC1() 
  {
	  Reporter.log("TC1 regression is running",true);
  }
  @Test(groups = "sanity")
  public void TC2() 
  {
	  Reporter.log("TC2 sanity is running",true);
  }
  @Test
  public void TC3() 
  {
	  Reporter.log("TC3  is running",true);
  }
  @Test(groups = "regression")
  public void TC4() 
  {
	  Reporter.log("TC4 regression is running",true);
  }
  @Test(groups = "sanity")
  public void TC5() 
  {
	  Reporter.log("TC5 snaity is running",true);
  }
}
