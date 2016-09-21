package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		// Launch the Online Store site
		driver.get("http://www.demoqa.com/frames-and-windows/");
		System.out.println("URL was launched");
	    
		// Click on an element tabs 1
		driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
		
		// Close the browser
		driver.quit();	
		System.out.println("Testing Complete!");
		

	}

}
