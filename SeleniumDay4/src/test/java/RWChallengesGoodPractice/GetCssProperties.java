package RWChallengesGoodPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssProperties {

public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
		
		WebElement w = driver.findElement(By.xpath("//*[@id=\"glow-ingress-line1\"]"));
		
		System.out.println("Font size: " + w.getCssValue("font-size"));
	 		System.out.println("Font color: " + w.getCssValue("color"));
	 		System.out.println("Font family: " + w.getCssValue("font-family"));
	 		
	 		driver.close();
	 		
	 		
}
}
