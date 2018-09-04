package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.ActionsUtil;
import Utils.BrowserUtil;
import Utils.PageWaitUtils;

public class HomePage
{
 @FindBy(xpath="//span[contains(text(),'VEHICULES')]")
 private WebElement vehicle;
 @FindBy(xpath="//a[contains(text(),'Véhicules utilitaires')]")
 private WebElement VehicleUtil;
 @FindBy (xpath="//span[text()='MASTER Fourgon']")
 private WebElement Fourgon;
 @FindBy(xpath="//a[@id='psyma_close_button_link']")
 private WebElement closePopup;
 @FindBy(xpath="//h2[text()='CLIO']")
 private WebElement clio;
 @FindBy(xpath="(//div[@class='content-wrapper']//h2[text()='TWINGO']")
 private WebElement twingo;
 
public   HomePage()
 {
	 PageFactory.initElements(BrowserUtil.driver, this);
 }
public void clickVehicle()
{
	PageWaitUtils.WaitForElementPresent(vehicle);
	vehicle.click();
}

 public void clickVehicleUtil()
{
//ActionsUtil.actionsMoveToElement(VehicleUtil);
	 PageWaitUtils.WaitForElementPresent(VehicleUtil);
VehicleUtil.click();
}
 public void clickFourgon()
 {
	 PageWaitUtils.WaitForElementPresent(Fourgon);
	Fourgon.click(); 
 }
 
 public void clickClose()
 {
	 PageWaitUtils.WaitForElementPresent(closePopup);
	 closePopup.click();
 }
 public void clickClio()
 {
	 PageWaitUtils.WaitForElementPresent(clio);
	 clio.click();
 }
 public void clicktwingo()
 {
	 PageWaitUtils.WaitForElementPresent(twingo);
	 twingo.click();
 }
 
 
 
}
