package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test6 {
	@Test(priority=1,invocationCount=1)
	public void test() throws Exception {
		System.setProperty("webdriver.chrome.driver","./browser/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.oracle.com");
		Thread.sleep(3000);
		driver.close();
	}

}
