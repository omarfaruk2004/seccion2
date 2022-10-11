package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Omar Faruk\\June22_Selenium\\session2\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void testLocators() {

		// input (ID)
		driver.findElement(By.name("firstname")).sendKeys("selenium");

		// click (Name)
		driver.findElement(By.id("sex-0")).click();

		// upload file
		driver.findElement(By.id("photo"))
				.sendKeys("C:\\Users\\Omar Faruk\\Desktop\\Selenium PPT\\2022-09-17--Session 1.pptx");

		// link Text
		// driver.findElement(By.linkText("OS-API Product FrontEnd")).click();

		// Partial Link Text
		// driver.findElement(By.partialLinkText("TF-API")).click();

		// CSS
		// TagName#Value
		// driver.findElement(By.cssSelector("input#exp-2")).click();

		// TagName[attribute='value']
		// driver.findElement(By.cssSelector("input[id='tool-2']")).click();

		// Use multiple attribute to locate element
		 driver.findElement(By.cssSelector("input[name='tool'][value='Selenium Webdriver']")).click();

		// xpath
		// Absolute
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[1]/a/strong")).click();

		// Relative
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[13]/input")).sendKeys("Password");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@name='exp' and @value='4']")).click();

		driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click();
		driver.findElement(By.xpath("//strong[contains(text(), 'Link Test : New Page')]")).click();
		
		//dynamic xpath
		////ul[@class='cn cn-list-hierarchical-xs cn--idx-0 cn-container_08B146BA-815B-BC7F-CF8E-AB8EEFEFABA8']/descendant::strong[1]
		
	}

}
