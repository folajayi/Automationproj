package javasessions;

public class Browser {
	//launch a browser
	//input parameter :String
	//return : void
	public boolean launchBrowser(String name) {
		System.out.println("browser name is : " + name);
		if(name.equals("chrome")) {
			System.out.println("launch chrome");
			return true;
		}
		else if(name.equals("firefox")){
			System.out.println("launch firefox");
			return true;
		}
		else if(name.equals("safari")){
			System.out.println("launch safari");
			return true;
		}
		else {
			System.out.println("pass the right broswer name ....");
			return false;
		}
		}
	
	public boolean OpenBrowser(String brName) {
		System.out.println("browser name: " + brName);
		switch (brName.toLowerCase()) {
		case "chrome":
			System.out.println("launch chrome");
			
			return true;
		case "firefox":
			System.out.println("launch firefox");
			
			return true;
		case "edge":
			System.out.println("launch edge");
			
			return true;

		default:
			System.out.println("please pass the right browser "+ brName);
			return false;
		}
	}

	public static void main(String[] args) {
	
		Browser br = new Browser();
		boolean flag = br.OpenBrowser("safari");
		System.out.println(flag);
		
		
		//if(br.launchBrowser("opera")) {
		//	System.out.println("br is launched ....");
		//}
		//else {
		//	System.out.println("Tc is failed....");
		//}
		
	
	}

	}


