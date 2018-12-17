package conf;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class propertiesFile {

	static Properties prop = new Properties();
	static String ProjectPath = System.getProperty("user.dir");
	
	public static void main(String[] args) {
		getProperties();
		setProperties();
	}
	
	public static void getProperties() {
		
		try {
		InputStream input =  new FileInputStream ("C:/Users/ivo.barros/eclipse-workspace/SeleniumJavaFramework/src/test/java/conf/propertiesFile.java");
		prop.load(input);
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		
		} catch(Exception exp){
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	public static void setProperties() {
		try {
		OutputStream output = new FileOutputStream("C:/Users/ivo.barros/eclipse-workspace/SeleniumJavaFramework/src/test/java/conf/propertiesFile.java");
		prop.setProperty("browser", "chrome");
		prop.store(output, null);
		
		} catch(Exception exp){
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
}
