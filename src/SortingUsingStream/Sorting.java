package SortingUsingStream;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sorting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		
		
		//capture All the webelements into list
		List<WebElement> ElementList = driver.findElements(By.xpath("//tr/td[1]"));
		//capture texts of all webelement into new()orginal list
		List<String>OriginalList=ElementList.stream().map(s->s.getText()).collect(Collectors.toList());
		//sort in the orginal list of step 3 ->sorted list 
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<String> sortedList= OriginalList.stream().sorted().collect(Collectors.toList());
		System.out.println(OriginalList);
		System.out.println(sortedList);
		//compare orginal list vs sorted list
		Assert.assertTrue(OriginalList.equals(sortedList));
		
		
		
		
		
		
		
		//scan the name column with getText ->print the price of the Rice
		List<String> price = ElementList.stream().filter(s->s.getText().contains("Beans")).map(s->getPriceVeggie(s))
		.collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
		
	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		
		String pricevalue = s.findElement(By.xpath("//td[normalize-space()='38']")).getText();
		return pricevalue;
	}

}
