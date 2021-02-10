package Headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		System.out.println("Title of the Page:"+driver.getTitle());
		
	}
}
