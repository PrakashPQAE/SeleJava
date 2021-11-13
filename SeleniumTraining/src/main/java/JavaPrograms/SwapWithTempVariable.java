package JavaPrograms;

public class SwapWithTempVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 2;
		int b = 4;
		
		int temp;
		
		temp  = a;
		a = b;
		b = temp;
		
		System.out.println(a +" "+ b);

	}

}
