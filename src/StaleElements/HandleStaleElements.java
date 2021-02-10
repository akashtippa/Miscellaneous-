package StaleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleStaleElements {

	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pavantestingtools.com/");
		WebElement link= driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[2]/a"));
		link.click();
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[2]/ul/li[1]/a")).click();
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		try
		{
		
			link.click();
		}
		catch(StaleElementReferenceException e) 
		{
			WebElement link1= driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[2]/a"));
			link1.click();
			driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[2]/ul/li[1]/a")).click();
		}
	}
}


