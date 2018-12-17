package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo {
	
	WebDriver driver = null;
	@BeforeTest
	public void setUpTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void GoogleSearch() {
		
		//goto google.com
		
		driver.get("https://google.com");
		
		//enter the value in textbox
		driver.findElement(By.name("q")).sendKeys("Ivo Dinis Leite Barros");
		
		//click on search button
		
		driver.findElement(By.name("btnK")).click();
		
		//keep Search
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterTest
	public void tearDownTest() {
		
		//close browser
			driver.close();
			driver.quit();
			System.out.println("Test Completed Successfully");		
	}
}
