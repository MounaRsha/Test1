package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserUtil;
import Utils.PageWaitUtils;

public class ConfOption
{
//@FindBy (xpath="(//p[@class='cfg-option-add'])[3]")
//private WebElement PackCity;

@FindBy (xpath="(//p[@class='cfg-option-add'])[1]")
private WebElement Roue;

@FindBy(xpath="//button[@class='cfg-extra-options-btn']")
private WebElement ConflictOption;

@FindBy (xpath="(//p[@class='cfg-option-add'])[4]")
private WebElement Toit;

@FindBy(xpath="(//button[@class='cfg-conflicts-ok'])[4]")
private WebElement ConfirmConflictOption;

@FindBy(xpath="//span[text()='Résumé']")
private WebElement SummaryBTN;

public ConfOption()
{
	PageFactory.initElements(BrowserUtil.driver, this);
}

//public void clickPackCity()
//{
//	PageWaitUtils.WaitForElementPresent(PackCity);
//	PackCity.click();
//}

public void clickRoue()
{
	PageWaitUtils.WaitForElementPresent(Roue);
	Roue.click();
}
public void clickConflictOption()
{
	PageWaitUtils.WaitForElementPresent(ConflictOption);
	ConflictOption.click();
}

public void clickToit()
{
	PageWaitUtils.WaitForElementPresent(Toit);
	Toit.click();
	
}

public void clickConfirmConflictOption()
{
	PageWaitUtils.WaitForElementPresent(ConfirmConflictOption);
	ConfirmConflictOption.click();
}

public void clickSummaryBTN()
{
	PageWaitUtils.WaitForElementPresent(SummaryBTN);
	SummaryBTN.click();
}
}
