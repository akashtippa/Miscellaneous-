package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AddEmployee {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"menu_pim_addEmployee\"]")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("firstName")).sendKeys("Akash");
		driver.findElement(By.id("middleName")).sendKeys("Ashok");
		driver.findElement(By.id("lastName")).sendKeys("tippa");
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys("14551");
		driver.findElement(By.id("photofile")).sendKeys("C:\\JavaFrame\\Miscelleneous\\hd00.jpg");
		
		driver.findElement(By.id("chkLogin")).click();
		driver.findElement(By.id("user_name")).sendKeys("testco");
		driver.findElement(By.id("user_password")).sendKeys("Akash@123");	
		driver.findElement(By.id("re_password")).sendKeys("Akash@123");
		Select item= new Select(driver.findElement(By.id("status")));
		item.selectByValue("Enabled");
		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
		
		
	}
}
