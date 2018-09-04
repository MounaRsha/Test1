package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserUtil;
import Utils.PageWaitUtils;

public class ConfPacks 
{
	@FindBy(xpath="(//p[@class='cfg-option-add'])[2]")
	private WebElement Rlink;
	
	@FindBy(xpath="//button[@class='cfg-extra-options-btn']")
	private WebElement ConflictPack;
	
	@FindBy(xpath="(//span[@class='cfg-option-add-text'])[5]")
	private WebElement MediaNav;
	
	@FindBy(xpath="(//button[@class='cfg-conflicts-ok'])[5]")
	private WebElement ConfirmMedianav;
	
	@FindBy(xpath="//span[@class='next-button-category']")
	private WebElement NextOption;
	
	public ConfPacks()
	{
		PageFactory.initElements(BrowserUtil.driver, this);
	}
	
	public void clickRlink()
	{
		PageWaitUtils.WaitForElementPresent(Rlink);
		Rlink.click();
	}
	
	public void clickConflictPack()
	{
		PageWaitUtils.WaitForElementPresent(ConflictPack);
		ConflictPack.click();
	}
	
	public void clickMediaNav()
	{
		PageWaitUtils.WaitForElementPresent(MediaNav);
		MediaNav.click();
		PageWaitUtils.WaitForElementPresent(ConfirmMedianav);
		ConfirmMedianav.click();
	}
	
	public void clickNextOption()
	{
		PageWaitUtils.WaitForElementPresent(NextOption);
		NextOption.click();
	}
}
