package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkboxTest {

	public static void main(String[] args) {
		
		// Start browser session
		WebDriver driver = new FirefoxDriver();
		// Set the URL Variable and launch with driver
		String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(URL);
		// Click Female
		WebElement oCheckbox = driver.findElement(By.cssSelector("input[value='Female']"));
		oCheckbox.click();
		System.out.println("Female checkbox selected");
		driver.quit();

	}

}
