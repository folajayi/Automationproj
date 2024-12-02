package javasessions;

public class SwitchCaseLogic {

	public static void main(String[] args) {
		String browser = "chr  ome";
		
		switch (browser.toLowerCase().trim().replace(" ", "")) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch fifrefox");
		case "safari":
			System.out.println("launch safari");
			break;
		case "egde":
			System.out.println("launch edge");
			break;

		default:
			System.out.println("Please pass the right browser + browser");
			break;
		}
		
		int total = 100;
		switch (total) {
		case 100:
			
			break;

		default:
			break;
		}

	}

}
