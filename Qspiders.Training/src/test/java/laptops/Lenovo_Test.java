package laptops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lenovo_Test {

	@Test(invocationCount = 3, threadPoolSize = 3 , groups = "comp" , enabled = false)
	public void launchLenovo() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.lenovo.com/in/en/");
		driver.quit();
	}
	
	@Test(priority = -1 , groups = "comp") 
	public void launchStoreLenovo() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://store.lenovo.com/");
		driver.quit();
	}	
}
