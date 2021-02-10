package BarcodeAutomation;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class ReadTextFromBarcode {

	public static void main(String[] args) throws IOException, NotFoundException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testautomationpractice.blogspot.com/");
		//String BarcodeURL = driver.findElement(By.xpath("//*[@id=\"HTML12\"]/div[1]/img[1]")).getAttribute("src");
		String BarcodeURL = driver.findElement(By.xpath("//*[@id=\"HTML12\"]/div[1]/img[2]")).getAttribute("src");
		//System.out.println(BarcodeURL);
		
		URL url= new URL(BarcodeURL);
		BufferedImage bufferedImage = ImageIO.read(url);
		
		LuminanceSource luminancesource= new BufferedImageLuminanceSource(bufferedImage);
		
		BinaryBitmap binarybitmap = new BinaryBitmap(new HybridBinarizer(luminancesource));
		
		Result result = new MultiFormatReader().decode(binarybitmap);
		
		System.out.println(result.getText());
	}

}
