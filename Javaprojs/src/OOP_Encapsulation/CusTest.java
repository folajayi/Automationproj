package OOP_Encapsulation;

public class CusTest {

	public static void main(String[] args) {
		Customer c1 = new Customer("Ram", 25, "LA");// POST
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getCity());
		
		c1.setCity("Banglore");//update(PUT/PATCH)
		
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getCity());

	}

}
