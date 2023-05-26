package Daraz;

// Verify the website title
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DarazTitleTest {
	public static void main(String[] args) {

		// Setting the webdriver.chrome.driver property to its executable's location
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");

		// Launch the web browser and navigate to the website
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.daraz.com.bd/");

		// Check that the website title is correct
		String expectedTitle = "Online Shopping in Bangladesh: Order Now from Daraz.com.bd";
		String actualTitle = driver.getTitle();
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Test Case 1: Passed");
		} else {
			System.out.println("Test Case 1: Failed");
		}

		// Close the browser
		driver.quit();
	}
}
