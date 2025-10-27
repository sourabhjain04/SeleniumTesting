package firstSelenium.firstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator1 {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("Locator concept in Selenium");
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("lnctsourabh");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("passwd")).sendKeys("Sourabh@123");
		
		Thread.sleep(5000);

		driver.findElement(By.className("checkbox-container")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.className("signin-btn")).click();
		
		Thread.sleep(5000);
		
		
		driver.close();
	}
	
}
