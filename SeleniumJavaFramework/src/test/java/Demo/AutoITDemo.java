package Demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {
	
	public static void main(String[] args) throws Exception {
		
		test();
	}
	
	public static void test() throws Exception {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ivo.barros\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.tinyupload.com/");
	driver.findElement(By.name("upload_file"));
	
	Runtime.getRuntime().exec("C:\\Users\\ivo.barros\\Documents\\test.exe");
	
	
	Thread.sleep(3000);
	driver.close();
	
	}

}
