package listeners_study;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners( listeners_study.Listener_1.class)
public class Mytest {
  @Test
  public void test1 () 
  {
	  Reporter.log("hiiiiiiiii",true);
  }
  @Test
  public void test2() 
  {
	  //Assert.fail();
	  Reporter.log("hlwwwwww",true);
  }
  @Test(dependsOnMethods = "test2")
  public void test3 () 
  {
	  Reporter.log("byyyyy",true);
  }
}
