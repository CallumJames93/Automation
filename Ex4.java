package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex4 {

	public static void main(String[] args) {

		        // Start driver
				WebDriver driver = new FirefoxDriver();
				// Declare URL and load
				String URL;
				URL = "http://toolsqa.wpengine.com/automation-practice-form/";
				driver.get(URL);
				// Declare Variables
				String FirstName;
				String LastName;
				FirstName = "Callum";
				LastName = "Gill";
				// Get the elements by Name and the variables to those fields
				driver.findElement(By.name("firstname")).sendKeys(FirstName);
				driver.findElement(By.name("lastname")).sendKeys(LastName);
				//Click Submit with ID
				driver.findElement(By.id("submit")).submit();
				// Driver quit
			    driver.quit();

	}

}
