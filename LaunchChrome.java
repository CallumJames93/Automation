package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		 String exePath = "C:\\Users\\Callum\\Desktop\\ChromeDriver\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver ();
		 driver.get("http://toolsqa.com/automation-practice-form/");
	}

}
