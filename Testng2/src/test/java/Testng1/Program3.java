package Testng1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Program3 {
	
	
	@Test
	public void FacultyLogin() {
		
		System.out.println("Faculty Login");
	}
	
	
	@Test
	public void FacultyBrokenLinks() {
		
		System.out.println("Faculty Broken Links");
		
		Assert.assertEquals("A", "B");
	}

}
