package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openingBrowserTesting {

	public static void main(String[] args) {
		//declare the driver object
		WebDriver driver;
		
		// you setting the chrome driver path
		System.setProperty("webdriver.chrome.driver",
				"/Users/techcircle/Downloads/chromedriver_mac_arm64/chromedriver");

		//initialized webdriver to chromedriver
		driver = new ChromeDriver();

		// windowsUsers
		// \\Users\\techcircle\\Downloads\\chromedriver_mac_arm64\\chromedriver.exe
		String url = "https://www.techcircleschool.com/";

		driver.get(url);

	}

}
