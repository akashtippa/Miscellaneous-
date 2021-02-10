package Greenkart;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.model.Test;

public class Greenkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait waits= new WebDriverWait(driver, 5);
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(2000);
		

		addItems(driver,itemsNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		waits.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']")));
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//explicit waits
		
		waits.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		
		WebElement dropdown = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]"));
		
		Select select =new Select(dropdown);
		//System.out.println(select.getFirstSelectedOption().getText());
		select.selectByValue("India");
	
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		
		}

		public static  void addItems(WebDriver driver,String[] itemsNeeded)

		{

			int j=0;

			List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

			for(int i=0;i<products.size();i++)

			{

				//Brocolli - 1 Kg

				//Brocolli,    1 kg

				String[] name=products.get(i).getText().split("-");

				String formattedName=name[0].trim();

				//format it to get actual vegetable name

				//convert array into array list for easy search

				//  check whether name you extracted is present in arrayList or not-

				List itemsNeededList = Arrays.asList(itemsNeeded);

				if(itemsNeededList.contains(formattedName))

				{

					j++;

					//click on Add to cart

					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

					if(j==itemsNeeded.length)

					{

						break;

					}
					

				}

		}

	}



}



