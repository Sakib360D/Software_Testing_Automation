package Daraz;

// Navigate to the "Sell on Daraz" page and click on it
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTest {
	public static void main(String[] args) {

		// Setting the webdriver.chrome.driver property to its executable's location
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");

		// Launch the web browser and navigate to the Daraz website
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.daraz.com.bd/");

		// Click on the "Sell on Daraz" link in the footer
		WebElement sellOnDarazLink = driver.findElement(By.linkText("SELL ON DARAZ"));
		sellOnDarazLink.click();

		// Check that the page title contains "Sell on Daraz"
		String pageTitle = driver.getTitle();
		boolean pageTitleContainsSellOnDaraz = pageTitle.contains("Seller Center");
		if (pageTitleContainsSellOnDaraz) {
			System.out.println("Test Case 9: Passed");
		} else {
			System.out.println("Test Case 9: Failed");
		}

		// Close the browser
		driver.quit();
	}
}
