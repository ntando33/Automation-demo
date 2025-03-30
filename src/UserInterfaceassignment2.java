import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
//import java.time.Duration;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import dev.failsafe.internal.util.Assert;
//import org.openqa.selenium.WebElement;

public class UserInterfaceassignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","Documents");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.netflix.com/browse");
		
		
		driver.close();
		driver.quit();
//		//driver.get("https://www.rahulshettyacademy.com/angularpractice/");
//		// Writing on name text box using cssSelector
//		driver.findElement(By.cssSelector("input[name*='name']")).click();
//		//System.out.println(driver.findElement(By.cssSelector("input[name*='name']")).isSelected());
//		driver.findElement(By.name("name")).sendKeys("Rashil Chetty");
//		
//		// Writing email text box using cssSelector
//		driver.findElement(By.cssSelector("input[name*='email']")).click();
//		//System.out.println(driver.findElement(By.cssSelector("input[name*='email']")).isSelected());
//		driver.findElement(By.name("email")).sendKeys("Contact@rahulshettyacademy.com");
//		
//		// Writing password text box using xPath
//		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).click();
//		//System.out.println(driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).isSelected());
//		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("Password#101");
//		
//		// ticking the check box for ice creams
//		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
//		System.out.println(driver.findElement(By.xpath("//input[@id='exampleCheck1']")).isSelected());
//		
//		// get the selected element name
//		System.out.println(driver.findElement(By.xpath("//input[@id='exampleCheck1']")).getAttribute("id"));
//		
//		// Create object of the Select class and Select the option by text
//		Select se = new Select(driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']")));
//		se.selectByVisibleText("Female");
//		
//		//selecting the Student radio button
//		driver.findElement(By.xpath("//input[@id='inlineRadio2']")).click();
//		
//		//selecting and writing birthday month
//		driver.findElement(By.xpath("//body/app-root[1]/form-comp[1]/div[1]/form[1]/div[7]/input[1]")).click();
//		driver.findElement(By.xpath("//body/app-root[1]/form-comp[1]/div[1]/form[1]/div[7]/input[1]")).sendKeys("19970220");
//		
//		//selecting submit button
//		driver.findElement(By.xpath("//body/app-root[1]/form-comp[1]/div[1]/form[1]/input[1]")).click();
//		
//		//Get / verify alert massage
//		System.out.println(driver.findElement(By.xpath("//body/app-root[1]/form-comp[1]/div[1]/div[2]/div[1]")).getAttribute("x"));
			

		
		
		/*System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
		System.out.println("its enabled");
		Assert.assertTrue(true);
		}
		else
		{
		Assert.assertTrue(false);
		}*/
		
		//Answers 
//		import org.openqa.selenium.By;
//		import org.openqa.selenium.Keys;
//		import org.openqa.selenium.WebDriver;
//		import org.openqa.selenium.WebElement;
//		import org.openqa.selenium.chrome.ChromeDriver;
//		import org.openqa.selenium.support.ui.Select;
//		public class Assignment {
//
//		public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/angularpractice/");
//		driver.findElement(By.name("name")).sendKeys("rahul");
//		driver.findElement(By.name("email")).sendKeys("hello@abc.com");
//		driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
//		driver.findElement(By.id("exampleCheck1")).click();
//		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
//		Select abc = new Select(dropdown);
//		abc.selectByVisibleText("Female");
//		driver.findElement(By.id("inlineRadio1")).click();
//		driver.findElement(By.name("bday")).sendKeys("02/02/1992");
//		driver.findElement(By.cssSelector(".btn-success")).click();
//		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
//		}
//
//		}

	}

}
