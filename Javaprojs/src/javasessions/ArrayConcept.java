package javasessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		//array limitation - 1. size is fixed/static
		//2.store only similar type of data ( this can be resolved with object static array)
		//1. int array:
		int a[] = new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		System.out.println(a[0]);
		System.out.println(a[3]);
		//System.out.println(a[4]);
		System.out.println(a[0]+a[2]);
		System.out.println("-----");
		System.out.println(a.length);
		System.out.println("-----");
		// print all values of an array: for loop:
		
		for(int i=0; i<=a.length-1;i++) {
			System.out.println(a[i]);
		};
		System.out.println("------");
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("-----");
		//for each loop:enhanced loop
		for(int e:a) {
			System.out.println(e);
		}
		System.out.println("-----");
		System.out.println(Arrays.toString(a));
		//2. double array
		double d[]= new double [2];
		d[0] =12.33;
		d[1] =23.44;
		for(double e: d) {
			System.out.println(e);
			
		}
		System.out.println(Arrays.toString(d));
		
		//3. char arrays
		char c[] = new char[3];
		c[0] ='a';
		c[1] ='b';
		c[2] ='c';
		System.out.println(c[0]+ c[1]);
		
		//4.String array
		String emp[] = new String[3];
		emp[0]= "pyush";
		emp[1]= "sandra";
		emp[2]= "saurav";

		for(String e: emp) {
			System.out.println(e);
		}
		System.out.println(Arrays.toString(emp));
		
		//5. Object arrays
		Object st[] = new Object[5];
		st[0]= "Asha";
		st[1]= 32;
		st[2]= 34.55;
		st[3]= 'f';
		st[4]= false;
		
		for(Object e: st) {
			System.out.println(e);
		}
	}

}
