package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserUtil;

public class LandingPage 
{
@FindBy(xpath=" //a[@title='Configurez']")
private WebElement configurator;

@FindBy(xpath="(//div[@class='inner show']/nav[@aria-label='main navigation']/ul[@class='nav-primary']//span[text()='Configurez']")
private WebElement confclio;

public  LandingPage()
{
	PageFactory.initElements(BrowserUtil.driver,this);
}
public void clickConfig()
{
	configurator.click();
}

public void clickConfclio()
{
	confclio.click();
}
}


