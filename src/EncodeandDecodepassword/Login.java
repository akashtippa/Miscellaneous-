package EncodeandDecodepassword;

import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/");
		
		
		//driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("admin@yourstore.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(decodeString("VGVzdDEyMw=="));
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/input")).click();
	}
	
	static String decodeString(String password)
	{
		byte[] decodedstring = Base64.getDecoder().decode(password);
		return new String(decodedstring);
		
	}
}
