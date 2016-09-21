package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex5 {

	public static void main(String[] args) {
		
		// Start the driver
		WebDriver driver = new FirefoxDriver();
		// Create the URL variable. Then launch the Web browser
		String URL;
		URL = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(URL);
		System.out.println("URL launched !");
		// Find the element by Partial Link text
		String partialKeyword;
		partialKeyword = "Partial";
		driver.findElement(By.partialLinkText(partialKeyword)).click();
		System.out.println("Partial test passed !");
		// Identify Submit button and print to console
		WebElement tagName = driver.findElement(By.tagName("button"));
		System.out.println(tagName);
		System.out.println("Button test passed !");
		//
		driver.findElement(By.linkText("Link Test")).click();
	    System.out.println("Link Test test passed !");
	    driver.quit();
	    

	}

}
