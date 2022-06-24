package SeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousemovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		

		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		 
		
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	//	Thread.sleep(4000);
		
	//	driver.findElement(By.xpath("//*[@id=\"header-addons\"]/ul/li[2]/a")).click();
		
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"ctl00_HyperLinkLogin\"]"))).build().perform();
		
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"smoothmenu1\"]/ul/li[18]/ul/li[2]/a"))).build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"smoothmenu1\"]/ul/li[18]/ul/li[2]/ul/li[1]/a")).click();
	}

}
