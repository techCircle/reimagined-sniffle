package basicSeleniumTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxesTesting {

	WebDriver driver;

	@BeforeMethod
	public void openBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void test1() {

		WebElement checkBox1 = driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]"));

		Boolean isTrueOrFALSE = checkBox1.isSelected();

		if (isTrueOrFALSE) {
			System.out.println("It is selected");
		} else {
			checkBox1.click();
		}

		//////

//		 if(isTrueOrFALSE) {
//	            System.out.println("It is selected");
//	        } else {
//	            driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).click();
//	        }
		WebElement checkBox2 = driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]"));

		Boolean isTrueOrFALSE2 = checkBox2.isSelected();

		if (isTrueOrFALSE2) {
			System.out.println("It is selected");
		} else {
			checkBox2.click();

		}
	}
	
	
	@Test
	public void test2() {
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//xpath")))).click();;
		

		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}