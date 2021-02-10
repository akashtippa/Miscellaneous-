package Checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkboxAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
//		driver.findElement(By.id("checkBoxOption2")).click();
//		Assert.assertTrue(driver.findElement(By.id("checkBoxOption2")).isSelected());
//		System.out.println(driver.findElement(By.id("checkBoxOption2")).isSelected());
//		
//		driver.findElement(By.id("checkBoxOption3")).click();
//		Assert.assertTrue(driver.findElement(By.id("checkBoxOption3")).isSelected());
//		System.out.println(driver.findElement(By.id("checkBoxOption3")).isSelected());
//		
//		driver.findElement(By.id("checkBoxOption1")).click();
//		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		
//		driver.findElement(By.id("checkBoxOption2")).click();
//		Assert.assertFalse(driver.findElement(By.id("checkBoxOption2")).isSelected());
//		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		
//		driver.findElement(By.id("checkBoxOption3")).click();
//		Assert.assertFalse(driver.findElement(By.id("checkBoxOption3")).isSelected());
//		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type$='checkbox']")).size());
		
		
		

	}

}
