
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.Alert;
	import java.time.Duration; // Import Duration for timeout
	import io.github.bonigarcia.wdm.WebDriverManager;
	import io.qameta.allure.Step;
	
public class NetflixTestAutomation {

	    public static void main(String[] args) {
	        // Setup WebDriverManager to handle ChromeDriver
	        WebDriverManager.chromedriver().setup();
	        
	        // Initialize ChromeOptions for browser configuration
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications"); // Disable browser notifications (optional)
	        
	        // Create a new instance of Chrome WebDriver
	    	ChromeDriver driver = new ChromeDriver();

	        try {
	            // Step 1: Navigate to Netflix login page
	            driver.get("https://www.netflix.com/login");

	            // Step 2: Enter email (replace with your email)
	            WebElement emailField = driver.findElement(By.id("id_userLoginId"));
	            emailField.sendKeys("your_email@example.com");

	            // Step 3: Enter password (replace with your password)
	            WebElement passwordField = driver.findElement(By.id("id_password"));
	            passwordField.sendKeys("your_password");

	            // Step 4: Click login button
	            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	            loginButton.click();

	            // Step 5: Wait for the Netflix homepage to load
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href='/browse']")));

	            // Step 6: Navigate to a show or movie (example: 'Stranger Things')
	            WebElement searchBar = driver.findElement(By.cssSelector("input[placeholder='Search']"));
	            searchBar.sendKeys("Stranger Things");

	            // Step 7: Wait for search results and click on the show
	            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Stranger Things')]")));
	            WebElement showLink = driver.findElement(By.xpath("//span[contains(text(),'Stranger Things')]"));
	            showLink.click();

	            // Step 8: Wait for the play button and click to start playing the show
	            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.playButton")));
	            WebElement playButton = driver.findElement(By.cssSelector("button.playButton"));
	            playButton.click();

	            // Step 9: Wait for a few seconds to ensure video starts playing
	            Thread.sleep(5000); // Adjust as needed

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Step 10: Close the browser after automation
	            driver.quit();
	        }
	    }
	}

