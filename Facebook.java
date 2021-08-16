package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// Step 1: Download and set the path
		WebDriverManager.chromedriver().setup();

		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();

		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");

		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Step 6: Click on Create New Account button
		driver.findElement(By.linkText("Create New Account")).click();

		// Step 7: Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Vaishnu");

		// Step 8: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("Natarajan");

		// Step 9: Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("devivaishnu@gmail.com");

		// Step 10: Enter the password
		driver.findElement(By.name("reg_passwd__")).sendKeys("javajini");
		
		// Step 11: Handle all the three drop downs

		WebElement drop1 = driver.findElement(By.name("birthday_day"));
		Select dropdown1 = new Select(drop1);
		dropdown1.selectByValue("20");

		WebElement drop2 = driver.findElement(By.name("birthday_month"));
		Select dropdown2 = new Select(drop2);
		dropdown2.selectByVisibleText("May");

		WebElement drop3 = driver.findElement(By.name("birthday_year"));
		Select dropdown3 = new Select(drop3);
		dropdown3.selectByValue("1986");

		// Step 12: Select the radio button "Female"
		driver.findElement(By.xpath("//label[@class='_58mt']")).click();
	}

}
