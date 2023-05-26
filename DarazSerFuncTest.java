package Daraz;

// Verify the website search functionality
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DarazSerFuncTest {
	public static void main(String[] args) {

		// Set the driver path
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");

		// Launch the web browser and navigate to the website
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.daraz.com.bd/");

		// Enter a search term and submit the search form
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("smartphone");
		searchBox.sendKeys(Keys.RETURN);

		// Check that the search results page is displayed
		WebElement searchResults = driver.findElement(By.cssSelector("body"));
		if (searchResults.getText().contains("Search Results")) {
			System.out.println("Test Case 3: Passed");
		} else {
			System.out.println("Test Case 3: Failed");
		}

		// Close the browser
		driver.quit();
	}
}
