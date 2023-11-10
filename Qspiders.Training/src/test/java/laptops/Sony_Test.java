package laptops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sony_Test {

	@Parameters("URL")
	@Test (groups = {"comp","regg"}) 
	public void launchSony(@Optional("https://www.hindustanpencils.com/") String data) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get(data);
		driver.quit();
	}
}
