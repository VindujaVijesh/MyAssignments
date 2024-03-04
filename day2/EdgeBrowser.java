package week1.day2;

public class EdgeBrowser {
	
	public static void main(String[] args) {
		 
		Browser brw = new Browser();
		String status = brw.launchBrowser();
		System.out.println(status);
		brw.loadUrl();
	}

}
