package Demo;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	 
	String projectPath = System.getProperty("user.dir"); 
	System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/ChromeDriver/chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test1() throws Exception {
    driver.get("https://www.orangehrm.com/");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Toggle navigation'])[1]/following::img[1]")).click();
    driver.findElement(By.name("q")).click();
    driver.findElement(By.name("q")).clear();
    driver.findElement(By.name("q")).sendKeys("orange");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jamboard'])[1]/following::b[1]")).click();
    driver.findElement(By.linkText("Open Source HR Software")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Resultados da Web'])[1]/following::h3[1]")).click();
    driver.findElement(By.linkText("Open Source Human ...")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='View our site for the latest OrangeHRM open source ...'])[1]/following::div[1]")).click();
    driver.findElement(By.linkText("About OrangeHRM")).click();
    driver.findElement(By.linkText("Features")).click();
    driver.findElement(By.linkText("Download")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Headquarters'])[1]/following::h3[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LOGIN Panel'])[1]/following::span[1]")).click();
    driver.findElement(By.id("txtUsername")).clear();
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    driver.findElement(By.id("divPassword")).click();
    driver.findElement(By.id("txtPassword")).click();
    driver.findElement(By.id("txtPassword")).clear();
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    driver.findElement(By.id("frmLogin")).submit();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Quick Launch'])[1]/following::img[1]")).click();
    driver.findElement(By.id("menu_admin_viewAdminModule")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Time'])[1]/following::b[1]")).click();
    driver.findElement(By.id("menu_recruitment_viewJobVacancy")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Vacancies'])[1]/following::b[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Vacancies'])[1]/following::b[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Vacancies'])[1]/following::b[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Vacancies'])[1]/following::b[1]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Vacancies'])[1]/following::b[1] | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Employee Trackers'])[1]/following::b[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Dashboard'])[1]/following::b[1]")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
