package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utils.BrowserUtil;
import Utils.PageWaitUtils;

public class ConfPerson 
{
	@FindBy(xpath="//label[@class='tab-2-label']")
	private WebElement SecondTab;
	
	@FindBy(xpath="(//div[@class='custom-selectbox custom-selectbox-form'])[2]")
	private WebElement SelExt1;
	
	@FindBy(xpath="//select[@xpath='1']")
	private WebElement SelExt; 
	
	@FindBy (xpath="(//span[@class='cfg-option-add-text'])[2]")
	private WebElement AddPerson;
	
	@FindBy(xpath="//p[@class='cfg-option-add']")
	private WebElement Addperson1;
	
	@FindBy(xpath ="//option[text()='PETOI']")
	private WebElement OtionBTN;
	
	@FindBy(xpath="//span[text()='PACKS']")
	private WebElement NextPacks;
	
	public ConfPerson()
	{
		PageFactory.initElements(BrowserUtil.driver, this);
	}
	
	public void clickSecondTab()
	{
		PageWaitUtils.WaitForElementPresent(SecondTab);
		SecondTab.click();
	}
	
	public void selectA()
	{
	
	Select select=new Select(SelExt);
	select.selectByValue("PETOI");
		//SelExt.click();
		//OtionBTN.click();
		
	}
	
//	public void selectA(int i)
//	{
//		this.select.selectByIndex(i);
//	}
//	
//	public void selectA(String text)
//	{
//		
//		try
//		{
//			this.select.selectByVisibleText(text);
//		}
//		catch(Exception e)
//		{
//			this.select.selectByValue(text);
//		}
//	}
	
	
	
	public void clickAdd()
	{
		PageWaitUtils.WaitForElementPresent(Addperson1);
		Addperson1.click();
		//AddPerson.click();
		//AddPerson.click();
	}
	
	public void clickNextPacks()
	{
		NextPacks.click();
	}
	
	
	

}
