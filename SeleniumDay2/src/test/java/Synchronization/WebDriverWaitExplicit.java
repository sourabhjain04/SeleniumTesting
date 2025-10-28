package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitExplicit {


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://browserstack.com/");
		
		WebElement prod = driver.findElement(By.id("products-dd-toggle"));
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOf(prod));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(prod).build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"products-dd-tabpanel-2-inner-1\"]/div[2]/div[2]/a/span")).click();
		
		driver.close();
	}
	
	
}
