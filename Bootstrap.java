package SeleniumPackage;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.jquery-az.com/jquery/demo.php?ex=167.0_1");

		
		driver.findElement(By.xpath("//span[contains(text(),'Your Expertise')]")).click();
		
	  List<WebElement> list =	driver.findElements(By.xpath("//ul[contains(@class,'dropdown-menu inner')]//li//a"));
	  
	  System.out.println(list.size());
	  
	  for(int i=0 ; i<list.size();i++) {
		  
		System.out.println(list.get(i).getText())  ; 
		
		if(list.get(i).getText().contains("Oracle")) {
			list.get(i).click();
			break;
		}
	  }
	}

}
