package jUnitTestingPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationTesting {
	
	
	
	@Before
	public void before() {
		System.out.println("BrowserOpening and Maximizing");
	}
	
	
	@Test
	public void ValidUsernameAndValidPassword() {
		System.out.println("Executing Testing");

	}
	
	@Test
	public void inValidUsernameAndValidPassword() {
		System.out.println("Executing Testing ");

	}
	
	@Ignore
	@After
	public void after() {
		System.out.println("Browser Closing/Quiting");

	}
	
	
	
	
	
	
	

}
