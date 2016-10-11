package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) {
		// Launch Firefox
		WebDriver driver = new FirefoxDriver();
		String URL = "http://toolsqa.wpengine.com/iframe-practice-page/";
		driver.get(URL);
		// Switch to the first iFrame
		driver.switchTo().frame(0);
		// Find the first name field and second name field and enter data
		WebElement firstName = driver.findElement(By.name("firstname"));
		WebElement lastName =  driver.findElement(By.name("lastname"));
		firstName.sendKeys("Callum");
		lastName.sendKeys("Gill");
		//Switch back to the original webpage
		driver.switchTo().defaultContent();
		
		// Switch to second frame
		driver.switchTo().frame(1);
		WebElement imageElement = driver.findElement(By.xpath(".//*[@id='post-9']/div/div[1]/div/p[1]/a/img"));
		imageElement.click();
	    System.out.println("Test Successful: Frame switching was completed successfully.");
	    driver.quit();
	}

}
