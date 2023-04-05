package FiftyOneTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getRidOfAd {
	
	
	WebDriver driver;
    WebDriverWait wait; 
    
     @BeforeMethod
	public void openBrowser() {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
           // action = new Actions(driver);
            driver.get("https://practice.automationtesting.in");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            wait = new WebDriverWait(driver,30);
        }
     
     @Test
     public void test2() {
            
         driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]/a")).click();

         driver.switchTo().frame(driver.findElement(By.xpath("//iframe[starts-with(@id,'aswift_8')]")));
         driver.switchTo().frame("ad_iframe");
         
      //   driver.switchTo().frame

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dismiss-button")));
         
         driver.findElement(By.id("dismiss-button")).click();
         
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"menu-item-40\\\"]/a")));
         
         driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]/a")).click();

         
     }

}
