package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Groups {
	@Parameters("URL")
	@Test(groups = "Smoke")
	public void print1(String URL) {
		System.out.println("PRINT 1");
		System.out.println(URL);
	}
	
	@Test(dependsOnMethods = "print1")
	public void print2() {
		System.out.println("PRINT 2");
	}
	
	@Test(enabled = false)
	public void print3() {
		System.out.println("PRINT 3");
	}
	@Test(enabled = false)
	public void print4() {
		System.out.println("PRINT 4, develop branch");
	}
	
}
