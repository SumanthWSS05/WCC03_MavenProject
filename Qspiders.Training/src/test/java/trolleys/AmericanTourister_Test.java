package trolleys;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmericanTourister_Test {

	@Test (groups = {"bags","regg"})
	public void launchAmericanTourister() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.americantourister.in/");
		driver.quit();
	}
}
