package ConstructorConcept;

public class Employee {
	
	String name;
	int age;
	String empId;
	String dept;
	
	// the constructor name will remain same as the class name
	// constructor has no return type
	// constructor looks like a function but it's not
	// constructor can be overloaded
	// public means this constructor can be accessed from anywhere
	// Constructor will be called when object is created
	// Constructor restrict unnecessary object creation
	// depending upon uses case , default constructor can be created
	
	// The difference between constructor and function
	//1. constructor name has to same as Class name, functions can have any name
	//2. constructor does not have return type, functions can have return type
	//3. Constructor is called when object is created but method is called with object reference
	//4. Constructor helps with create object of a class, it restrict unnecessary object creation
	//5. Constructor should not have business logic,Function should have feature of the class/ business logic
	public Employee() 
	{
		System.out.println("default const.....");
	}
	
	public Employee(int i) 
	{
		System.out.println("1 param const..... "+ 1);
	}
	
	public Employee(int i , String p) 
	{
		System.out.println("2 params const..... "+i+p);
	}
	
	
	
	
	

	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee(10);
		Employee e3 = new Employee(10, "test");
		

	}

}
