package Utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class CustomerListner implements ITestListener
{

	public static ExtentReports extent;
	public void takeScreenshot(String methodName)
	{
		
		EventFiringWebDriver ef = new EventFiringWebDriver(BrowserUtil.driver);
		File src = ef.getScreenshotAs(OutputType.FILE);
		File tar = new File(Constlistener.screenshotTarPath+methodName+Constlistener.screenshotImageExtension);
		
		try
		{
			FileUtils.copyFile(src, tar);
			
		}
		catch(IOException e)
		{
			System.out.println("catch");
		}
		extent.attachScreenshot(Constlistener.screenshotTarPath+methodName+Constlistener.screenshotImageExtension);
	}
	
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext itc) {

		String className = itc.getClass().getName();
		extent= ExtentReports.get(className+".class");
		extent.init(Constlistener.extentReportPath, true);
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult itc) {
		String methodName=itc.getName();
		takeScreenshot(methodName);
		extent.log(LogStatus.FAIL, methodName+Constlistener.failedMsg);
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult itc) {
		String methodName=itc.getName();
		extent.startTest(methodName);
		
	}

	public void onTestSuccess(ITestResult itc) {
		String methodName=itc.getName();
		takeScreenshot(methodName);
		extent.log(LogStatus.PASS, methodName+Constlistener.passedMsg);
		//extent.endTest();
	}	
	}