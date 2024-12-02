package javasessions;

public class IncrementalDecremnetal {

	public static void main(String[] args) {
		//1. post incremental
		int a = 1;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		
		int c = -99;
		int d = c++;
		System.out.println(c);
		System.out.println(d);
		
		//2. pre increment:
		int h = 1;
		int g = ++h;
		System.out.println(h);
		System.out.println(g);
		
		int l = -98;
		int i = ++l;
		System.out.println(l);
		System.out.println(i);
				
		int t = 10;
		System.out.println(t++);
		System.out.println(t);
		System.out.println(t++);
		System.out.println(t);
		
		//3. post decrement
		int s = 2;
		int q = s--;
		System.out.println(s);
		System.out.println(q);
		//4. pre decrement
		int u = 2;
		int o = --u;
		System.out.println(u);
		System.out.println(o);
		
		double ff = 12.33;
		System.out.println(++ff);
		
		char c1 ='a';
		System.out.println(++c1);
		System.out.println((int)++c1);
				

	}

}
