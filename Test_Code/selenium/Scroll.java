package org.openqa.selenium;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//Navigating to the URL
		System.setProperty("webdriver.chrome.driver", "//home//rajani//chromedriver_linux64//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Infinite Scroll')]")).click();
		
		//Scrolling up to down- once
		JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,900)", ""); 
        driver.findElement(By.xpath("//h3[contains(text(),'Infinite Scroll')]")).click();
        Thread.sleep(1000);
        
                ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(By.xpath("//div[@id='page-footer']")).click();
        //Scrolling Up to down- twice
        jse.executeScript("window.scrollBy(0,900)", ""); 
        driver.findElement(By.xpath("//h3[contains(text(),'Infinite Scroll')]")).click();
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(By.xpath("//div[@id='page-footer']")).click();
        
		//Scrolling down to up
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight,0)");
        
        //Checking if the text matched with the given text
        String S= driver.findElement(By.xpath("//h3[contains(text(),'Infinite Scroll')]")).getText();
        assertTrue(S.contains("Infinite Scroll"));
        System.out.println("Success");
        

	
	}
}
        
       