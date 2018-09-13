package Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import baseClass.driverClass;

public class HomePage extends driverClass{

	
	public String HomePageSearchBox() {
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");;
	driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
    String actualName=	driver.getTitle();
    return actualName;
    
}
	
	public void HomePageAdresstab() {
		
		driver.findElement(By.xpath("//*[@id=\"nav-global-location-slot\"]/span/a")).click();
		driver.findElement(By.xpath("//*[@id=\"a-popover-1\"]/div"));
		System.out.println("Adress popup appeared");
		

String MainWindow=driver.getWindowHandle();		

// To handle all new opened window.				
    Set<String> s1=driver.getWindowHandles();		
    System.out.println(s1);
Iterator<String> i1=s1.iterator();		
		
while(i1.hasNext())			
{		
    String ChildWindow=i1.next();		
    		
    if(!MainWindow.equalsIgnoreCase(ChildWindow))			
    {    		
         
            // Switching to Child window
            driver.switchTo().window(ChildWindow);	                                                                                                           
                           			
                         
	// Closing the Child Window.
                driver.close();		
    }		
}		
// Switching to Parent window i.e Main Window.
    driver.switchTo().window(MainWindow);		
		
	}
public void sortTab() {
	driver.findElement(By.xpath("//*[@id=\"sort\"]")).click();
	Select select = new Select(driver.findElement(By.xpath("//*[@id=\"sort\"]")));
	
	select.selectByVisibleText("Newest Arrivals");
	

}
}




