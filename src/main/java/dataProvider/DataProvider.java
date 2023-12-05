package dataProvider;

import org.testng.annotations.Test;

public class DataProvider {
	
	@Test(dataProvider = "getData")
	public void pringData(String fName, String lName) {
		System.out.println(fName);
		System.out.println(lName);
		
	}
	
	@org.testng.annotations.DataProvider
	public Object[][] getData(){
		Object data[][] = new Object[3][2];
		
		data[0][0] = "Sofi";
		data[0][1] = "Sarmas";
		data[1][0] = "Munna";
		data[1][1] = "Ali";
		data[2][0] = "Sufiya";
		data[2][1] = "Fatima";
		
		return data;
	}
}
