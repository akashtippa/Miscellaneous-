package WindowHandles;

import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> It = windows.iterator();
		String parentId = It.next();
		String ChildID = It.next();
		driver.switchTo().window(ChildID);
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String emailid = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(emailid);
	}

}
