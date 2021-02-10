package Rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		int rows= driver.findElements(By.xpath("//*[@id=\"task-table\"]/tbody/tr")).size();
		System.out.println(rows);
		int colomn= driver.findElements(By.xpath("//*[@id=\"task-table\"]/thead/tr/th")).size();
		System.out.println(colomn);
		
		System.out.println("number"+"     "+"task"+"    "+"Assignee"+"   "+"Status");
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=colomn;c++)
			{
				String user= driver.findElement(By.xpath("//*[@id=\"task-table\"]/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.println(user+ "     ");
				
			}
			System.out.println();
		}
		
				
	}
}
