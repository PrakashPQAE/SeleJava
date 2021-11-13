package JavaPrograms;

public class PalindromeNumber {


	public static void main(String[] args) {

		int number  = 1231;
		
		int number1 = number; 

		int rev = 0;

		while(number!=0) {

			rev = rev*10+ number%10;

			number = number/10;
		}
		
		System.out.println(rev);
		
		if(rev == number1) {
			
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("Not Palindrome number");
			
		}
	}

}
