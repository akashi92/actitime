package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="pass")
	private WebElement pwdd;
	@FindBy(id="u_0_b")
	private WebElement login;
	@FindBy(id="u_0_b")
	private WebElement logout;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setemail(String em)
	{
		email.sendKeys(em);
	}
	public void setpassword(String pwd)
	{
		 pwdd.sendKeys(pwd);
	}
	public void clicklogin()
	{
		  login.click();
	}

}
