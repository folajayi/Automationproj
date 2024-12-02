package BuilderPattern;

public class EcommApp {
	public void login() {
		System.out.println("login to app");
		
	}
	public void login(String un, String pwd) {
		System.out.println("login to app "+ un+ ":"+ pwd );
		
	}
	public void search(String productName) {
		System.out.println("searching the product: "+ productName);
	}
	public void serch(String productName, int price) {
		System.out.println("searching the product: "+ productName +" : "+ price);
	}
	public void clickOnProduct(String productName) {
		System.out.println("clickon the product "+ productName);
	}
	public void adToCart(String productName) {
		System.out.println("add to cart:--> product: "+ productName);
	}
	public void doPayment(String cc, int cvv) {
		System.out.println("do payment : "+ cc+ " : "+ cvv);
	}
	public void doPayment(String cc, int cvv, int otp) {
		System.out.println("do payment : "+ cc+ " : "+ cvv + " : "+ otp);
	}
	public void doPayment(String upi) {
		System.out.println("do payment : "+ upi);
	}
	public void generateOrder() {
		System.out.println("Order id is : "+ 12345);
	}
	public void sendOrderViaEmail() {
		System.out.println("send Order Via Email and order id "+ 12345);
		
	}

}
