package javasessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// continuous memory allocation CMA
		
		ArrayList ar = new ArrayList(); // VC =10
		System.out.println(ar.size());
		ar.add(100);
		ar.add(200);
		System.out.println(ar.size());
		
		ar.add("tom");
		ar.add('m');
		System.out.println(ar.size()); //4
		
		ar.add(300);
		System.out.println(ar.size()); //5
		System.out.println(ar.get(0)); //100
		//System.out.println(ar.get(-1)); ArrayIndexOutOfBound exception
		
		ArrayList ar1 = new ArrayList(20);//vc = 20
		ArrayList ar2 = new ArrayList(5);
		ar2.add(100);
		ar2.add(100);
		ar2.add(null);
		ar2.add(null);
		System.out.println(ar2.size());
		System.out.println(ar2.get(1));
		System.out.println(ar2.get(2));
		//System.out.println(ar2.get(3));
		//Replace 
		ar2.add(3, 200);
		System.out.println(ar2.get(3));
		
		ArrayList prod = new ArrayList();
		prod.add("A");
		prod.add("B");
		prod.add("C");
		prod.add("D");
		prod.add("E");
		System.out.println(prod.size());
		
		//remove
		prod.remove(3);
		System.out.println(prod.size());
		System.out.println("----------");
		
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(100);
		
		ArrayList<String> empList = new ArrayList<>();
		empList.add("Tom");
		
		ArrayList<Object> empData = new ArrayList<>();
		empData.add("Tony");
		empData.add(30);
		empData.add(12.33);
		empData.add('m');
		empData.add(true);
		//print all values
		
		for(int i=0; i<empData.size(); i++) {
			System.out.println(empData.get(i));
			System.out.println("----");
			
		}
		for(Object e: empData) {
			System.out.println(e);
			if(e.equals('m')) {
				System.out.println("male employee");
			}
		}
		System.out.println(empData);
	}

}
