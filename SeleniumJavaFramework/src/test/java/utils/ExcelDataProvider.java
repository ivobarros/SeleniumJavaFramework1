package utils;

import org.testng.annotations.Test;


import conf.propertiesFile;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider {
	
	WebDriver driver =null;
	
	@BeforeTest
	public void setUpTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test(dataProvider="test1data")
	public void test1 (String username, String password) throws Exception {
		System.out.println(username+" | "+password);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(2000);
	}
	
	
	@DataProvider(name="test1data")
	public Object [] [] getData() {
		String excelPath = "C:\\Users\\ivo.barros\\eclipse-workspace\\SeleniumJavaFramework\\excel\\data.xlsx";
		Object data [] []= testData(excelPath, "Folha1");
		return data;
		
	}
	@Test
	public static Object[] [] testData(String excelPath, String sheetName) {
		
		ExcelUtils  excel = new ExcelUtils(excelPath, sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getcolCount();
		
		Object data [] []= new Object [rowCount-1] [colCount];
		
		for(int i=1; i<rowCount; i++){
			for(int j=0; j<colCount; j++) {
				
				String CellData= excel.getCellDataString(i, j);
				//System.out.println(CellData+ " ");
				data[i-1][j] = CellData; 
			}
			System.out.println();
		}
		return data;
	}

}
