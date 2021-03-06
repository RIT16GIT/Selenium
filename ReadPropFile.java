package SeleniumPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\Neha\\eclipse-workspace\\SeleniumSession\\src\\SeleniumPackage\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		
		System.out.println(prop.getProperty("age"));
		
	//	System.out.println(prop.getProperty("Name"));
		
		
		String url = prop.getProperty("URL");
		
		System.out.println(url);
		
		String browserName = prop.getProperty("browser");
		
		System.out.println(browserName);
		
		if(browserName.equals("chrome")) {
			
       System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();

		} else if (browserName.equals("IE")){
			System.out.println("IE Browser");
			
		}
		else if (browserName.equals("FF")){
			System.out.println("FireFoX bROWSER");	
		   }
		}
	}


