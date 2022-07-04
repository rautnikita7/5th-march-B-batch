package testNG_Failed_xml;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC1 {
  @Test
  public void method1()
  {
	  Reporter.log("method1 is pass",true);
  }
  @Test
  public void method2()
  {
	  Reporter.log("metho2 is pass",true);
  }
  @Test
  public void method3()
  {
	  Assert.fail();
	  Reporter.log("method3 is pass",true);
  }
  @Test
  public void metho4()
  {
	  Reporter.log("method4 is pass",true);
  }
  @Test
  public void method5()
  {
	  Assert.fail();
	  Reporter.log("method5 is pass",true);
  }
  @Test
  public void method6()
  {
	  Reporter.log("method6 is pass",true);
  }
  @Test
  public void method7()
  {
	  Reporter.log("method7 is pass",true);
  }
}
