package tests;

import java.util.HashMap;

import org.testng.annotations.Test;

import Pages.DashBoardElementpage;
import utils.util;

public class A4DashBoardElementsTest extends A3AmazonPayPageTest{

	
	DashBoardElementpage dbe = new DashBoardElementpage();
	@Test
	public void yourOdersMembershipElementPesence() {
		
		dbe.yoursOrdersElement();
		
	}
	
	@Test
	public void quitDriver() throws InterruptedException {
		Thread.sleep(3000);
		util util = new util() ;
			util.quitDriver();
			
		
	}
}
