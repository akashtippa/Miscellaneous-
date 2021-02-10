package DatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		String month= "March 2020";
		String day= "20";
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://superbmytrip.com/flights?gclid=EAIaIQobChMI-KaZtbCG7gIVyzArCh11hw9bEAAYASAAEgJ1-PD_BwE");
		driver.findElement(By.xpath("//*[@id=\"txtOnwardDate\"]")).click();
		Thread.sleep(3000);
		
		while(true) 
		{
			String text=driver.findElement(By.xpath("//*[@id=\"txtOnwardDate\"]")).getText();
			if(text.equals(month))
			{
				break;
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"divCalender\"]/div[2]/div/div[1]/a/span/i")).click();
			}
		}
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr/td[contains(text(),"20"]")));
	}
	
}
