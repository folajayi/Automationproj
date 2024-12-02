package javasessions;

public class ConditionalOperators {

	public static void main(String[] args) {

		//byte b = 065;
		//base of octal number is 8
		//065 ---> (0x8)(6x8)(5x8)=53
		
		//== is equal to (it is also called comparison operator)
		
		int a = 10;
		int b = 1;
		System.out.println("a==b");
		
		if(a==b) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		boolean flag = true;
		if(flag) {
			System.out.println("Senelium");
		}
		
		else {
			System.out.println("UFT");
		}
		double d1= 12.33;
		double d2 = 12.34;
		if(d1==d2) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");
		}
		
		String s1 = "Hello";
		String s2 = "hello";
		if(s1.equals(s2)) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
			
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		
		int total =90;
		if(total<=90) {
			System.out.println("Grade A");
			
		}
		
		int total1 =95;
		if(total1<=100) {
			if(total1>=95) {

				System.out.println("Grade A++");
			}
		else {
			System.out.println("Grade A");
		}
		}
		
	}
		

}
