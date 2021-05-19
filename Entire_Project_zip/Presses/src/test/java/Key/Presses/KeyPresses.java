package Key.Presses;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KeyPresses {
@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Key Presses')]")).click();
	//When Backspace is entered as a key
		driver.findElement(By.id("target")).sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000l);
	String S=driver.findElement(By.id("result")).getText();
	assertTrue(S.contains("You entered: BACK_SPACE"));
		System.out.println("SUCCESS"+S);
		
		
		//When Control is entered as a key
		driver.findElement(By.id("target")).sendKeys(Keys.CONTROL);
		Thread.sleep(2000l);
	String S1=driver.findElement(By.id("result")).getText();
	assertTrue(S1.contains("You entered: CONTROL"));
		System.out.println("SUCCESS"+S1);
		
		//When Tab is enetered as a key
		
		driver.findElement(By.id("target")).sendKeys(Keys.TAB);
		Thread.sleep(2000l);
	String S2=driver.findElement(By.id("result")).getText();
	assertTrue(S2.contains("You entered: TAB"));
		System.out.println("SUCCESS"+S2);
		
		//When Escape is entered as a key
		
		driver.findElement(By.id("target")).sendKeys(Keys.ESCAPE);
		Thread.sleep(2000l);
	String S3=driver.findElement(By.id("result")).getText();
	assertTrue(S3.contains("You entered: ESCAPE"));
		System.out.println("SUCCESS"+S3);
		
		
		
		
	
		
		
	}
	
	

}
