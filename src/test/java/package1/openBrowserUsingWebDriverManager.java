package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openBrowserUsingWebDriverManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//declare the driver object
				WebDriver driver;
				
				WebDriverManager.chromedriver().setup();

				//initialized webdriver to chromedriver
				driver = new ChromeDriver();

				// windowsUsers
				// \\Users\\techcircle\\Downloads\\chromedriver_mac_arm64\\chromedriver.exe
				String url = "https://www.techcircleschool.com/";

				driver.get(url);
		
		
		
		
		
		
		

	}

}
