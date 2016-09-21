package automationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex6 {

	public static void main(String[] args) {
		//Start driver and then launch practice form
		WebDriver driver = new FirefoxDriver();
		String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(URL);
		// Select Continent dropdown
		WebElement conDropdown = driver.findElement(By.id("continents"));
		Select oSelect = new Select(conDropdown);
		System.out.println("Continent Dropdown Selected.");
		// Select Europe by index
		oSelect.selectByIndex(1);
		System.out.println("Europe was selected");
		//Select Africa by Vaue
		String visValue = "Africa";
		oSelect.selectByVisibleText(visValue);
		System.out.println("Africa was selected!");
		// Get all values from the dropdown menu and print them to the console
		List <WebElement> elementCount = oSelect.getOptions();
		int iSize = elementCount.size();
		
		for(int i = 0; i>iSize; i++){
			String sValue = elementCount.get(i).getText();
			System.out.println(sValue);;
		}
		System.out.println("Testing complete");
		//Close browser
		driver.quit();
		
		
		}
		
	}


