package TestcaseScript;


import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.Generic;
import POM.LoginPage;

public class Test1 extends Generic{

	@Test
	public void Test_Login() throws Exception
	{
		
	      LoginPage lp= new LoginPage(driver);
	      lp.setemail("akankshagangwar@yahoo.in");
	      Thread.sleep(3000);
	      lp.setpassword("simmigangwar");
	      Thread.sleep(3000);
	      lp.clicklogin();
	      Thread.sleep(5000);
	      String title = driver.getTitle();
	      Thread.sleep(3000);
	      Assert.assertTrue(title.contains("Facebook"));
	      
}
}

