package DropdownsareSortedornot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDroopDownSortedOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\sel\\BrowserDrive\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testautomationpractice.blogspot.com/");
		WebElement element = driver.findElement(By.id("animals"));
		Select se = new Select(element);
		
		List orginalList = new ArrayList();
		
		
		//capture all options from dropdown
		
		
		
		List originalList = new ArrayList<>();
		List tempList = new ArrayList();
	
		List <WebElement>options= se.getOptions();
		for(WebElement e:options)
		{
			orginalList.add(e.getText());
			tempList.add(e.getText());
		}
		System.out.println("Before sorting original List:"+orginalList);
		System.out.println("Before sorting temp list:"+tempList);
		
		Collections.sort(tempList);
		
		System.out.println("After Sorting original list:"+orginalList);
		System.out.println("After Sorting temp list:"+tempList);
	
	if(orginalList==tempList)
	{
		System.out.println("Dropdown Sorted");
	}
	else
	{
		System.out.println("Dropdown not sorted");
	}
}
}
