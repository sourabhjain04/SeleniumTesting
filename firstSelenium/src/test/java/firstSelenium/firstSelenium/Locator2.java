package firstSelenium.firstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator2 {

	
	public static void main(String[] args) throws InterruptedException {
		
		
System.out.println("Locator concept in Selenium");
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.yahoo.com/");
		
	
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"login-container\"]/a")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		
	}
}
