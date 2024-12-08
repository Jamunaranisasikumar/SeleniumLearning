package week1.day2;

public class Browser {
	public String BrowserVersion;
	
	public void LaunchBrowser()
	{
		System.out.println("Browser launched successfully");
	}
	
	public void LoadURL()
	{
		System.out.println("URL Loaded Successfully");
	}
	public static void main (String [] arg) {
		Browser chrome = new Browser();
		chrome.BrowserVersion = "v1";
		System.out.println("Browser name:" + chrome.BrowserVersion);
		chrome.LaunchBrowser();
		chrome.LoadURL();
		Browser edge = new Browser();
		edge.BrowserVersion = "V1.1";
		System.out.println("edge browser version:" + edge.BrowserVersion);
		edge.LaunchBrowser();
		edge.LoadURL();
	}
}
