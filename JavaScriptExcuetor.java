package SeleniumPackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class JavaScriptExcuetor {

	public static void main(String[] args) throws IOException {
		
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		

		driver.get("https://ui.cogmento.com/");
		
		driver.findElement(By.name("email")).sendKeys("neha270894@gmail.com");
		
	//	driver.findElement(By.name("password")).sendKeys("Crm@2021");
		
		driver.findElement(By.name("password")).sendKeys("Crm@2020");//wrong password
		
		
	
		
 //		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
       
	 WebElement logbtn = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
	 
	 
	 flash(logbtn , driver);
	 drawBroder(logbtn, driver);
	 
	 
	    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(scrFile, new File("D:\\broder.png"));
		
		
		
		// generateAlert(driver, "There is  a issue for login button");
		
		// Alert alert = driver.switchTo().alert();
		// alert.accept();
		
		clickElementbyJs(logbtn,driver);
		
	//	driver.navigate().refresh();
		 
	//	refreshBrowserByJs(driver);
		
		System.out.println(getTitleByJs(driver));
		
		
		System.out.println(getPageInnerText(driver));
		
		scrollPageDown(driver);
	
		
	//	 driver.close();
	 
	
		
	}
	
	public static void flash(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0 ; i < 10; i++) {
		changeColor("rgb(0,200,0)",element,driver);
		changeColor(bgcolor,element,driver);
		}	
		
	}
	
	public static void changeColor (String color ,WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",element);
		
		try {
			Thread.sleep(20);
			
		}catch(InterruptedException e) {
			
		}
	}
	
	public static void drawBroder(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border = '3px solid red'",element);
	}

	public static void generateAlert(WebDriver driver,String message) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
	}
	
	public static void clickElementbyJs(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",element);

	}
	
	public static void refreshBrowserByJs(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
		
	}
	
	public static String getTitleByJs(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	
	public static String getPageInnerText(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}
	
	public static void  scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}
}

