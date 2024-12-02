package javasessions;

public class Car {
	// class properties: class variable or global variable
	String name ;
	int price;
	String colour;
	String model;
	public static void main(String[] args) {
//		String name = "Naveen";// local variable
//		System.out.println(name);
		
		// To access class variables or properties, you have to create object of the class
		
		Car c = new Car();
		//new Car() is the object
		//c is the object reference name
		//Car is class
		//Car is non primitive data type
		// To access class properties you use the object reference name 
		c.name = "BMW";
		c.price = 70;
		c.colour = "black";
		c.model = "520d";
		System.out.println(c.name);
		System.out.println(c.name +", " + c.price + ", " + c.colour + ", " + c.model);
		
		
		Car c1 = new Car();
		System.out.println(c1.name +", " + c1.price + ", " + c1.colour + ", " + c1.model);
		
		Car c2 = new Car();
		c2.name ="Audi";
		c2.model = "Q5";
		System.out.println(c2.name +", " + c2.price + ", " + c2.colour + ", " + c2.model);
		
	}
	

}
