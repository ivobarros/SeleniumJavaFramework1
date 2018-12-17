package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPagesObjects {
	
	WebDriver driver = null;
	
	By textbox_search = By.id("lst-ib");
	By search_button =By.name("btnK");
	
	public GoogleSearchPagesObjects(WebDriver driver) {
	
		this.driver= driver;	
	}

	public void setTextInSearchBox (String text) {
		
		driver.findElement(textbox_search).sendKeys("text");
	}
	
	public void clickSearchButton () {
		
		driver.findElement(search_button).sendKeys(Keys.RETURN);
	}
}

