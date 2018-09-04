package Config;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Utils.BrowserUtil;



public class SuitelevelConfig 
{

	@BeforeSuite
	public static void suiteOpenBrowser()
	{
		System.out.println("suite level");
		BrowserUtil.openBrowser();
	}
	
	
	@AfterSuite
	public static void suiteCloseBrowser()
	{
		BrowserUtil.closeBrowser();
	}
}
