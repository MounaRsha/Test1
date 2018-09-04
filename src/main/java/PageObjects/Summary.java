package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserUtil;
import Utils.PageWaitUtils;

public class Summary
{
 @FindBy(xpath="//span[text()='Mode de financement ']")
 private WebElement Finance;
 
 @FindBy(xpath="(//button[@class='close'])[2]")
 private WebElement CloseBTN;
 
 public Summary()
 {
	 PageFactory.initElements(BrowserUtil.driver, this);
 }
 
 public void clickFinance()
 {
	 PageWaitUtils.WaitForElementPresent(Finance);
	 Finance.click();
 }
 
 public void clickCloseBTN() throws InterruptedException
 {
	 PageWaitUtils.WaitForElementPresent(CloseBTN); 
	 Thread.sleep(10000);
	 CloseBTN.click();
 }
}
