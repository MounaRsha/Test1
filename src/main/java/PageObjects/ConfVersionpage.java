package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserUtil;
import Utils.PageWaitUtils;

public class ConfVersionpage
{
 @FindBy(xpath="((//div[@data-spec-code='ENS_MDL2P1SERIESPE2']//span[text()='Sélectionner'])[1]")
 private WebElement SelLim;


public ConfVersionpage()
{
	PageFactory.initElements(BrowserUtil.driver,this);
}

public void ClickLimSel()
{
	PageWaitUtils.WaitForElementPresent(SelLim);
	SelLim.click();
}
}
