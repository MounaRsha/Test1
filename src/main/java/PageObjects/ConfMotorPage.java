package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserUtil;
import Utils.PageWaitUtils;

public class ConfMotorPage
{
@FindBy(xpath="(//div[@data-spec-code='PT5554_dci_75_,PT21_traction,PT1633_bvm,PT47_5']//span[text()='Sélectionner']")
private WebElement SelDci75;

public ConfMotorPage()
{
	PageFactory.initElements(BrowserUtil.driver, this);
}

public void clickDci75()
{
	PageWaitUtils.WaitForElementPresent(SelDci75);
	SelDci75.click();
}
}
