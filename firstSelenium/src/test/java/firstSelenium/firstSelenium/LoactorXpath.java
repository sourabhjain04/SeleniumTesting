package firstSelenium.firstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoactorXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://automationintesting.com/selenium/testpage/");

		Thread.sleep(1000);
		
		driver.findElement(By.id("firstname")).sendKeys("vedika");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("surname")).sendKeys("Jain");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("gender")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("#gender > option:nth-child(2)")).click();

	//	Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"red\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"contactus\"]/div[5]/div/label/textarea")).sendKeys("Hi this is Konig Solutions");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"continent\"]/option[2]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

}
