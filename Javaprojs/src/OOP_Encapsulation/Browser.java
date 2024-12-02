package OOP_Encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("trying to launch chrome");
		checkOsCompatibility();
		checkBrowserVersion();
		enoughRAM();
		isBrowserupgraded();
		System.out.println("chrome is launched...");
	}
	private void checkOsCompatibility() {
		System.out.println("checkOsCompatibility");
	}
	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion");
	}
	private void enoughRAM() {
		System.out.println("enoughRAM");
	}
	private void isBrowserupgraded() {
		System.out.println("isBrowserupgraded");
	}

}
