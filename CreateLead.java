package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Download and set the path

		WebDriverManager.chromedriver().setup();

		// Launch a chrome browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");

		// waits for 10 secs if the element not in DOM
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Maximize the browser
		driver.manage().window().maximize();

		// Locate the username and enter the username as
		WebElement webUser = driver.findElement(By.id("username"));
		webUser.sendKeys("demosalesmanager");

		// locate the password and the enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// locate the login button and click on it
		driver.findElement(By.className("decorativeSubmit")).click();

		// click on crm/fsa link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click on leads tab
		driver.findElement(By.linkText("Leads")).click();

		// click on create lead
		driver.findElement(By.linkText("Create Lead")).click();

		// Enter the company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		// Enter the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vaishnu");

		// Enter the last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Natarajan");

		// Enter first name local
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Jiya");

		// Enter salutation
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Dear");

		// Enter title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mrs");

		// Annual revenue
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("100000");

		// Sic code
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("2345");

		// Description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Hello My name is Vaishnudevi");

		// Important note
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Selenium");

		// Last name local
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Chakraborty");

		// Birth date
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("11/28/2014");

		// department
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Costco");

		// No of employees
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("5000");

		// Ticker symbol
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("20");

		// Area code
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("+91");

		// Extension
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("435");

		// email
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("devivaishnu@gmail.com");

		// phone no
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9675893354");

		// person to ask for
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Mr Anand");

		// web URL
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com");

		// to name
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Nihit");

		// address line 1
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Jones cassia");

		// city
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");

		// zip code
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600130");

		// zip code extension
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("130");

		// Attention Name
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Vicky");

		// Attention Name
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Ottiambakkam");

		WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown1 = new Select(drop1);
		dropdown1.selectByIndex(1);

		WebElement drop2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown2 = new Select(drop2);
		dropdown2.selectByVisibleText("Computer Software");

		WebElement drop3 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropdown3 = new Select(drop3);
		dropdown3.selectByIndex(5);

		WebElement drop4 = driver.findElement(By.name("ownershipEnumId"));
		Select dropdown4 = new Select(drop4);
		dropdown4.selectByIndex(4);

		WebElement drop5 = driver.findElement(By.name("currencyUomId"));
		Select dropdown5 = new Select(drop5);
		dropdown5.selectByIndex(6);

		WebElement drop6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown6 = new Select(drop6);
		dropdown6.selectByIndex(8);

		WebElement drop7 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dropdown7 = new Select(drop7);
		dropdown7.selectByIndex(6);

		driver.findElement(By.name("submitButton")).click();

	}

}
