package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethod {

	public static void main(String[] args) {
		ArrayList<String> empList = new ArrayList<String>();
		empList.add("Tom");
		empList.add("Naveen");
		empList.add("Haroon");
		empList.add("Keshav");
		
		System.out.println(empList);
		
		//1. Sort:
		Collections.sort(empList);
		System.out.println(empList);
		//1a. sort in reverse order
		Collections.sort(empList, Collections.reverseOrder());
		System.out.println(empList);
		System.out.println("--------");
		//1b. sort in reverse order for loop
		ArrayList<String> stList = new ArrayList <String>();
		stList.add("Tom");
		stList.add("Priya");
		stList.add("Divya");
		stList.add("Pradeep");
		
		for(int i=stList.size()-1; i>=0; i--) {
			System.out.println(stList.get(i));
		}
		System.out.println("-------");
		//2. AddAll (join/add one arrayList to another)
		ArrayList<String> tList = new ArrayList<String>();
		tList.add("Lisa");
		tList.add("Peter");
		tList.add("Pradeep");
		
		tList.addAll(stList);
		System.out.println(tList);
		
		//new ArrayList<Interrger>();
		System.out.println("--------");
		//How to add array values without using .add
		List<Integer> data = Arrays.asList(10,20,30);
		System.out.println(data);
		
		List<String> names = Arrays.asList("a", "aa","aaa");
		System.out.println(names);
		//static array
		int d[] = new int[3];//new keyword
		d[0]= 10;
		int dd[] = {1,2,3,4,5}; //integer literal
		System.out.println(dd[1]);
		int ddd[] = new int [] {10,20,30};//new keyword + literals
	
		System.out.println(ddd.length);
		
	//	String s = "hello";// String literals
		//String s1 = new String("hello");// String Object
		
	}

}
