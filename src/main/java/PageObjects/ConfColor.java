package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserUtil;
import Utils.PageWaitUtils;

public class ConfColor
{
@FindBy(xpath="//div[@class='tab-1-content ']//li[@class='cfg-extra-options-list-item']//button[@class='cfg-extra-options-btn']")
private WebElement conflictBTN;

@FindBy(xpath="(//div[@class='cfg-option-selection-element'])[8]")
private WebElement RogueClr;

@FindBy(xpath="(//div[@class='cfg-conflicts']//div[@class='cfg-conflict-buttons']//button[@class='cfg-conflicts-ok']")
private WebElement confirmBTN;

@FindBy(xpath="//div[@class='cfg-next-button c_085_4']//span[text()='JANTES']")
private WebElement Nextjantes;

@FindBy(xpath="//span[text()='Rouge Intense']")
private WebElement temp;

public ConfColor()
{
	PageFactory.initElements(BrowserUtil.driver, this);
}

public void clickConflict() 
{
	PageWaitUtils.WaitForElementPresent(conflictBTN);
	conflictBTN.click();
}
public void clickRogueClr() throws InterruptedException
{
	PageWaitUtils.WaitForElementPresent(RogueClr);
	//Thread.sleep(10000);
	try
	{
		RogueClr.click();
	}
	catch(Exception e)
	{
		System.out.println("Inside Catch");
		temp.click();
	}
	
}

public void clickConfirm()
{
	PageWaitUtils.WaitForElementPresent(confirmBTN);
	confirmBTN.click();
}

public void clickNextJantes()
{
	PageWaitUtils.WaitForElementPresent(Nextjantes);
	Nextjantes.click();
}
}
