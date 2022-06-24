package SeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasic {

	public static void main(String[] args) {
		
	//System.setProperty("webdriver.gecko.driver","//C:\\Users\\Neha\\Downloads\\geckodriver-v0.29.0-win64.exe");
		
	//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//to launch Chrome
		driver.get("https://www.google.com/");//to enter URL
		
          String title = driver.getTitle(); 
          
          if(title.equals("Google")) {
        	  System.out.println("Correct Title");     	     	  
          }
          else {
        	  System.out.println("Incorrect Title");
          }
         
          System.out.println(driver.getCurrentUrl());
          
       
          
        //  System.out.println(driver.getPageSource());
	} 
	

}
