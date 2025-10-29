package PageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePage {

	WebDriver driver;
	
	
	//By Logo = By.xpath("/html/body/div[1]/div/div[2]/a/img");
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/a/img")
	
	WebElement Logo;
	
	//By SignIn = By.xpath("//*[@id=\"signin_info\"]/a[1]");
	
	@FindBy(xpath="//*[@id=\"signin_info\"]/a[1]")
	
	WebElement SignIn;
	
	public RediffHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement logo() {
		//return driver.findElement(Logo);
		return Logo;
	}

	public WebElement signIn() {
		// TODO Auto-generated method stub
		//return driver.findElement(SignIn);
		return SignIn;
	}
	
	
}
