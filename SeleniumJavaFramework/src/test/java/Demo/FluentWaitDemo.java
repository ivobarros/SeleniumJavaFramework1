package Demo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {
	
	public static void main(String[] args) throws Exception{
		
		test();
		
	}
	
	public static void test() throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/ChromeDriver/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\Users\ivo.barros\eclipse-workspace\SeleniumJavaFramework\Drivers\ChromeDriver\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Abcd");
		driver.findElement(By.name("btnK")).click(); 
		
		driver.findElement(By.linkText("ABCD - NIMH Data Archive - NIH"));
		
		
		Wait<WebDriver>wait = new FluentWait <WebDriver>(driver)
		.withTimeout(30, TimeUnit.SECONDS)
		.pollingEvery(5, TimeUnit.SECONDS)
		.ignoring(NoSuchElementException.class);
		
		WebElement element = wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				WebElement linkElement = driver.findElement(By.linkText("ABCD - NIMH Data Archive - NIH"));
			}
		}};
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
	}

}
