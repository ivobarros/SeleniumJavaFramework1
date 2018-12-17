package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.SkipException;
import org.testng.TestNG;

@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo {
	
	public void test1() {
		System.out.println("I am inside Test1");
	}
	
	public void test2() {
		System.out.println("I am inside Test2");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath: "+ projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/ChromeDriver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("lst-ib")).sendKeys("Ivo Dinis Leite Barros");
		driver.findElement(By.id("abc")).sendKeys("Ivo Dinis Leite Barros");
		
		driver.close();
	}
	
	public void test3() {
		System.out.println("I am inside Test3");
	}

}
