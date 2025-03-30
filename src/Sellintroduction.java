import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebElement;
//import org.testng.Assert

public class Sellintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Chrome Driver
		System.setProperty("Webdriver.chrome.driver","Documents");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//Checking the checkbox and confirming it checked and uncheck the checkbox and confirm
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); //URL in the browser
		//System.out.println(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected()); checking if the checkbox is checked
		driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();	
		//Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//Assert.assertFalse(true);
		Boolean checkbox = driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected();
		if(checkbox != true){
			System.out.println("Not checked");
		}
		driver.findElements(By.cssSelector("input[value='checkbox']")).size();
		driver.close();
		driver.quit();
		//Answers
		/*
		    1. Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked

			driver.findElement(By.id("checkBoxOption1")).click();

			System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print True

			driver.findElement(By.id("checkBoxOption1")).click();

			System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print false

			2. How to get the Count of number of check boxes present in the page

			driver.findElements(By.cssSelector("input[value='checkbox']")).size();
		 */

	}
}