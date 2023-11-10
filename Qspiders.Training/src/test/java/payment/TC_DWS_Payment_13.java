package payment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_DWS_Payment_13 {

	@Test(priority = 1)
	public static void main() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/");
//		driver.findElement();
		driver.quit();
	}
}
