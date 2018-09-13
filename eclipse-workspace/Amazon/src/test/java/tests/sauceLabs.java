package tests;

import java.net.MalformedURLException;

import java.net.URI;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

public class sauceLabs {
	public static final String nme="vidyanand3";
	public static final String pss="rM5LDjdtqS2k39QqFvAs";
	public static final String nodeURL="http://"+nme+":"+pss+"@hub-cloud.browserstack.com/wd/hub";

	

		
		  public static void main(String[] args) throws MalformedURLException  {
			WebDriver driver;

				String baseURL;
				baseURL= "https://www.naukri.com";
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "latest");
//	WebDriver driver = new RemoteWebDriver(new URL(
       // driver= new RemoteWebDriver(new URI(nodeURL), caps);
	 // WebDriver driver1 = new RemoteWebDriver(new URI(nodeURL), caps);
	
		
		
		
	//	driver.get(baseURL); 
		
		//driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[3]/a"));
	}
}
