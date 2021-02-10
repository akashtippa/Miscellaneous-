package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class StaticDropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		//http://username:password@test.com
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement staticdropdown =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		//select dropdown with select tag
		Select dropdown =new Select(staticdropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
	}
}
