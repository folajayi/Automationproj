package BuilderPattern;

public class Shopping {

	public static void main(String[] args) {
		EcommApp e1 = new EcommApp();
		e1.login();
		e1.search("iMac");
		e1.adToCart("iMac");

	}

}
