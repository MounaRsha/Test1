package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserUtil;
import Utils.PageWaitUtils;

public class ConfJantes 
{
@FindBy(xpath="//li[@class='linear-nav-item linear-nav-active']//ul[@class='linear-subnav']//span[text()='SELLERIES']")
private WebElement SelJanteBTN;

public ConfJantes()
{
	PageFactory.initElements(BrowserUtil.driver, this);
}

public void clickJante()
{
	PageWaitUtils.WaitForElementPresent(SelJanteBTN);
	SelJanteBTN.click();
}
}
