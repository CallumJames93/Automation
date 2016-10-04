package automationFramework;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	
	public WebDriver driver;
	
	  @BeforeMethod
	  public void beforeMethod() {
		  WebDriver driver = new FirefoxDriver();
		  String URL = "https://phptravels.org/clientarea.php";
		  driver.get(URL);	  
		  }

	 @Test
	 public void launch(){
			if(driver.findElements(By.xpath(".//*[@id='main-body']/div[1]/div/div/div/h1")).isEmpty()){
				System.out.println("Test Failed: Login page was not found");
				driver.quit();
			}else{
				System.out.println("Test Step Passed: Login page was found!");
			}
	 }
	 
  @AfterMethod 
  public void tearDown() {
          if (driver != null) {
                driver.quit(); 
            }
          }    
   }
