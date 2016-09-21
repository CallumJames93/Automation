package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Register {

	public static void main(String[] args) {
		        // Create driver
				WebDriver driver = new FirefoxDriver();
				// Load URL
				String URL = "http://store.demoqa.com/";
				driver.get(URL);
				// If my account is not available complete the below
				if(driver.findElements(By.className("account_icon")).isEmpty()){
					System.out.println("Test Failed: My Account was not selected!");
					driver.quit();
				}
				// Else click the link
				else{
					driver.findElement(By.className("account_icon")).click();
					System.out.println("Test Passed: Username field is present!");
			           }
				// Verify register is present on page
				if(driver.findElements(By.xpath(".//*[@id='meta']/ul/li[1]/a")).isEmpty()){
					System.out.println("Test Failed: Register was not selected!");
					driver.quit();
				}
				// Click Register
				else{
					driver.findElement(By.xpath(".//*[@id='meta']/ul/li[1]/a")).click();
					System.out.println("Test Passed: Register selected!");
			           }
				// Check username field
				if(driver.findElements(By.id("user_login")).isEmpty()){
					System.out.println("Test Failed: Username field was not present!");
					driver.quit();
				}
				// If username field is present enter the field
				else{
					String userName = "CallumGill";
					driver.findElement(By.id("user_login")).sendKeys(userName);
					System.out.println("Test Passed: Username was entered!");
			           }
				// Check Email field
				if(driver.findElements(By.id("user_email")).isEmpty()){
					System.out.println("Test Failed: Email field was not present!");
					driver.quit();
				}
				// If Email field is present enter the field
				else{
					String userEmail = "callum.gill1993@hotmail.co.uk";
					driver.findElement(By.id("user_email")).sendKeys(userEmail);
					System.out.println("Test Passed: Email was entered!");
			           }
				// Check math question is present
				if(driver.findElements(By.id("aiowps-captcha-answer")).isEmpty()){
					System.out.println("Test Failed: answer field was not present!");
					driver.quit();
				}
				// If Email field is present enter the field
				else{
					int userAnswer = 2;
					driver.findElement(By.id("aiowps-captcha-answer")).sendKeys(String.valueOf(userAnswer));
					System.out.println("Test Passed: Answer was added!");
			           }
	
				
	}

}
