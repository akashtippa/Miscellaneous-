package QRCode;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.plaf.multi.MultiButtonUI;

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

public class ReadingQRCode {

	public static void main(String[] args) throws IOException, NotFoundException {
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testautomationpractice.blogspot.com/");
		String QRCodeURL = driver.findElement(By.xpath("//*[@id=\"HTML4\"]/div[1]/img")).getAttribute("src");
		
		URL url= new URL(QRCodeURL);
		ImageIO.read(url);
		BufferedImage bufferedimage = ImageIO.read(url);
		LuminanceSource liminancesource = new BufferedImageLuminanceSource(bufferedimage);
		BinaryBitmap binarybitmap = new BinaryBitmap(new HybridBinarizer(liminancesource));
		
		Result result= new MultiFormatReader().decode(binarybitmap);
		System.out.println(result.getText());
		
				
	}
}
