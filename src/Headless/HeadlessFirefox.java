package Headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\sel\\BrowserDrive\\geckodriver.exe");
		
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		
		
		WebDriver driver= new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		System.out.println("Title of the Page:"+driver.getTitle());
		
	}
}
