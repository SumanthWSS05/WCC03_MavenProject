package laptops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dell_Test {

	@Test (groups = {"comp","smoke"}) 
	public void launchDell() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.dell.com/en-in");
		driver.quit();
	}
}
