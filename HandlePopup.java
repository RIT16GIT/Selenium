package SeleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopup {

	public static void main(String[] args) throws InterruptedException  {
    System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
	
		
		Alert alert = driver.switchTo().alert();
	
		
		System.out.println(alert.getText());
		
		String text = alert.getText();
		
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct ALert message");
		}
		else {
			System.out.print("Incorrect Alert message");
		}
		
		alert.accept();
		
		//alert.dismiss();

	}

}
