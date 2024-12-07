import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {
public static void main (String[] arg) {
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.google.com");
	driver.navigate().to("https://www.amazon.com");
	driver.navigate().back();
	System.out.println("first opened web site is:"+driver.getCurrentUrl());
	driver.navigate().forward();
	//System.out.println("page source:" + driver.getPageSource());
	//System.out.println("Current window handle:" + driver.getWindowHandles());
	Set<String> allWindowHandles= driver.getWindowHandles();
	for (String handle : allWindowHandles) {
		System.out.println("Window Handle: " + handle);
	}
}
}
