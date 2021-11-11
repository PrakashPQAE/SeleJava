package JavaPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 4;
		
		boolean flag  = true;
		
		if(number == 0 || number ==1) {
			
			System.out.println("Not Prime");
		}
		
		else{
			
			for(int i = 2; i<number;i++) {
				
				if(number%i==0) {
					
					flag = false;
					break;
					}				
			}
			
			if(flag) {
				System.out.println("Prime");
			}else {
				System.out.println("Not Prime");
			}
			
		}

	}

}
