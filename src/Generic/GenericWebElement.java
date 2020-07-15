package Generic;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class GenericWebElement 
{
public void fetchtext (WebElement ele)
{
	String text = ele.getText();
	System.out.println(text);
}
public void fetchtooltip (WebElement ele,String tt)
{
	String tooltip = ele.getAttribute(tt);
	System.out.println(tooltip);
}
public void fetchlocation (WebElement ele)
{
	Point location = ele.getLocation();
	System.out.println(location);
}
public void fetchcss (WebElement ele,String css)
{
	String pixel = ele.getCssValue(css);
	System.out.println(pixel);
}
public void clickon (WebElement ele)
{
	ele.click();
}
public void clearon (WebElement ele)
{
	ele.clear();
}
public void submiton (WebElement ele)
{
	ele.submit();
}
public void passsendkeys (WebElement ele,String sk)
{
	ele.sendKeys(sk);
}
public void enabled (WebElement ele)
{
	boolean e = ele.isEnabled();
	System.out.println(e);

}
public void displayed (WebElement ele)
{
	boolean d = ele.isDisplayed();
	System.out.println(d);

}
public void selected (WebElement ele)
{
	boolean s = ele.isSelected();
	System.out.println(s);

}

}
