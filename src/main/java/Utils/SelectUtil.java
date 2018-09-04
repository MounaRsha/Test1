package Utils;

import org.openqa.selenium.support.ui.Select;

public class SelectUtil 
{
 
  Select list;
 
  public SelectUtil(Select list) 
  {
    this.list = list;
  }
 
  public void select(int i)
  {
    this.list.selectByIndex(i);
  }
 
  public void select(String text)
  {
	  try
	  {
    this.list.selectByVisibleText(text);
	  }
	  catch(Exception e)
	  {
		  this.list.selectByValue(text);
	  }
  }
 
  public void deSelect(int i) 
  {
    this.list.deselectByIndex(i);
  }
 
  public void deSelect(String text) 
  {
	  try
	  {
		  this.list.deselectByVisibleText(text); 
	  }
	  catch(Exception e)
	  {
		  this.list.deselectByValue(text);
	  }
    
  }
 
 
 
}