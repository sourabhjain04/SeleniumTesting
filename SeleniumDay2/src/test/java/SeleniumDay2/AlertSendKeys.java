package SeleniumDay2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		
		Alert a = driver.switchTo().alert();
	
		Thread.sleep(2000);
		
		a.sendKeys("Vedika Jain");
		
		Thread.sleep(5000);

		a.accept();
		
		//a.dismiss();
	}

}
