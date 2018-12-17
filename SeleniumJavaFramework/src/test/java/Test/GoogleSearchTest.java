package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	private static WebDriver driver =null; 
	
	public static void main(String[] args) {
		
		GoogleSearch();		
	}
	
	public static void GoogleSearch() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		//goto google.com
		
		driver.get("https://google.com");
		
		//enter the value in textbox
		//driver.findElement(By.name("q")).sendKeys("Ivo Dinis Leite Barros");
		
		GoogleSearchPage.textbox_Search(driver).sendKeys("Ivo Dinis Leite Barros");
		
		//click on search button
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		//Keep in search
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//close browser
		driver.close();
		
		System.out.println("Test Completed Successfully");
		
		
	}

}
