package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPagesObjects;

public class GoogleSearchPageTest {
	
	private static WebDriver driver=null; 
	
	public static void main (String[] args) {
		googleSearchTest();
	}
	
	public static void googleSearchTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
	
		GoogleSearchPagesObjects searchpajeobj = new GoogleSearchPagesObjects(driver);
		
		driver.get("https://google.com");
		
		searchpajeobj.setTextInSearchBox("A B C D");
		
		searchpajeobj.clickSearchButton();
		
		driver.close();
		
	}

}
