package RWChallengesGoodPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTextWithoutSendkeys {

	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		// If we have Id and name then we use this method:
		
		//js.executeScript("document.getElementById('login1').value=\"abcde\"");
		
		//js.executeScript("document.getElementsByName('login')[0].value=\"sourabh\"");
		
		// if we not have id and name we can use cssSelectors path
		
		js.executeScript("document.querySelector('#login1').value=\"VedikaJain\"");
	}
}
