package CompareImagesUsingAshotAPI;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class ComapretheImages {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
	
		BufferedImage expectedImage=ImageIO.read(new File("C://JavaFrame//Miscelleneous//orange.png"));
		WebElement LogoImage = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		Screenshot logoImageScreenshot= new AShot().takeScreenshot(driver, LogoImage);
		BufferedImage actualImage=logoImageScreenshot.getImage();
		
		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff diff = imgDiff.makeDiff(expectedImage, actualImage);
		
		if(diff.hasDiff()==true) //this will compare 2 images
		{
			System.out.println("Images are NOT same");
		}
		else
		{
			System.out.println("Images are same");
		}
		
		
	}
	
}
