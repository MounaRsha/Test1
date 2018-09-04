package TestScripts;

import org.testng.annotations.Test;

import Config.ClassLevelConfig;
import Config.TestLevelConfig;
import PageObjects.ConfColor;
import PageObjects.ConfJantes;
import PageObjects.ConfMotorPage;
import PageObjects.ConfOption;
import PageObjects.ConfPacks;
import PageObjects.ConfPerson;
import PageObjects.ConfSelleries;
import PageObjects.ConfVersionpage;
import PageObjects.HomePage;
import PageObjects.LandingPage;
import PageObjects.Summary;
import Utils.BrowserConstants;
import Utils.ExcelUtil;

public class TestClioConfig extends ClassLevelConfig
{
	
 @Test
 public void testClioConfig() throws InterruptedException
 {
	 HomePage h=new HomePage();
	 h.clickClose();
	 h.clickClio();
	 LandingPage l= new LandingPage();
	 l.clickConfclio();
	 ConfVersionpage v= new ConfVersionpage();
	 v.ClickLimSel();
	 ConfMotorPage  m= new ConfMotorPage();
	 m.clickDci75();
	 ConfColor c= new ConfColor();
	 c.clickConflict();
	 Thread.sleep(5000);
	 c.clickRogueClr();
	 c.clickConfirm();
	 c.clickNextJantes();
	 ConfJantes j=new ConfJantes();
	 j.clickJante();
	 ConfSelleries s = new ConfSelleries();
	 s.clickSelleries();
	// s.clickSellConflict();
	// s.clickselPerSell();
	// s.clickConfSell();
	 s.clickNextPerson();
	 ConfPerson p= new ConfPerson();
	 p.clickSecondTab();
     //String text = ExcelUtil.getCellValue(BrowserConstants.Excelpath, BrowserConstants.Sheet1, 0, 0);
//	 Thread.sleep(2000);
 //  p.selectA();
    p.clickAdd();
    p.clickNextPacks();
    ConfPacks k=new ConfPacks();
    k.clickRlink();
   // k.clickConflictPack();
   // k.clickMediaNav();
    k.clickNextOption();
   ConfOption o= new ConfOption();
   //o.clickPackCity();
   o.clickRoue();
   //o.clickConflictOption();
  // o.clickToit();
  // o.clickConfirmConflictOption();
   o.clickSummaryBTN();
   Summary y =new Summary();
   y.clickFinance();
   y.clickCloseBTN();
 
	 
	 
 }
}
