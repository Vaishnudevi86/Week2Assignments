package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) {
		// Step 1: Download and set the path
		WebDriverManager.chromedriver().setup();

		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();

		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("  https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");

		// Step 4: Maximise the window
		driver.manage().window().maximize();

		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Step 6: Enter the first name
		driver.findElement(By.name("UserFirstName")).sendKeys("Vaishnu");

		// Step 7: Enter the last name
		driver.findElement(By.name("UserLastName")).sendKeys("Natarajan");

		// Step 8: Enter the email
		driver.findElement(By.name("UserEmail")).sendKeys("devivaishnu@gmail.com");

		// Step 9: Enter the company
		driver.findElement(By.name("CompanyName")).sendKeys("Testleaf");

		// Step 10: Enter the mobile no
		driver.findElement(By.name("UserPhone")).sendKeys("8967455863");

		// Step 11: Handle all the three drop downs

		WebElement drop1 = driver.findElement(By.name("UserTitle"));
		Select dropdown1 = new Select(drop1);
		dropdown1.selectByIndex(5);

		WebElement drop2 = driver.findElement(By.name("CompanyEmployees"));
		Select dropdown2 = new Select(drop2);
		dropdown2.selectByValue("75");

		WebElement drop3 = driver.findElement(By.name("CompanyCountry"));
		Select dropdown3 = new Select(drop3);
		dropdown3.selectByValue("AS");

		// Step 12: Click the check box
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();

		// Step 13: Close the browser

		driver.close();

	}

}
