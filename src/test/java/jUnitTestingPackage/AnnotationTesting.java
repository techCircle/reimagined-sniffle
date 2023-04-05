package jUnitTestingPackage;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class AnnotationTesting {
	
	
	
	@BeforeMethod
	public void before() {
		System.out.println("BrowserOpening and Maximizing");
	}
	
	
	@Test(groups="@Regression")
	public void ValidUsernameAndValidPassword() {
		System.out.println("Executing Testing");

	}
	
	@Test
	public void inValidUsernameAndValidPassword() {
		System.out.println("Executing Testing ");

	}
	
	@AfterMethod
	public void after() {
		System.out.println("Browser Closing/Quiting");

	}
	
	
	
	
	
	
	

}
