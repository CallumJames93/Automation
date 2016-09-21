package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FIrstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// Create a new instance of the FireFox driver
		WebDriver driver = new FirefoxDriver();
        
		// Launch the Online Store Website
		driver.get("http://www.store.demoqa.com");
		
		// Print a Log In Message to the screen
		System.out.println("Successfully Launched Site");
		
		// Wait for 5 sec
		Thread.sleep(5);
		
		// Close the drive
		driver.quit();
	}

}
