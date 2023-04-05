package basicSeleniumTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import Utilities.BaseClass;

public class openBrowserUsingDriverClass {

	@BeforeMethod
	public void beforeMethod() {
		BaseClass.getDriver();

	}

	@Test
	public void test1() {

		String titlePage = BaseClass.getDriver().getTitle();
		System.out.println(titlePage);
		System.out.println(BaseClass.getProperty("userName"));
		System.out.println(BaseClass.getProperty("passWord"));


	}
	
	

	@AfterMethod
	public void afterMethod() {

		BaseClass.closeDriver();

				
	}

}
