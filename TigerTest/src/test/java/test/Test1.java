package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void testcase1() {
		System.setProperty("webdriver.chrome.driver","./browser/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.quit();
	}

}
