package First;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class firstScript {
	public void anyWhereWorks01() throws InterruptedException, IOException{
	System.setProperty("webdriver.chrome.driver","/Users/sajith/Documents/workspace/selenium/driver/chromedriver 3");
	ChromeDriver driver =new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//Login page
	driver.get("https://staging-fullspectrum.appspot.com");


	driver.quit();
}
}
