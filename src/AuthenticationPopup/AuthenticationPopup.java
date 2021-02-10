package AuthenticationPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		//http://username:password@test.com
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String Texts= driver.findElement(By.cssSelector("p")).getText();
		System.out.println(Texts);
		
	}
}
