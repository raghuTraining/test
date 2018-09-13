package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.AmazonPayPage;

public class A3AmazonPayPageTest extends A2TodaysDealsTest{

	
	AmazonPayPage Ap = new AmazonPayPage();
	
	@Test
	public void AmazonPayPagelinkPresence() {
		
    String amazonPayTitle = Ap.AmazonPayLink();
		
    Assert.assertEquals(amazonPayTitle,"Amazon.in: Amazon Pay");

		
		
	}
}
