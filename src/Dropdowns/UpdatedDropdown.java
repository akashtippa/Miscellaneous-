package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		//http://username:password@test.com
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		/*int i=1;
		
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();	
			i++;
		}*/
	for(int i=1; i<5;i++)
	{
		driver.findElement(By.id("hrefIncAdt")).click();
	}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.close();
	}
		
}
