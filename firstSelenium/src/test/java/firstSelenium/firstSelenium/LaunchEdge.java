package firstSelenium.firstSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LaunchEdge {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Launching firfox Browser...");
		
		WebDriver driver = new FirefoxDriver();
        driver.get("https://example.com/");
        
        String title = driver.getTitle();
        
        System.out.println("Page Title: " + driver.getTitle());
        
        System.out.println("page title is:"+title);
        Assert.assertEquals(title,"Example Domain", "Title does not match!");
        

        
        driver.close();


	}

}
