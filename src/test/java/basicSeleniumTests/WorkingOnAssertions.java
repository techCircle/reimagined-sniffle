package basicSeleniumTests;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingOnAssertions {

	WebDriver driver;

	@Before
	public void openBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Ignore
	@Test
	public void assertTrueTest() {

		String title = driver.getTitle();

		Assert.assertTrue(title.equals("Google"));

	}
	
	@Ignore
	@Test
	public void assertFalseTest() {

		String title = driver.getTitle();

		Assert.assertFalse(title.equals("Youtube"));

	}
	
	@Ignore
	@Test
	public void assertEquals() {

		String title = driver.getTitle();

		Assert.assertEquals("Google, Inc",title );

	}
	
	
	@Test
	public void softAssertions() {
		
		SoftAssert softAssertion = new SoftAssert();
		System.out.println("Soft assert start");
		softAssertion.assertTrue(false);
		System.out.println("Soft assert ends");

	}
	
	
	
	
	

}
