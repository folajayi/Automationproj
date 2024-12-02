package javasessions;

public class LoopsConcepts {

	public static void main(String[] args) {
		// while loop
		// while loop is used when the number of iterations to be performed is known e.g
		//page loading
		//wait time(web element is coming on the oage after 10/20/30 etc seconds)
		//waiting for server to load
		//pagination
		//carousel handling
		int i =1;
		while(i<=10){
			System.out.println(i);
			i++;
			//++i;
		}
		
		boolean flag =true;
		int num = 1;
		while(flag) {
			System.out.println("Welcome to Taj hotel");
			num++;
			if(num == 6) {
				break;
			}
		
		}
		//2. for loop
		// is use when number of iterations to be performed e.g.
		//array
		//arrayList
		//drop down e.g  months 1to12, days 1to 31
		for(int k=1; k<=10; k++) {
			System.out.println(k);
		}
		System.out.println("----------------");
		for(double d=1.1; d<=10.5; d++) { 
			System.out.println(d);
			
		}
		System.out.println("----------------");
		
		for(char c='a';c<='z';c++) {
			System.out.println(c);
		}
		System.out.println("a-z ascii : ----------------");

		for(char b='a'; b<='z'; b++) {
			System.out.println(b+ ": " + (int)b);
		}
		System.out.println("A-Z ascii : ----------------");

		for(char t='A'; t<='Z'; t++) {
			System.out.println(t+" is : " +(int)t);
		}
		System.out.println("odd numbers: ----------------");
		for(int odd= 1; odd<=9; odd= odd+2) {
			System.out.println(odd);
		}
		System.out.println("----------------");
		
		for(int l=1; l<=100; l++) {
			System.out.println(l);
			if(l%5==0) {
				System.out.println("Hi");
			}	
		}
		System.out.println("----------------");
		//3. Do while loop
		int p=1;
		do {
			System.out.println(p);
			p++;
			}
		while(p<=10);




	}

}
