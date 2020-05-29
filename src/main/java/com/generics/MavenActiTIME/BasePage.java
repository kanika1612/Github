package com.generics.MavenActiTIME;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	//Select class
  public void selectbyvisibletext(WebElement element,String text) {
	Select sel=new Select(element);
	sel.selectByVisibleText(text);
  }
	
  public void selectbyvalue(WebElement element,String value) {
	  Select sel=new Select(element);
	  sel.selectByValue(value);
	  }
  
  public void selectbyindex(WebElement element,int index) {
	  Select sel=new Select(element);
	  sel.selectByIndex(index);
  }
  
    //Actions class 
  public void contextclick(WebDriver driver,WebElement onElement) {
	  Actions act=new Actions(driver);
	  act.contextClick(onElement).perform();
  }
}
