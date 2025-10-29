package TestngDay36Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionsDemoTest {

	WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }
    
    @Test
    public void verifyAssertionsDemo() {
    	
    	driver.findElement(By.id("user-name")).sendKeys("standard_user");
    	driver.findElement(By.id("password")).sendKeys("secret_sauce");
    	driver.findElement(By.id("login-button")).click();
    	
    	String actualUrl = driver.getCurrentUrl();
    	String expectedUrl = "https://www.saucedemo.com/inventory.html";
    	
    	Assert.assertEquals(actualUrl, expectedUrl, "URL did not match after login.");
    	
    	boolean titleCheck = driver.getTitle().contains("Swag Labs");
    	
    	Assert.assertEquals(titleCheck, true, "Title does not contain 'Swag Labs'.");
    	
    	boolean cartIconDisplayed = driver.findElement(By.className("shopping_cart_link")).isDisplayed();
    	
    	Assert.assertTrue(cartIconDisplayed, "Shopping cart icon is not displayed.");
    	
    }
	
	
	
	
	
}
