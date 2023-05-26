package Daraz;

//Test Case: Add a product to cart

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DarazAddToCartTest {
	public static void main(String[] args) {

		// Set the driver path
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");

		// Launch the web browser and navigate to the website
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.daraz.com.bd/");
		driver.manage().window().maximize();
		// Search for a product
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Laptop");
		searchBox.submit();

		// Click on the first search result
		// WebElement searchResult = driver.findElement(By.name("Hp"));
		WebElement searchResult = driver.findElement(
				By.cssSelector("img[src=\"https://static-01.daraz.com.bd/p/94499b00ba09f29c1c9d994870b4877a.png\"]"));
		searchResult.click();

		// Add the product to cart
		WebElement addToCartBtn = driver.findElement(By.className("add-to-cart-buy-now-btn"));
		addToCartBtn.click();

		// Verify that the product is added to cart
		WebElement cartButton = driver.findElement(By.xpath("//a[@class='cart-button']"));
		String cartCount = cartButton.getText();
		if (cartCount.equals("1")) {
			System.out.println("Test Case: Add to Cart - Passed");
		} else {
			System.out.println("Test Case: Add to Cart - Failed");
		}

		// Close the browser
		driver.quit();
	}
}
