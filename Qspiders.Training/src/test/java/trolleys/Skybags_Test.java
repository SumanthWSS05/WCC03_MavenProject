package trolleys;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Skybags_Test {

	@Test (groups = "bags", dependsOnGroups = "smoke")
	public void launchskybags() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://skybags.co.in/");
		driver.quit();
	}
}
