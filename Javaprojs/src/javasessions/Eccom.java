package javasessions;

public class Eccom {//polymorphism /method overloading
	//Overloaded method
	//when we have different methods:-
	//1. within the same class
	//2. the method name should be the same
	//3. with different parameters
	//4. with different sequence / order of parameters
	
	public int test() {
		System.out.println("test method");
		return 10;
	}
	
	public void test(int i) {
		System.out.println("test method");
		
	}
	public void test(String i) {
		System.out.println("test method");
	
	}
	public void test(int i, int k) {
		System.out.println("test method");
	}
	public void test(int i, double j) {
		System.out.println("test method");
	}
	public void test(int i, String j) {
		System.out.println("test method");
	}
	public void test(String j, int i) {
		System.out.println("test method");
	}

	public static void main(String[] args) {
		Eccom obj = new Eccom();
		int n = obj.test();
		System.out.println(n);
		obj.test(100);

	}
	//Example of overloading:1. Login, 2. Search, 3.Payment
	
	public void Login() {
		
	}
	public void Login(String un, String pwd) {
		
	}
	public void Login(String un, String pwd, String role) {
		
	}
	public void Login(String un, String pwd, long ph) {
		
	}
	public void Login(String socMedia, int otp) {
		
	}
	
	public void Search() {
		
	}
	public void Search(String productName) {
		
	}
	public void Search(String productName, String colour) {
		
	}
	public void Search(String productName, String colour, int price) {
		
	}
	
	
	public void payment() {
		
	}
	public void payment(String upi) {
		
	}
	public void payment(String upi, int otp) {
		
	}
	public void payment(String paypal, String pwd) {
		
	}
	public void carBooking() {
		
	}
	public void carBooking(String start, String end) {
		
	}
	public void carBooking(String start, String end, String carType) {
		
	}
	public void carBooking(String start, String end, String carType, int nUsers) {
		
	}
	
	
	

}
