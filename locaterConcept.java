package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locaterConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//to launch Chrome
		driver.get("https://www.google.com/");

		driver.get("https://signup.ebay.co.uk/pa/crte?ru=https%3A%2F%2Fwww.ebay.co.uk%2Fhelp%2Faccount%2Fsigning-ebay-account%2Fsigning-ebay-account%3Fid%3D4191");
		
		//for text filed
	//	driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Tom");
		
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Peter");
		
		driver.findElement(By.id("Email")).sendKeys("Ritik1234@gmail.com");
		
		driver.findElement(By.name("firstname")).sendKeys("Ram");
		
	 	driver.findElement(By.linkText("Sign in")).click();
		
	//	driver.findElement(By.partialLinkText("How to get")).click(); 
		
	//	driver.findElement(By.cssSelector("#password")).sendKeys("War@12345");
		
		driver.findElement(By.id("showpassword")).click();
	}

}
