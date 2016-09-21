package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class driver {

	public static void main(String[] args) {
		
		// Create new driver
		WebDriver driver = new FirefoxDriver();
		// Launch URL
		String URL;
		URL = "http://store.demoqa.com";
		driver.get(URL);
		// Get the page title
		String Title;
	    Title = driver.getTitle();
	    // Record the length
		int titleLength;
		titleLength = Title.length();
		// Output both Title
		System.out.println(Title);
		// Output Length
		System.out.println(titleLength);
		// Get the current URL
		String currentURL;
		currentURL = driver.getCurrentUrl();
		// Verify the correct page opened
		if(currentURL == URL){
			
			System.out.println("The Current URL is Correct!");
			
		}
		else {
			
			System.out.println("The URL is incorrect");
			System.out.println("The current URL is" + " " + currentURL);
		}
		
		String pageSource;
		pageSource = driver.getPageSource();
		int pageLength;
		pageLength = pageSource.length();
		System.out.println(pageLength);
		
		driver.quit();

	}

}
