package javasessions;

public class IfElseLogic {

	public static void main(String[] args) {
		
		String browser = "ie";
		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		else if(browser.equals("ff")) {
			System.out.println("launch ff");
		}
		else {
			System.out.println("please pass the right browser");
		}
	}

}
