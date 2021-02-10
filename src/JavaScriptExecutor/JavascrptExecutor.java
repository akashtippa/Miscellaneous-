package JavaScriptExecutor;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class JavascrptExecutor {

	
	public static void main(String[] args) throws IOException {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
//		//Flashing
		WebElement joinfree= driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a"));
//		JavaScriptutils.flash(joinfree, driver);
		
		//Drawing border
		//JavaScriptutils.drawBorder(joinfree, driver);
//		//Drawing border and capture screensot
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File trg= new File("C://Screenshot/twoplug.png");
//		FileUtils.copyFile(src, trg);
		
		//Capture title of the page
		//System.out.println(driver.getTitle());
	
		String title=JavaScriptutils.getTitleByJS(driver);
		System.out.println(title);
		
		//clicking on element
//		WebElement loginbtn= driver.findElement(By.xpath("/html/body/div/header/div/ul/li[1]/a"));
//		JavaScriptutils.clickElementbyJS(loginbtn, driver);
		
		//Generate an alert
		//JavaScriptutils.generateAlert(driver, "You clicked on Login button");
		
		//refreshing page
		//driver.navigate().refresh();
		//in javascript
		//JavaScriptutils.refreshPageJS(driver);
		
		//Scroll down the page till we found element
			WebElement WebImage = driver.findElement(By.xpath("//*[@id=\"rslides3_s0\"]/div[1]/img"));
		JavaScriptutils.scrollIntoView(WebImage, driver);
		JavaScriptutils.scrollPageDown(driver);
	}	
	
	
}
