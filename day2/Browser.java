package week1.day2;

public class Browser {
	public String  launchBrowser() {
		return "Browser launched successfully";
	}
	
	public void loadUrl() {
		
		System.out.println("Application url loaded successfully");
	}
	public static void main(String[] args) {
			Browser br = new Browser();
			String result = br.launchBrowser();
			System.out.println(result);
			br.loadUrl();
			
		}
		
	
}

