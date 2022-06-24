package SeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingframes {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		

		driver.get("https://ui.cogmento.com/");
		
		driver.findElement(By.name("email")).sendKeys("neha270894@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Crm@2021");
		
	    Thread.sleep(2000);
		

		
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	}

}
