package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		// Launch Firefox
		WebDriver driver = new FirefoxDriver();
		String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(URL);
		// Select Country Dropdown
		WebElement dropdownElement = driver.findElement(By.xpath(".//*[@id='continents']"));
		Select oSelect = new Select (dropdownElement);
		// Then select Europe byIndex
		try {
		oSelect.selectByIndex(1);
		System.out.println("Test Passed: Europe was selected !");
		}
		catch (IndexOutOfBoundsException e) {
	    System.out.println("Test Failed: Europe was not selected !");
		}

	}

}
