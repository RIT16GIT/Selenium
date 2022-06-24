package SeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CostumeXpath {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
		    driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			driver.get("https://www.myntra.com/");
		
			
	     	driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Footwear");
			
	//		driver.findElement(By.xpath("//input[@name='  ']")).sendKeys("Trouser");
			
	//		driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("Sleepwear");
			
	//		driver.findElement(By.xpath("//input[]start-with(@id,'test_')")).sendKeys("Cloth");
			
		    driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();

	}

}
