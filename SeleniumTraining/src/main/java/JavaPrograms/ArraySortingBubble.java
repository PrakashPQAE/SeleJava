package JavaPrograms;

public class ArraySortingBubble {

	public static void main(String[] args) {


		int[] a = {2,5,7,1,6};

		int temp = 0;
		
		int totalArraySize= a.length;
		
		for(int i = 0;i<totalArraySize;i++) {
			
			for(int j = i+1;j<totalArraySize;j++) {
				
				if(a[i]>a[j]) {
					
					temp = a[i];
					a[i] = a[j];
					a[j]= temp;
					
				}						
			}
			
			System.out.println(a[i]);
		
		}

		System.out.println("Second Largest Array -- "+a[1]);
	}

}
