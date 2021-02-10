package CompareImagesUsingAshotAPI;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class CompareImages {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		
		WebElement LogoImage = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		Screenshot logoImageScreenshot= new AShot().takeScreenshot(driver, LogoImage);
		ImageIO.write(logoImageScreenshot.getImage(),"png",new File("C://JavaFrame//Miscelleneous//orange.png"));
		File f= new File("C://JavaFrame//Miscelleneous//orange.png");
		if (f.exists())
		{
			System.out.println("Image file captured");
		}
		else
		{
			System.out.println("Image file not captured");
		}
	}

}
