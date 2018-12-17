import java.awt.List;
import java.awt.ist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {
	
	public static <Webelement> void main(String[]args) { 
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath: "+ projectPath);
		
		//System.setProperty("webdriver.gecko.driver", projectPath+"\\Drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/ChromeDriver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", projectPath+"/Drivers/iedriver/IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver ();
		
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.id("lst-ib")).sendKeys("Ivo Dinis Leite Barros");
		
		//driver.findElement(By.xpath("//input[@name='q']")); 
		
		//List<WebElement> listOfInputElements = driver.findElements(By.xpath("input"));
		
		//int count = listOfInputElements.size();
		
		//System.out.println("Count of Input Elements: "+count);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		driver.close();
	}

}
