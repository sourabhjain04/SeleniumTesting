package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		
		WebElement ele=driver.findElement(By.linkText("Draggable"));
		
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
		Thread.sleep(2000);
		
		act.keyDown(Keys.CONTROL).click(ele).keyUp(Keys.CONTROL).build().perform();	
		
		System.out.println("Open the Draggable link in new tab");
		
		Thread.sleep(2000);
		driver.quit();
	}

}
