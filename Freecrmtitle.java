package SeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Freecrmtitle {

	public static void main(String[] args) {
		
       System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//to launch Chrome
		driver.get("https://classic.crmpro.com");
		
		String s = driver.getTitle();
		System.out.println(s);

	}

}
