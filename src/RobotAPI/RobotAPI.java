package RobotAPI;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotAPI {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Courses")).click();
		Robot robot = new Robot();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		System.out.println("a");
		robot.keyPress(KeyEvent.VK_TAB);
		System.out.println("b");
		robot.keyPress(KeyEvent.VK_TAB);
		System.out.println("c");
		robot.keyPress(KeyEvent.VK_TAB);
		System.out.println("d");
		
		
	       
	}

}
