package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeLogin {

	public static void main(String[] args) {
		
		// Launch Chrome
		 String exePath = "C:\\Users\\Callum\\Desktop\\ChromeDriver\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver ();
		 String URL = "https://phptravels.org/clientarea.php";
		 driver.get(URL);
		 // Verify on the correct page
		 if(driver.findElements(By.xpath(".//*[@id='main-body']/div[1]/div/div/div/h1")).isEmpty()){
			 System.out.println("Test Failed: Login page was not found!");
			 driver.quit();
		 }
		// Enter username
			String userEmail = "callumcode@gmail.com";
			driver.findElement(By.id("inputEmail")).sendKeys(userEmail);
			System.out.println("Test Step Passed: User email was entered!");
			// Enter password
			String userPass = "testpass123";
			driver.findElement(By.id("inputPassword")).sendKeys(userPass);
			System.out.println("Test Step Passed: User password was entered!");
			// Now submit Submit form
			driver.findElement(By.id("login")).submit();
			// Validate log in was successful
			if(!driver.findElements(By.xpath(".//*[@id='main-body']/div[1]/div[1]/div/h1")).isEmpty()){
				System.out.println("Test Failed: Login was successful!");
				driver.quit();
			}
			else{
				System.out.println("Login was unsuccessful !");
			}
			
			driver.quit();

		}

	}


