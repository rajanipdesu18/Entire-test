package AnswerDigital.Maven1;	

		import org.testng.annotations.Test;
		import static org.testng.Assert.assertTrue;

		import org.openqa.selenium.By;
		import org.openqa.selenium.chrome.ChromeDriver;


		public class Testcase {

			@Test
			
			public void Scenerio1()
			{
			
				//correct username and wrong password
		ChromeDriver driver = new ChromeDriver();
			driver.get("http://the-internet.herokuapp.com/");	
				driver.findElement(By.xpath("//a[contains(text(),'Form Authentication')]")).click();
				driver.findElement(By.id("username")).sendKeys("tomsmith");
				driver.findElement(By.id("password")).sendKeys("123");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				String S= driver.findElement(By.id("flash")).getText();
				assertTrue(S.contains("Your password is invalid!"));
				System.out.println("User autentication failed");
						
			}
			
			//Wrong username and correct password
			
		@Test
		public void Scenerio2()
		{
			
			ChromeDriver driver = new ChromeDriver();
				driver.get("http://the-internet.herokuapp.com/");	
					driver.findElement(By.xpath("//a[contains(text(),'Form Authentication')]")).click();
					driver.findElement(By.id("username")).sendKeys("ABC");
					driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
					driver.findElement(By.xpath("//button[@type='submit']")).click();
					String S= driver.findElement(By.id("flash")).getText();
					assertTrue(S.contains("Your username is invalid!"));
					System.out.println("User authentication failed");
							
		}
		
			//Correct username and correct password
		@Test
		public void Scenerio3() throws InterruptedException
		{
			//System.setProperty("webdrive.chrome.driver", "//home//rajani//chromedriver_linux64//chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
				driver.get("http://the-internet.herokuapp.com/");	
					driver.findElement(By.xpath("//a[contains(text(),'Form Authentication')]")).click();
					driver.findElement(By.id("username")).sendKeys("tomsmith");
					driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
					driver.findElement(By.xpath("//button[@type='submit']")).click();
					Thread.sleep(1000l);
					driver.findElement(By.xpath("//a[@class='button secondary radius']")).click();
										
		}
		

			
			
			
			


	}


