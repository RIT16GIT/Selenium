package SeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable {

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
		
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[3]/a/span")).click();
		
		
		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[1]/td[2]/a
		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[2]/td[2]/a
		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[3]/td[2]/a
		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[4]/td[2]/a
	
		
		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[4]/td[1]
		
		
		  String before_xpath ="//*[@id= 'main-content']/div/div[2]/div/table/tbody/tr["; 
		  String after_xpath  = "]/td[2]/a";
		  
		  for(int i =1 ; i<=4 ;i++) { 
			  String name = driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
		  System.out.println(name); Thread.sleep(2000);
		  
		  if(name.contains("Deep Sham")) { driver.findElement(By.
		  xpath("//*[@id= 'main-content']/div/div[2]/div/table/tbody/tr["+i+"]/td[1]"
		  )).click(); } }
		
				
	//	driver.findElement(By.xpath("//a[contains(text(),'Neha kumari')]/parent::td//preceding-sibling::td//div[@class='ui fitted read-only checkbox']")).click();
		
		
		Thread.sleep(2000);

	}
	

}
