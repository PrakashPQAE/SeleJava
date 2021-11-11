package JavaTutorials;

public class BubbleSort_IntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {4,3,2,5,1,7};
		
		System.out.println("Total Size of the Array is: " +arr.length);
		
		int totalArraySize = arr.length;
		
		for(int i = 0; i<totalArraySize; i++) {
			
			for(int j = 0; j < totalArraySize - 1 ;j++) {
				
				if(arr[j]>arr[j+1]) {
					
					int tempNum = arr[j];
					
					arr[j] = arr[j+1];
					
					arr[j+1] = tempNum;				
				}			
				
			}	
				
		}	
		
		for(int i = 0; i<arr.length; i++) {
			
			System.out.println(arr[i]);					
		}
	
	}

}
