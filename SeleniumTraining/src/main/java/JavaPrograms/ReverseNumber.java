package JavaPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 153673;
		
		int reversed = 0;
		
		for(int i = 1;i<=6;i++) {
					
			reversed = reversed*10 + number%10;
			
			number = number/10;	
			
		}
				
		System.out.println(reversed);	
		
		
		// How to check the integer length
		int counter = 0;
		
		int number1 = 1234567;
		
		while(number1!=0) {
			
			number1 = number1/10;
			
			counter++;
		}
		
		System.out.println(counter);
	}
	


}
