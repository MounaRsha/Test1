package Config;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import Utils.BrowserUtil;
import Utils.CustomerListner;
@Listeners(CustomerListner.class)
public class TestLevelConfig 
{
		
		@BeforeTest
		public static void testOpenBrowser()
		{
			System.out.println("test level");
			BrowserUtil.openBrowser();
				
		}
		
		
	@AfterTest
	public static void testCloseBrowser()
	{
		
			BrowserUtil.closeBrowser();
	}
}
