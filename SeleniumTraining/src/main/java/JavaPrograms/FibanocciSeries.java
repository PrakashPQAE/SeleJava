package JavaPrograms;

public class FibanocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int count = 10;
		
		int num1 = 0;
		int num2 = 1;
		int num3;
		
		for(int i = 1;i<=count;i++) {
			
			num3 = num1+num2;
			
			System.out.print(" "+num3);
			
			num1 = num2;
			
			num2 = num3;
			
		}

}

}
