package Daraz;

// Verify the search bar is present on the Daraz website
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DarazSearchboxTest {
	public static void main(String[] args) {

		// Setting the webdriver.chrome.driver property to its executable's location
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");

		// Launch the web browser and navigate to the Daraz website
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.daraz.com.bd/");

		// Check that the search bar is present on the page
		WebElement searchBox = driver.findElement(By.name("q"));
		boolean searchBarPresent = searchBox.isDisplayed();
		if (searchBarPresent) {
			System.out.println("Test Case 3: Passed");
		} else {
			System.out.println("Test Case 3: Failed");
		}

		// Close the browser
		driver.quit();
	}
}
