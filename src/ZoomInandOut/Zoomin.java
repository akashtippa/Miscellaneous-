package ZoomInandOut;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import RobotAPI.RobotAPI;

public class Zoomin 
{
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\JavaFrame\\Miscelleneous\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		for(int i=0;i<3;i++)
		{
			robot.keyPress(KeyEvent.VK_ADD);
			robot.keyRelease(KeyEvent.VK_ADD);
			
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
		}
		robot.keyRelease(KeyEvent.VK_CONTROL);
		driver.close();
	}
}
