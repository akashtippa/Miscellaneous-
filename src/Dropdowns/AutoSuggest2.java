package Dropdowns;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggest2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		List<WebElement> country =driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
		for(WebElement countrys: country)
		{
			if(countrys.getText().equalsIgnoreCase("India"))
			{
				countrys.click();
				break;
			}
		}
	}

}
