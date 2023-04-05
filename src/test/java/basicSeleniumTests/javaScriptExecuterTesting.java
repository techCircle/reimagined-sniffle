package basicSeleniumTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaScriptExecuterTesting {
	
	WebDriver driver;

	@BeforeMethod
	public void openBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() {
		
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[11]/td[5]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("javascript:window.scrollBy(250,350)");
//		
//		
	
	
	
//		
//		
//		WebElement m = driver.findElement(By.linkText("Company"));
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		
//		js1.executeScript("arguments[0].click();", m);
//	
	
	}
	
	
	
	
	
	
	
	
	
	
	

}
