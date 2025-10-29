package TestngDay3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Program2 {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
  
  
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@BeforeClass

	public void beforeClass()

	{

	System.out.println("Before Class...");

	}

	

	@AfterClass

	public void afterClass()

	{

	System.out.println("After Class...");

	}


	
	
	  @Test
	  public void PlacementLogin() {
		  System.out.println("Placement Login");
		  
		  
	  }
	  
	  
	  @Test
	  public void PlacementBrokenLink() {
		  System.out.println("Placement Broken Link");
	  }
	  
	
	
}
