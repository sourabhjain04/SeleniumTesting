package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchingExample {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		
		
		driver.findElement(By.linkText("Selectable")).click();
		
		WebElement fr = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(fr);
		
		driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[5]")).click();
		

		Thread.sleep(2000);
		driver.close();
		
	}
	
	
}
