package BrokenLinks;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
			
		
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();
		for(WebElement link:links)
		{

			String url = link.getAttribute("href");
			HttpURLConnection conn =(HttpURLConnection)new URL(url).openConnection();
			
			conn.setRequestMethod("HEAD");
			conn.connect();
			
			int ResponseCode =conn.getResponseCode();
			System.out.println(ResponseCode);
			a.assertTrue(ResponseCode<400,"the link with text:" +link.getText()+ " is the broken link:" +ResponseCode);
			
		}
		a.assertAll();
//			if(ResponseCode>400)
//			{
//				System.out.println("the link with text:" +link.getText()+ " is the broken link:" +ResponseCode);
//				Assert.assertTrue(false);
//			}
//		}
		
		//Broken URL
		// java methods will call URL's and gets you the status code
		
	}

}
