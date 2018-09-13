package config;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeClass;

public class configuration {

	public static String userName1, password,loginButton,loginPageLogo,url,chrome,chromedriver,HomeapageSearchboxTitle,TodaysDealPageTitle,amazonPayTitle;
	
	@BeforeClass
	public static void config() throws FileNotFoundException, IOException, ParseException, InterruptedException{
	JSONParser parser = new JSONParser(); 
    Object propobj = parser.parse(new FileReader ("C:\\Users\\Sudha\\eclipse-workspace\\Amazon\\properties.json"));
    Object obj = parser.parse(new FileReader ("C:\\Users\\Sudha\\eclipse-workspace\\Amazon\\resources.json"));
	
    JSONObject jsonObject = (JSONObject) obj;
    JSONObject propjsonObject = (JSONObject) propobj; 
    System.out.println("config");
    
      userName1=   (String) jsonObject.get("userName");
      password =    (String) jsonObject.get("password");
      loginButton = (String) propjsonObject.get("loginButton");
      loginPageLogo = (String) propjsonObject.get("loginPageLogo");
      url=            (String) jsonObject.get("URL");
      chrome =        (String) propjsonObject.get("chrome");
      chromedriver =  (String) propjsonObject.get("driver");
      HomeapageSearchboxTitle = (String)propjsonObject.get("HomeapageSearchboxTitle");
      TodaysDealPageTitle =     (String)propjsonObject.get("TodaysDealPageTitle");
      amazonPayTitle=           (String)propjsonObject.get("amazonPayTitle");
	}
}