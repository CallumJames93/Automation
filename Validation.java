package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validation {

	public static void main(String[] args) {
		
		// Create driver
		WebDriver driver = new FirefoxDriver();
		// Load URL
		String URL = "http://store.demoqa.com/";
		driver.get(URL);
		// create a variable that returns true or false 
		if(!driver.findElements(By.xpath("//*[@id='log']")).isEmpty()){
			System.out.println("Test Failed: Username field was not found!");
			driver.quit();
		}
		else{
			System.out.print("Test Passed: Username field is present!");
		}
		
		driver.quit();

	}

}
