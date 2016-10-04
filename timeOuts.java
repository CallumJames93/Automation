package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class timeOuts {

	public static void main(String[] args) {
		
		// Launch Firefox
		WebDriver driver = new FirefoxDriver();
		String URL = "http://toolsqa.wpengine.com/automation-practice-switch-windows/";
		driver.get(URL);
		// Click on the timing alert button
		driver.findElement(By.xpath(".//*[@id='timingAlert']")).click();
		// Wait for the alert
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, 3);
	        wait.until(ExpectedConditions.alertIsPresent());
	        Alert alert = driver.switchTo().alert();
	        alert.accept();
	    } catch (Exception e) {
	        driver.quit();
	        System.out.println("Test Failed: Alert not found");
	    }
	    // Close browser output to console
	    driver.quit();
	    System.out.println("Test Passed: Alert waited for and accepted!");

	}

}
