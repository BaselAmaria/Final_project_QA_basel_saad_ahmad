package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertNotEquals;


import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TraingleCalssification {
	static WebDriver browser;

	@Before
	public void setup() {

		  System.setProperty("webdriver.gecko.driver","C:\\Users\\Win10\\git\\final_project\\geckodriver.exe");

		browser = new FirefoxDriver();
		browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		String url = "https://testpages.eviltester.com/styled/apps/triangle/triangle001.html";
		browser.get(url);
	}

	@Test
	public void T1() {
		browser.findElement(By.name("side1")).sendKeys("-1");
		browser.findElement(By.name("side2")).sendKeys("4");
		browser.findElement(By.name("side3")).sendKeys("6");

		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue = "Error: Not a Traingle";
		String result = browser.findElement(By.id("triangle-type")).toString();
		assertNotEquals(result, expectedValue);
		browser.close();
	}
 //
	@Test
	public void T2() {
		browser.findElement(By.name("side1")).sendKeys("13");
		browser.findElement(By.name("side2")).sendKeys("26");
		browser.findElement(By.name("side3")).sendKeys("40");

		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue = "Error: Not a Traingle";
		String result = browser.findElement(By.id("triangle-type")).toString();
		assertNotEquals(result, expectedValue);
		browser.close();

	}

	@Test
	public void T3() {
		browser.findElement(By.name("side1")).sendKeys("1");
		browser.findElement(By.name("side2")).sendKeys("2");
		browser.findElement(By.name("side3")).sendKeys("3");

		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue = "Error: Not a Traingle";
		String result = browser.findElement(By.id("triangle-type")).toString();
		assertNotEquals(result, expectedValue);
		browser.close();

	}

	@Test
	public void T4() {
		browser.findElement(By.name("side1")).sendKeys("12");
		browser.findElement(By.name("side2")).sendKeys("12");
		browser.findElement(By.name("side3")).sendKeys("24");

		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue = "Error: Not a Traingle";
		String result = browser.findElement(By.id("triangle-type")).toString();
		assertNotEquals(result, expectedValue);
		browser.close();

	}

	@Test
	public void T5() {
		browser.findElement(By.name("side1")).sendKeys("6");
		browser.findElement(By.name("side2")).sendKeys("8");
		browser.findElement(By.name("side3")).sendKeys("11");

		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue = "Scalene";
		String result = browser.findElement(By.id("triangle-type")).toString();
		assertNotEquals(result, expectedValue);
		browser.close();

	}

	@Test
	public void T6() {
		browser.findElement(By.name("side1")).sendKeys("20");
		browser.findElement(By.name("side2")).sendKeys("20");
		browser.findElement(By.name("side3")).sendKeys("30");

		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue = "Isosceles";
		String result = browser.findElement(By.id("triangle-type")).toString();
		assertNotEquals(result, expectedValue);
		browser.close();

	}

	@Test
	public void T7F() {
		browser.findElement(By.name("side1")).sendKeys("15");
		browser.findElement(By.name("side2")).sendKeys("20");
		browser.findElement(By.name("side3")).sendKeys("15");

		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue = "Isosceles";
		String result = browser.findElement(By.id("triangle-type")).toString();
		assertNotEquals(result, expectedValue);
		browser.close();

	}

	@Test
	public void T8() {
		browser.findElement(By.name("side1")).sendKeys("2");
		browser.findElement(By.name("side2")).sendKeys("5");
		browser.findElement(By.name("side3")).sendKeys("5");

		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue = "Isosceles";
		String result = browser.findElement(By.id("triangle-type")).toString();
		assertNotEquals(result, expectedValue);
		browser.close();

	}

	@Test
	public void T9() {
		browser.findElement(By.name("side1")).sendKeys("6");
		browser.findElement(By.name("side2")).sendKeys("6");
		browser.findElement(By.name("side3")).sendKeys("6");

		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue = "Equilateral";
		String result = browser.findElement(By.id("triangle-type")).toString();
		assertNotEquals(result, expectedValue);
		browser.close();

	}
}