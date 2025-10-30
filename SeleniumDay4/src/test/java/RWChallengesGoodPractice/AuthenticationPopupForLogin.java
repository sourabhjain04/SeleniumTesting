package RWChallengesGoodPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopupForLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		String username = "admin";
		String password = "admin";
		
		String url = "https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		
				
		
	}

}
