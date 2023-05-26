package Daraz;

// Verify the website header
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DarazHeaderTest {
	public static void main(String[] args) {

		// Set the driver path
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");

		// Launch the web browser and navigate to the website
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.daraz.com.bd/");

		// Check that the website header is present and visible
		WebElement header = driver.findElement(By.cssSelector("h1"));
		if (header.isDisplayed()) {
			System.out.println("Test Case 2: Passed");
		} else {
			System.out.println("Test Case 2: Failed");
		}

		// Close the browser
		driver.quit();
	}
}
