package HandlingHTTPSCertifications;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HttpCertification {

	public static void main(String[] args) {
		
		
		//SSL Certificates
		//Desired capabilities
		
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		ch.acceptInsecureCerts();
		ChromeOptions opt = new ChromeOptions();
		opt.merge(ch);
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	}	

}
