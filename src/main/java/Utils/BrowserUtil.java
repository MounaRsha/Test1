package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtil 
{
	public static WebDriver driver;
	
	public static void openBrowser()
	{
		driver=new ChromeDriver();
		System.setProperty(BrowserConstants.chdriver, BrowserConstants.chexepath);
		driver.manage().window().maximize();
		driver.get(BrowserConstants.url);
		//driver.get("https://www.renault.fr");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
	}
	
	

	public static void closeBrowser()
	{
		driver.close();
		driver.quit();
	}

}


