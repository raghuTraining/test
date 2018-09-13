package Pages;

import org.openqa.selenium.By;

import baseClass.driverClass;

public class AmazonPayPage extends driverClass {
	
	
	public String AmazonPayLink() {
	driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
	
	String AmazonPayTitle = driver.getTitle();
	return AmazonPayTitle;
    

}
	}
