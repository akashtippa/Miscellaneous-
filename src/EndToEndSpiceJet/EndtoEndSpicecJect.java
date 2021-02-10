package EndToEndSpiceJet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EndtoEndSpicecJect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("http://the-internet.herokuapp.com/basic_auth");

		// http://username:password@test.com
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		// relative path
		// driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']
		// //a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("its disabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

		driver.close();

	}

}
