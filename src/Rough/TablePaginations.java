package Rough;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePaginations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.close();
		WebElement Paging_Element= driver.findElement(By.xpath("//*[@id=\"myPager\"]"));
		
		List<WebElement> sublinks= Paging_Element.findElements(By.tagName("a"));
		System.out.println("totla number of paging elements:"+sublinks.size());
		
		if(sublinks.size()>0)
		{
			System.out.println("links are Present");
			for(int i=1;i<sublinks.size()-1;i++)
			{
				WebElement link=driver.findElement(By.xpath("//a[contains(text(),'"+i+"']"));
				link.click(); 
				int rows= driver.findElements(By.xpath("//*[@id=\"myTable\"]/tr")).size();
			}
		}
		driver.quit();
	}

}
