package Config;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import Utils.BrowserUtil;

@Listeners(Utils.CustomerListner.class)

public class ClassLevelConfig 
{
	@BeforeClass
	public void classOpenBrowser()
	{
		System.out.println("class level");

		BrowserUtil.openBrowser();
		}
	
	
	@AfterClass
	public void classCloseBrowser()
	{
			//BrowserUtil.closeBrowser();
	}

	
 
}
