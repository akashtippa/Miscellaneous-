package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JavaFrame\\Miscelleneous\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		int size= driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("/html/body/a")).click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		driver.close();
		
	}
}
