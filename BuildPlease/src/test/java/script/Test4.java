package script;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test4 {
	@Test(priority=4,invocationCount=4)
	public void test() throws Exception {
		System.setProperty("webdriver.gecko.driver","./browser/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.google.co.in/");
		WebElement ele = driver.findElement(By.id("lst-ib"));
		ele.sendKeys("twitter");
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.close();
	}
}
