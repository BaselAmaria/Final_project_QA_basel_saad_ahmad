package Selleniun_start_projects.Selleniun_start_projects;
import static org.junit.Assert.assertNotEquals;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Password_check {
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
			  System.setProperty("webdriver.gecko.driver","C:\\Users\\Win10\\git\\final_project\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  	  String url="https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html";
		      browser.get(url);
	  }
	 @Test
	 public void validation_password() {
		 browser.findElement(By.name("characters")).sendKeys("basel123");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Valid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();
	 }
	 @Test
	 public void bigger_than_8_digits() {
		 browser.findElement(By.name("characters")).sendKeys("saadamaria2000");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Invalid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();	
		 }
	 @Test
	 public void smaller_than_7_digits() {
		 browser.findElement(By.name("characters")).sendKeys("ahmad");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Invalid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();	
	 }
	 @Test
	 public void invalid_character() {
		 browser.findElement(By.name("characters")).sendKeys("baselam?");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Invalid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();	
	 }
	 @Test
	 public void invalid_character2() {
		 browser.findElement(By.name("characters")).sendKeys("saadam!");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Invalid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();	
	 }
	 @Test
	 public void invalid_character3() {
		 browser.findElement(By.name("characters")).sendKeys("ahmadzo#");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Invalid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();	
	 }
	 
	 @Test
	 public void valid_character() {
		 browser.findElement(By.name("characters")).sendKeys("basel20*");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Valid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();	
	 }
}
