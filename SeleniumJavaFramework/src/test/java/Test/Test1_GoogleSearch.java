package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {
	
	public static void main(String[] args) {
		GoogleSearch();
	}
	public static void GoogleSearch() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//goto google.com
		
		driver.get("https://google.com");
		
		//enter the value in textbox
		driver.findElement(By.name("q")).sendKeys("Ivo Dinis Leite Barros");
		
		//click on search button
		
		driver.findElement(By.name("btnK")).click();
	
		//Keep in search
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//close browser
		driver.close();
		
		System.out.println("Test Completed Successfully");
		
		
	}

}
