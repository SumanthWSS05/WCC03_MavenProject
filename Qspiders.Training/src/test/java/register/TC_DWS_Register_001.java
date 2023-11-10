package register;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_DWS_Register_001 {

	@Test(priority = 1 )
	public void demo() throws Exception, FileNotFoundException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dream11.com");
	}
}
