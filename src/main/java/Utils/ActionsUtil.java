package Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtil 
{
	static Actions action=new Actions(BrowserUtil.driver);
	public static void actionsMoveToElement(WebElement element)
	{
	 action.moveToElement(element).perform();
	}
	public static  void actionsDragAndDrop(WebElement source,WebElement target)
	{
		action.dragAndDrop(source, target);
	}
	public static void actionsContextClick(WebElement element)
	{
		action.contextClick(element).perform();
	}
	public static void actionsDoubleClick(WebElement element)
	{
		action.doubleClick(element).perform();
	}
	
	public static void click(WebElement element)
	{
		element.click();
	}
}


