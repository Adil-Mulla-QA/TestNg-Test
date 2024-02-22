package TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import Base.DriverFactory;


public class Amazon {
	
	
	WebDriver driver; 
	
	@BeforeMethod
	public void setup() {
		driver =  DriverFactory.initializeBrowserAndOpenApplicationURL("chrome");
		driver = DriverFactory.getDriver();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	@Test(priority = 1)
	public void verifyLogo() {
					
		WebElement logo = driver.findElement(By.xpath("//a[@aria-label=\"Amazon.in\"]"));
		Assert.assertTrue(logo.isDisplayed());
		
		System.out.println("logo is Displayed.......");
	}
	
	@Test(priority = 2)
	public void search() throws InterruptedException {
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		searchBox.sendKeys("mobile");
		WebElement search = driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));	
		search.click();
		Thread.sleep(3000);
		
		System.out.println("Search Page is Displayed.......");
	}

	@Test(priority = 3)
	public void test() {			
		
		System.out.println("Test Method .......");
	}
}
