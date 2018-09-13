package Pages;

import org.openqa.selenium.By;

import baseClass.driverClass;

public class todaysDealsPage extends driverClass{

	public String todaysDealsLink() throws InterruptedException {
		
		/*driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
		Thread.sleep(50000);*/
	driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
    String currentTitle = driver.getTitle();
    return currentTitle;
	
	}
}
