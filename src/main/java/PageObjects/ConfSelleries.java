package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserUtil;
import Utils.PageWaitUtils;

public class ConfSelleries
{
@FindBy(xpath="//a[@class='linear-subnav-button']//span[contains(text(),'SELLERIES')]")
private WebElement selleriesBTN;

@FindBy(xpath="//button[@class='cfg-extra-options-btn']")
private WebElement sellconflictBTN;

@FindBy(xpath="(//span[@class='cfg-option-select-text'])[4]")
private WebElement selPerSell;

@FindBy (xpath="((//button[@class='cfg-conflicts-ok'])[3]")
private WebElement ConfirmSell;

@FindBy(xpath="//span[@class='next-button-category']")
private WebElement NextPerson;

public ConfSelleries()
{
	PageFactory.initElements(BrowserUtil.driver, this);
}

public void clickSelleries()
{
	selleriesBTN.click();
}

public void clickSellConflict()
{
	PageWaitUtils.WaitForElementPresent(sellconflictBTN);
	sellconflictBTN.click();
}

public void clickselPerSell()
{
	PageWaitUtils.WaitForElementPresent(selPerSell);
	selPerSell.click();
}

public void clickConfSell()
{
	PageWaitUtils.WaitForElementPresent(ConfirmSell);
	ConfirmSell.click();
}

public void clickNextPerson()
{
	PageWaitUtils.WaitForElementPresent(NextPerson);
	NextPerson.click();
}
}
