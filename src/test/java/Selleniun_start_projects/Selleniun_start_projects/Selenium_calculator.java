package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.lang.System;

public class Selenium_calculator {

	static WebDriver browser;

	@Before
	public void setup() {

		  System.setProperty("webdriver.gecko.driver","C:\\Users\\Win10\\git\\final_project\\geckodriver.exe");
		browser = new FirefoxDriver();
		browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		String url = "https://testpages.eviltester.com/styled/apps/calculator.html";
		browser.get(url);

	}

	@Test
	public void plus_test_1() {

		browser.findElement(By.id("button05")).click();
		browser.findElement(By.id("buttonplus")).click();
		browser.findElement(By.id("button07")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "12";
		assertEquals(Expected, result);
		browser.close();
	}
	
	@Test
	public void plus_test_2() {

		browser.findElement(By.id("button02")).click();
		browser.findElement(By.id("buttonplus")).click();
		browser.findElement(By.id("button01")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "3";
		assertEquals(Expected, result);
		browser.close();
	}

	@Test
	public void minus_test_1() {
		browser.findElement(By.id("button08")).click();
		browser.findElement(By.id("buttonminus")).click();
		browser.findElement(By.id("button03")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "5";
		assertEquals(Expected, result);
		browser.close();

	}
	
	@Test
	public void minus_test_2() {
		browser.findElement(By.id("button06")).click();
		browser.findElement(By.id("buttonminus")).click();
		browser.findElement(By.id("button03")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "3";
		assertEquals(Expected, result);
		browser.close();

	}

	@Test
	public void mult_test_1() {
		browser.findElement(By.id("button02")).click();
		browser.findElement(By.id("buttonmultiply")).click();
		browser.findElement(By.id("button04")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "8";
		assertEquals(Expected, result);
		browser.close();
	}
	
	@Test
	public void mult_test_2() {
		browser.findElement(By.id("button01")).click();
		browser.findElement(By.id("buttonmultiply")).click();
		browser.findElement(By.id("button06")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "6";
		assertEquals(Expected, result);
		browser.close();
	}

	@Test
	public void di_test_1() {
		browser.findElement(By.id("button08")).click();
		browser.findElement(By.id("buttondivide")).click();
		browser.findElement(By.id("button02")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "4";
		assertEquals(Expected, result);
		browser.close();
	}

	

	@Test
	public void div_zero_zero() {
	    try {
	        browser.findElement(By.id("button00")).click();
	        browser.findElement(By.id("buttondivide")).click();
	        browser.findElement(By.id("button00")).click();
	        Thread.sleep(1000); // This should be used cautiously, consider using explicit waits instead.
	        browser.findElement(By.id("buttonequals")).click();
	        System.out.println("hello");

	        String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
	        System.out.println(result);
	        String Expected = "NaN";
	        assertEquals(Expected, result);
	    } catch (InterruptedException e) {
	        Thread.currentThread().interrupt();
	        System.err.println("InterruptedException occurred: " + e.getMessage());
	    } catch (Exception e) {
	        System.err.println("An unexpected error occurred: " + e.getMessage());
	    } finally {
	        browser.close();
	    }
	}
	
	@Test
	public void div_zero_num() {
		browser.findElement(By.id("button00")).click();
		browser.findElement(By.id("buttondivide")).click();
		browser.findElement(By.id("button07")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");
		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "0";
		assertEquals(Expected, result);
		browser.close();
	}
	@Test
	public void divByZero() {
    	
		
			browser.findElement(By.id("button02")).click();

			browser.findElement(By.id("buttondivide")).click();
			browser.findElement(By.id("button00")).click();
			try {
				  Thread.sleep(1000);
				} catch (InterruptedException e) {
				  Thread.currentThread().interrupt();
				}
			
			browser.findElement(By.id("buttonequals")).click();
			System.out.println("hello");
			
			String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
			System.out.println(result);	
			String Expected= "Infinity";
			assertEquals(Expected,result);
			browser.close();

 }	
}