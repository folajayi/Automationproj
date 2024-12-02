package javasessions;

public class CarType {
	String name;
	int price;
	String colour;
	static int wheels = 4;
	
	public static void start() {
		System.out.println("car -- start");
	}
	
	public void stop() {
		System.out.println("car -- stop");
	}
	
	
	

	public static void main(String[] args) {
		
		CarType c1 = new CarType();
		c1.name = "BMW";
		c1.price = 70;
		c1.colour = "Black";
		System.out.println(wheels);//accessing static property directly
		
		CarType c2 = new CarType();
		c2.name = "Audi";
		c2.price = 60;
		c2.colour = "Red";
		
		
		CarType c3 = new CarType();
		c3.name = "Honda";
		c3.price = 20;
		c3.colour = "Black";
		
		
		//how to access static method 
		//1. directly
		start();
		//2. via class name
		CarType.start();
		//3. 
		
		

	}

}
