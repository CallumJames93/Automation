package automationFramework;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeEmu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String exePath = "C:\\Users\\Callum\\Desktop\\ChromeDriver\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		
		 
		 Map<String, String> mobileEmulation = new HashMap<String, String>();
		 mobileEmulation.put("deviceName", "Apple iPhone 5");

		 Map<String, Object> chromeOptions = new HashMap<String, Object>();
		 chromeOptions.put("mobileEmulation", mobileEmulation);
		 DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		 capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		 
		 WebDriver driver = new ChromeDriver (capabilities);
		 
		 driver.get("https://www.paypal.com/uk/webapps/mpp/home");

	}

}
