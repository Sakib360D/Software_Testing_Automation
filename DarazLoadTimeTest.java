package Daraz;

//Test Case 4 Verify the website page load time
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DarazLoadTimeTest {
	public static void main(String[] args) {

		// Setting the webdriver.chrome.driver property to its executable's location
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");

		// Launch the web browser and navigate to the website
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.daraz.com.bd/");

		// Check that the page load time is within the expected range
		long startTime = System.currentTimeMillis();
		((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
		long endTime = System.currentTimeMillis();
		long pageLoadTime = endTime - startTime;
		if (pageLoadTime <= 5000) {
			System.out.println("Test Case 4 Passed");
			System.out.println("Daraz Load Time is: " + pageLoadTime + " Millisec");

		} else {
			System.out.println("Test Case 4 Failed");
		}

		// Close the browser
		driver.quit();
	}
}
