package TestngDay3;


import org.testng.annotations.Test;

public class Program2 {
	
		
	
	  @Test(priority=2)
	  public void PlacementLogin() {
		  System.out.println("Placement Login");
		  
		  
	  }
	  
	  
	  @Test(priority=3)
	  public void PlacementBrokenLink() {
		  System.out.println("Placement Broken Link");
	  }
	  

		@Test(priority=0)
		public void FacultyLogin() {
			
			System.out.println("Faculty Login");
		}
		
		
		@Test(priority=1)
		public void FacultyBrokenLinks() {
			
			System.out.println("Faculty Broken Links");
			
		}
	  
	
	
}
