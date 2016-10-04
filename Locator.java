package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator {

	public static void main(String[] args) {
	   WebDriver driver = new FirefoxDriver();
	   String URL = "https://www.google.com";
	   driver.get(URL);
	   driver.quit();

	}

}
