package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.todaysDealsPage;

public class A2TodaysDealsTest extends A1HomePageTest{
	
	todaysDealsPage tdp = new todaysDealsPage();

@Test
public void todaysDealLinkPresence() throws InterruptedException {
	
	String actualDealsTitle = tdp.todaysDealsLink();
	   Assert.assertEquals(actualDealsTitle,TodaysDealPageTitle);
}
}
