package firstSelenium.firstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator3 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Locator concept in Selenium");

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
