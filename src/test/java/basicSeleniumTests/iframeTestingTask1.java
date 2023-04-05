package basicSeleniumTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframeTestingTask1 {
	
	

	WebDriver driver;

	@BeforeMethod
	public void openBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test
	public void task1() {
		
		driver.switchTo().frame(0);
		
		
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("Hello Batch 13");
		String stringtext = driver.findElement(By.id("tinymce")).getText();
			System.out.println(stringtext);
			
		driver.switchTo().defaultContent();
	}
	
	

}
