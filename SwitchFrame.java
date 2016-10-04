package automationFramework;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchFrame {

	public static void main(String[] args) {
		
		// Launch browser
		WebDriver driver = new FirefoxDriver();
		String URL = "http://toolsqa.wpengine.com/automation-practice-switch-windows/";
		driver.get(URL);
		// Get window name
		String handle = driver.getWindowHandle();
		// Click on the New Window button
		driver.findElement(By.xpath(".//*[@id='content']/p[3]/button")).click();
		// Get the new window and switch to it
		for (String newHandle : driver.getWindowHandles()){
			  driver.switchTo().window(newHandle).close();;
		}
		driver.quit();
		System.out.println("Test Passed: Popup handled");

	}

}
