package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageWaitUtils 
{
	 public void waitForPageToLoad()
     {
            BrowserUtil.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     }
     public static void WaitForElementPresent(WebElement element)
     {
             WebDriverWait wait=new WebDriverWait(BrowserUtil.driver,30);
             wait.until(ExpectedConditions.visibilityOf(element));


     }
}
