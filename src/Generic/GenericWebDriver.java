package Generic;

import org.openqa.selenium.WebDriver;

public class GenericWebDriver 
{
public void enterurl(WebDriver driver,String url)
{
	driver.get(url);
}
public void quitapp(WebDriver driver)
{
	driver.quit();
}
public void closeapp(WebDriver driver)
{
	driver.close();
}
public void getpagecode(WebDriver driver)
{
	String pc = driver.getPageSource();
	System.out.println(pc);
}
public void geturl(WebDriver driver)
{
	String cu = driver.getCurrentUrl();
	System.out.println(cu);
}
public void gettitle(WebDriver driver)
{
	String tt = driver.getTitle();
	System.out.println(tt);
}
public void navi(WebDriver driver,String ur)
{
	driver.navigate().to(ur);
}
}
