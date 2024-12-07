import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program2 {
public static void main( String[] arg) {
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("https://www.amazon.com");
	System.out.println("Title of the website is:"+driver.getTitle());
	driver.quit();
}
}
