package PrintLinksInPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//*[@id=\"checkBoxOption2\"]")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText());
		String opt = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		
		
		//dropdown
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		
		Select sel = new Select(dropdown);
		sel.selectByVisibleText(opt);
		
		//enter text in textfield
		
		driver.findElement(By.id("name")).sendKeys(opt);
		driver.findElement(By.id("alertbtn")).click();
		
		String text = driver.switchTo().alert().getText();
		
		if(text.contains(opt))
		{
			System.out.println("Alert message success");
		}
		else
		{
			System.out.println("Something wrong with executions");
		}
	}
}
