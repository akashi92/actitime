package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Generic_Script_Actions
{
public void MouseHoverAction(WebDriver driver, WebElement ele)
{
	Actions act=new Actions(driver);
	act.moveToElement(ele).perform();
}
public void DragandDrop(WebDriver driver, WebElement S,WebElement T)
{
	Actions act=new Actions(driver);
	act.dragAndDrop(S, T).perform();
}
public void Doubleclick(WebDriver driver, WebElement T)
{
	Actions act=new Actions(driver);
	act.doubleClick(T).perform();
}
public void Rightclick(WebDriver driver, WebElement T)
{
	Actions act=new Actions(driver);
	act.contextClick(T).perform();
}
}
