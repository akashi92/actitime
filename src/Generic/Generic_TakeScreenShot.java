package Generic;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Generic_TakeScreenShot 
{
	public void Screenshot(WebDriver driver) throws IOException 
	{
		String photo="./TakeScreenShot/";
		Date d=new Date();
		String dd=d.toString();
		String date = dd.replaceAll(":", "-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo+date+".jpeg");
		FileUtils.copyFile(src,dst);
	
	}
}
