package SeleniumPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWait {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
	
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
	//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			
			driver.get("https://www.facebook.com/r.php");
			
		WebElement firstname =	driver.findElement(By.name("firstname"));
		WebElement lastname =	driver.findElement(By.name("lastname"));
	//	WebElement loginPage =  driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]"));
		WebElement loginPage = driver.findElement(By.xpath("//input[@type='submit']"));
			
	
	
		
		           sendkeys(driver,firstname,20, "Neha");
		           sendkeys(driver,lastname,20, "Rajak");
		           
		           
		           
		           clickOn(driver,loginPage,20);
	}
	


	    public static void clickOn(WebDriver driver, WebElement locator, int Timeout){
		new WebDriverWait(driver, Timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
		}

	    
	    
	public static void sendkeys(WebDriver driver, WebElement element ,int Timeout,String value) {	
	new WebDriverWait(driver,Timeout).until(ExpectedConditions.visibilityOf(element));
	element.sendKeys(value);
	}
}
