package RWChallengesGoodPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuit {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.irctc.co.in/nget/train-search");


		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button")  ).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"stayIcon\"]/a/span")).click();
		
		
		
		//driver.quit();
		
		driver.close();
		
		
		
	}
}
