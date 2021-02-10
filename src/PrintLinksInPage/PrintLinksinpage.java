package PrintLinksInPage;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLinksinpage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//get total number of links in footers
		
		//limiting  the  driver to get links in footer
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		
		WebElement colomnelement = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(colomnelement.findElements(By.tagName("a")).size());
		
		
		//click on each link in the coloumn and check if pages are opening
		for(int i=1;i<colomnelement.findElements(By.tagName("a")).size(); i++)
		{
			
			String clickonlinkTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
			colomnelement.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000);
		}
		Set<String> windowsTitles=driver.getWindowHandles();
		Iterator<String>it = windowsTitles.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}
		
}

