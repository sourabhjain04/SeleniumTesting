package TestngDay3;

import org.testng.annotations.Test;

public class Program3 {
	
	
	@Test(groups = {"login"})
	public void FacultyLogin() {
		
		System.out.println("Faculty Login");
	}
	
	
	@Test
	public void FacultyBrokenLinks() {
		
		System.out.println("Faculty Broken Links");
		
	}

}
