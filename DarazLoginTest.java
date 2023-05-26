
package Daraz;

//Test Script: Log in to a website
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DarazLoginTest {

	public static void main(String[] args) {

		// Setting the webdriver.chrome.driver property to its executable's location
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");

		// Launch the web browser and navigate to the Daraz website
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.daraz.com.bd/");

		// Click on the "Sign Up/Log In" link in the header
		WebElement signUpLogInLink = driver.findElement(By.linkText("SIGNUP / LOGIN"));
		signUpLogInLink.click();
		// Find the login link and click it
		// WebElement loginLink = driver.findElement(By.linkText("Log In"));
		// loginLink.click();
		driver.manage().window().maximize();
		// Find the username and password input fields and enter valid credentials
		// WebElement usernameInput =
		// driver.findElement(By.placeholder("custom-cursor-default-hover"));
		// Find the element by placeholder attribute
		WebElement usernameInput = driver
				.findElement(By.cssSelector("[placeholder='Please enter your Phone Number or Email']"));

		usernameInput.sendKeys("01932454510");
		// WebElement passwordInput =
		// driver.findElement(By.className("custom-cursor-default-hover"));
		// Find the element by placeholder attribute
		WebElement passwordInput = driver.findElement(By.cssSelector("[placeholder='Please enter your password']"));
		passwordInput.sendKeys("v6nLUCJQ4R");

		// Find the submit button and click it
		WebElement submitButton = driver.findElement(By.xpath("//button[contains(text(), 'LOGIN')]"));
		submitButton.click();

		// Check that the page title contains "Welcome"
		String pageTitle = driver.getTitle();
		boolean pageTitleContainsSellOnDaraz = pageTitle.contains(
				"Daraz.com.bd: Online Shopping Bangladesh - Mobiles, Tablets, Home Appliances, TV, Audio &amp; More");
		if (pageTitleContainsSellOnDaraz) {
			System.out.println("Test Case Login: Passed");
		} else {
			System.out.println("Test Case Login: Failed");
		}

		try {
			Thread.sleep(5000); // Wait for 5 seconds (5000 milliseconds)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Test successful");

		// Close the browser
		driver.quit();
	}
}
