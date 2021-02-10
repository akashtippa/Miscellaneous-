package WindowHandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windownhandle2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> It = windows.iterator();
		String parentID = It.next();
		String ChildID = It.next();
		driver.switchTo().window(ChildID);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		
		driver.switchTo().window(parentID);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());

	}

}
