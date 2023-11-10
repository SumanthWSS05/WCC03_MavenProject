package payment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample_Test {

	@Test
	public static void main_Test() {
		WebDriver driver;
		String bName = System.getProperty("browser");
		String url = System.getProperty("url");
		
		if(bName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else {
			driver = new FirefoxDriver();
		}
		
		driver.get(url);
	}
}
