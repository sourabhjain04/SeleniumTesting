package RWChallengesGoodPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));

		driver.findElement(By.xpath("//*[@id=\"myFile\"]")).sendKeys("C:\\Users\\ipsso\\Downloads\\LION1.png");
		
		
	}

}
