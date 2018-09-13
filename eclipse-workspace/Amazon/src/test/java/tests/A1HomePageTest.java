package tests;

import org.testng.Assert;
import org.testng.annotations.Test;



import Pages.HomePage;

public class A1HomePageTest extends HomePage{
	HomePage hmp = new HomePage();


	@Test
	public void HomePageSearchBoxPresence() {
		   String actualName =  hmp.HomePageSearchBox();
	   Assert.assertEquals(actualName,HomeapageSearchboxTitle);
		
	}
	
	@Test
	public void addressTabPresence() {
		
		hmp.sortTab();
		
	}
	
}
