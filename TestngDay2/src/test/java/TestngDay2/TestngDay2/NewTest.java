package TestngDay2.TestngDay2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {

	@BeforeClass
	public void setupclass() {
		System.out.println("Setup class executed before all the methods in the class");
	}
	
	
	
	@BeforeMethod
	public void setup() {
		System.out.println("Setup executed");
	}
	
	
	
	@Test
	public void f() {
		
		System.out.println("Test Case 1 executed");
  }
	
	
	@Test
	public void f1() {
		System.out.println("Test Case 2 executed");

  }
	
	
	@Test
	public void f2() {
		System.out.println("Test Case 3 executed");

  }
	@AfterMethod
	public void teardown() {
		System.out.println("Teardown executed");
		
	}
	
	
	@AfterClass
	public void setupAfterclass() {
		System.out.println("Setup class executed After all the methods in the class");
	}

	
	
	
}
