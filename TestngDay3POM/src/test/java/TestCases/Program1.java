package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjectRepository.RediffHomePage;
import PageObjectRepository.RediffSigninPage;

public class Program1 {

	
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		driver = new EdgeDriver();

		driver.get("https://www.rediff.com/");
		
		driver.manage().window().maximize();
		
	//	driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(2));
		
	
	}

	
	@Test
	public void verifyLogo() {
		RediffHomePage rhp = new RediffHomePage (driver);
		WebElement logo= rhp.logo();
		Boolean flag = logo.isDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	@Test
	public void signInTestcase() {
		RediffHomePage rhp = new RediffHomePage (driver);
		rhp.signIn().click();
		
		RediffSigninPage rsp = new RediffSigninPage(driver);
		rsp.userName().sendKeys("testuser");
		rsp.password().sendKeys("testpassword");
		rsp.signInButton().click();
		
		//Assert.assertTrue(driver.getCurrentUrl().contains("f4mail.rediff.com"));
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}	

	
	
	
}
