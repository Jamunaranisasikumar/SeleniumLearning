import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
	public static void main(String[] arg) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Title of website is:"+driver.getTitle());
		driver.close();
	} 

}
