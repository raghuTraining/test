package tests;

import java.net.URI;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;

public class SampleSauceTest {

	  public static final String USERNAME = "vidyanand@whitebox-learning.com";
	  public static final String ACCESS_KEY = "14fe8594-5a2f-4d14-a374-a09d7d57a64a";
	  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	 
	  public static void main(String[] args) throws Exception {
	 
	    DesiredCapabilities caps = DesiredCapabilities.chrome();
	    caps.setCapability("platform", "Windows 10");
	    caps.setCapability("version", "latest");
	    WebDriver	driver= new RemoteWebDriver(new URL(URL), caps);

	//  WebDriver driver = new RemoteWebDriver(new URI(URL), caps);
	    WebDriver driver2 =new RemoteWebDriver(new URI(URL), caps);
	 
	    /**
	     * Goes to Sauce Lab's guinea-pig page and prints title
	     */
	 
	    driver.get("https://saucelabs.com/test/guinea-pig");
	    System.out.println("title of page is: " + driver.getTitle());
	 
	    driver.quit();
	  }
}
