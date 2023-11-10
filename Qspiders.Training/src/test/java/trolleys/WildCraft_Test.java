package trolleys;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WildCraft_Test {

	@Test (groups = {"bags","smoke"})
	public void launchWildCraft() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://wildcraft.com/");
		driver.quit();
	}
}
