package DataProviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Dataprovider 
{
	public WebDriver driver;
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dev.clientboxx.com/auth/login");
	}
	@Test(dataProvider="getData")
	 public void Login(String email, String password) throws InterruptedException
	{
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys(email);;
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);;
		driver.findElement(By.xpath("//span[normalize-space()='Log In']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='user-icon']")).click();
		driver.findElement(By.xpath("//div[@class='account-tabs-logout']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[2]")).click();
	}
	@DataProvider(name="getData")
	public Object[][] getData()
	{
		Object[][] data= new Object[3][2];
		//1st Set data
		data[0][0]="one.acc@yopmail.com";
		data[0][1]="Test@123";
		
		//2nd Set data
		
		data[1][0]="twoacc@yopmail.com";
		data[1][1]="Test@123";
		
		//3rd Set data
		 
		data[2][0]="three.acc@yopmail.com";
		data[2][1]="Test@123";
		return data;
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
}
