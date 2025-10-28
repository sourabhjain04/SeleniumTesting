package Synchronization;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverImplecititWait {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		driver.get("http://browserstack.com/");
		
		WebElement prod = driver.findElement(By.id("products-dd-toggle"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(prod).build().perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"products-dd-tabpanel-2-inner-1\"]/div[2]/div[2]/a/span")).click();
		
		driver.close();
	}

}
