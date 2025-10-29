package TestngDay3SwitchWindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowHandlerTest {
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));

        driver.get("https://demo.automationtesting.in/Windows.html");  // sample site
	}

	@Test
	public void handleWindowExample() throws InterruptedException {
		
		// click the link that opens a new tab or window
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		
		// get parent window handle
		
		String parentWindow = driver.getWindowHandle();
		
		//Get all window handles
		
		Set<String> allWindows = driver.getWindowHandles();
		
		
	// Use iterator to switch to new Window
		
		Iterator<String> itr = allWindows.iterator();
		
		while(itr.hasNext()) {
			
			String childWindow = itr.next();
			
			if(!parentWindow.equalsIgnoreCase(childWindow)) {
				
				driver.switchTo().window(childWindow);
				
				System.out.println("Child window title: " + driver.getTitle());
				
				Thread.sleep(2000);
				
				driver.close();  // close child window
			}
		}
		//Switch back to parent window
		
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);
		System.out.println("back to parent Window Title: " + driver.getTitle());
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
