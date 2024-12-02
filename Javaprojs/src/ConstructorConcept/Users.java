package ConstructorConcept;

public class Users {
	
	String name;
	int userId;
	boolean isPrime;
	String city;
	
	public Users(String name)
	{
		this.name = name;
	}
	
	public Users(String name, int userId )
	{
		//name = name1;
		//userId  = userId1;
		this.name = name;
		this.userId = userId;
	
	}
	public Users(String name, int userId, boolean isPrime, String city)
	{
		this.name = name;
		this.userId = userId;
		this.isPrime = isPrime;
		this.city  = "Bangalore";
	}

	public static void main(String[] args) 
	{
		Users u1 = new Users("Tom" , 100);
		System.out.println(u1.name);
		System.out.println(u1.userId);
		
		Users u2 = new Users("Naveen");
		Users u3 = new Users("naveen", 200, true, "Banglore");
		System.out.println();
		
		System.out.println(u3.name+" " + u3.userId + " " + u3.isPrime + " "+ u3.city);
		
	}

}
