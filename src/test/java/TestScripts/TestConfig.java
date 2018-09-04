package TestScripts;

import org.testng.annotations.Test;

import Config.ClassLevelConfig;
import Config.TestLevelConfig;
import PageObjects.HomePage;
import PageObjects.LandingPage;

public class TestConfig extends ClassLevelConfig
{
 @Test
 public void testConfigurator()
 {
	 HomePage h=new HomePage();
	 h.clickClose();
	 h.clickVehicle();
	 h.clickVehicleUtil();
	 h.clickFourgon();
	 LandingPage l=new LandingPage();
	 l.clickConfig();
 }
}
