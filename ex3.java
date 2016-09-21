package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ex3 {

	public static void main(String[] args) {
		
		// Start driver
		WebDriver driver = new FirefoxDriver();
		// Declare URL and load
		String URL;
		URL = "http://www.demoqa.com";
		driver.get(URL);
		// Click on the registration element by its ID
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		// Use the back command to navigate back
		driver.navigate().back();
		// Use the forward command to go back to the navigation page
		driver.navigate().forward();
		// Use the to command to navigate to homepage
		driver.navigate().to(URL);
		// Refresh the page
		driver.navigate().refresh();
		// Quit
		driver.quit();

	}

}
