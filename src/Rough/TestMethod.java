package Rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMethod {

	public WebDriver driver;
	
	@BeforeTest
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void Login() throws InterruptedException
	{
		
		
		driver.get("https://admin-demo.nopcommerce.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(6000);
	}
	
	@Test
	public void AddRole() throws InterruptedException
	{
		driver.findElement(By.xpath("li.treeview:nth-child(4) > a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='menu-item-title'][normalize-space()='Customers']")).click();
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
