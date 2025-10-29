package TestngDay3;


import org.testng.annotations.Test;

public class Program2 {
	
		
	
	  @Test(dependsOnMethods = {"FacultyLogin","FacultyBrokenLinks"})
	  public void PlacementLogin() {
		  System.out.println("Placement Login");
		  
		  
	  }
	  
	  
	  @Test
	  public void PlacementBrokenLink() {
		  System.out.println("Placement Broken Link");
	  }
	  
	
	
}
