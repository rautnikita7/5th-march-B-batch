package listeners_study;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import kiteBaseClass_Listener_study.BaseClass_using_Propertres;

public class Listener_1 implements ITestListener
{ 
	BaseClass_using_Propertres B = new BaseClass_using_Propertres();
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("tc is pass",true);
		ITestListener.super.onTestSuccess(result);
		Reporter.log("successful tc name =="+result.getName(),true);
	}
	
	@Override
	public  void onTestFailure(ITestResult result) 
	{
		String TCname = result.getName();
		try {
			B.takeScreenshot(TCname);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("tc is skipped",true);
		ITestListener.super.onTestSkipped(result);
		Reporter.log("skipped tc name =="+result.getName(),true);
	}
}
