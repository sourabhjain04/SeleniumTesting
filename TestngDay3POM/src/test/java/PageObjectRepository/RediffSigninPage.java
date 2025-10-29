package PageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffSigninPage {

	WebDriver driver;
	
	By UserName = By.xpath("//*[@id=\"login1\"]");
	By Password = By.xpath("//*[@id=\"password\"]");
	
	By SignInButton = By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/form/button");
	
	
	public RediffSigninPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement userName() {
		return driver.findElement(UserName);
		
	}
	
	public WebElement password() {
		return driver.findElement(Password);
		
	}
	
	public WebElement signInButton()

	{

		return driver.findElement(SignInButton);

	}

	
	
}
