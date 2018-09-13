package baseClass;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import config.configuration;

public class driverClass extends configuration{
	  public  static  WebDriver driver;
	
	 /* public void initdriver() {
		  
		  
	  }*/


	  @BeforeClass
	    public  static void baseClass() throws FileNotFoundException, IOException, ParseException, InterruptedException { 
		  System.setProperty(chromedriver, chrome);
			driver=new ChromeDriver();
      
		driver.manage().window().maximize();
       driver.get(url);
  System.out.println("dashbord-driver");
}
}