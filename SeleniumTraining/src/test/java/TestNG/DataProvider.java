package TestNG;

import org.testng.annotations.Test;

public class DataProvider {

	@org.testng.annotations.DataProvider(name="getID")
	public Object[][] getIdValues() {

		Object[][] obj = new Object[3][2];

		//1st Row

		obj[0][0] = 1; // 1st column
		obj[0][1] = 2; // 2nd column


		//2nd Row

		obj[1][0] = 3; // 1st column
		obj[1][1] = 4; // 2nd column		

		//3rd Row


		obj[2][0] = 5; // 1st column
		obj[2][1] = 6; // 2nd column

		return obj;
		
	}
	@Test(dataProvider ="getID")
	public void f(int a, int b) {
				
		System.out.println(a);
		System.out.println(b);
	}
}
