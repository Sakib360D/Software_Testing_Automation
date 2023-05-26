package Daraz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DarazLogoTest {
	public static void main(String[] args) {

		// Set the driver path
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");

		// Launch the web browser and navigate to the website
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.daraz.com.bd/");

		// Check that the website logo is present and visible
		WebElement logo = driver.findElement(By.cssSelector(
				"img[src=\"//icms-image.slatic.net/images/ims-web/bfe8de2c-b737-42ab-b1f1-576042ab0412.png\"]"));
		if (logo.isDisplayed()) {
			System.out.println("Test Case 1: Passed");
		} else {
			System.out.println("Test Case 1: Failed");
		}

		// Close the browser
		driver.quit();
	}
}
