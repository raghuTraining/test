package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.driverClass;
import tests.A3AmazonPayPageTest;

public class DashBoardElementpage extends driverClass {

	public void yoursOrdersElement() {
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"nav-link-yourAccount\"]")) ;
			
        Actions builder = new Actions(driver);

        Action mouseOverHome = 	builder.moveToElement(ele).build();
		
        mouseOverHome.perform();
        
        WebDriverWait wait = new WebDriverWait(driver, 5);
   //     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"nav-flyout-yourAccount\"]/div[3]/a[5]/span")));
      //  driver.findElement(By.cssSelector(selector_For_Element_To_Be_Click_After_Hover)).click();
        
        System.out.println("yoursOrdersElement1");
		
	}
}
