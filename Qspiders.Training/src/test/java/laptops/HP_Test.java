package laptops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HP_Test {

	@Test (groups = "comp") 
	public void launchHP() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.hp.com/");
		driver.quit();
	}
}
