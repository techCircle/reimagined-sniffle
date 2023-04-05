package basicSeleniumTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassTasks {
	
	

	WebDriver driver;
	Actions action; 

	@BeforeMethod
	public void openBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		action= new Actions(driver);
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void test1() {
		
		action.moveToElement(driver.findElement(
				By.xpath("//div[@id='nav-tools']/a[2]"))).build().perform();
		
		AssertJUnit.assertTrue(false);
		
		
	}
	
	
	
	
	
	
	

}
