package RWChallengesGoodPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new EdgeDriver();

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
		
		driver.switchTo().frame("iframeResult");
		
		WebElement w = driver.findElement(By.xpath("//select[@id='cars']"));
		
		Select dropdown = new Select(w);
		
		dropdown.selectByIndex(2);
		
	}

}
