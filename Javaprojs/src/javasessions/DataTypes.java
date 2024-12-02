package javasessions;

public class DataTypes {

	public static void main(String[] args) {
		
		byte b = 20;
		b = 30;
		byte b1 = -20;
		//byte b4 = 0;
		System.out.println(b);
		System.out.println(b+b1);
		
		/* byte is dataType
		 * b is variable
		 * = is assignment operator
		 * 20 is value 
		 * size of 1 byte = 8 bits
		 * range: -128 to 127
		 */
		short s1= 1234;
		System.out.println(s1);
		/*
		 * short = 2bytes = 16 bits
		 * range is -32768 to32767
		 */
		int i = 10000;
		System.out.println(i);
		/*size= 4 bytes = 32 bits
		 * range = -2147483648 to 2147483647
		 */
		long distance = 121212121212L;
		System.out.println(distance);
		/*size = 8 = 64 bits
		 * range =
		 * L has to end the long numbers
		 */
		float f1 = 12.33f;
		float f2 = 100;
		System.out.println(f1);
		System.out.println(f2);
		/*
		 * size: 4 bytes = 32 bits
		 * range: after decimal point it can take 7 digit
		 * has to end with f
		 */
		double d1 = 12.33333;
		System.out.println(d1);
		/*size =8 bytes = 64 bits
		 * range : after decimal point can take 15 digits
		 */
		char c1 = 'a';
		char c2 = '$';
		char c = 'a';
		char h = 'b';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1+c2);
		System.out.println(c+h);
		/* char is for single digit value
		 * size = 2bytes = 16 bits
		 * 
		 * a-z: 97 to 122
		 * A-Z: 65 to 90
		 * 0-9: 48 to 57
		 */
		boolean flag = true;
		boolean flag1 = false;
		System.out.println(flag);
		System.out.println(flag1);
		/* size = ~1 bit = less than 1 bit
		 * 
		 */
	}

}
