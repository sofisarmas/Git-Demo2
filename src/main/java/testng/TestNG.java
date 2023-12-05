package testng;
import org.testng.annotations.Test;

public class TestNG {
	@Test(groups = "Smoke")
	public void print() {
		System.out.println("HEllo");
	}
	
	@Test
	public void outPut() {
		System.out.println("OUtput");
	}
	
}
