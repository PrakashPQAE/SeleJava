package JavaTutorials;

public class Strings {
	
	public static void main(String[] args) {	
		
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "Hello";
		String s4 = "Hello";
		String s5 = "Hello";
		
		String s7 = "Helloo";
		
		String s6 = new String("Hello");
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s2==s3);
		
		System.out.println(s3==s6);
		
		System.out.println(s3.equals(s6));
		
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s1.compareTo(s7));
		
		
	}

}
