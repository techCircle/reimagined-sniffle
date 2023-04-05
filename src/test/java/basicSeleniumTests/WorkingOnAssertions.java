package basicSeleniumTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingOnAssertions {

	WebDriver driver;

	@BeforeMethod
	public void openBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test(enabled = false)
	@Test
	public void assertTrueTest() {

		String title = driver.getTitle();

		AssertJUnit.assertTrue(title.equals("Google"));

	}
	
	@Test(enabled = false)
	@Test
	public void assertFalseTest() {

		String title = driver.getTitle();

		AssertJUnit.assertFalse(title.equals("Youtube"));

	}
	
	@Test(enabled = false)
	@Test
	public void assertEquals() {

		String title = driver.getTitle();

		AssertJUnit.assertEquals("Google, Inc",title );

	}
	
	
	@Test
	public void softAssertions() {
		
		SoftAssert softAssertion = new SoftAssert();
		System.out.println("Soft assert start");
		AssertJUnit.assertTrue(false);
		System.out.println("Soft assert ends");

	}
	
	
	
	
	

}
