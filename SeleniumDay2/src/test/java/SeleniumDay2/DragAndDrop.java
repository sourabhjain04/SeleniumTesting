package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		
		driver.findElement(By.linkText("Droppable")).click();
		
		WebElement fr = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(fr);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(drag, 150, 0).build().perform();
	}

}
