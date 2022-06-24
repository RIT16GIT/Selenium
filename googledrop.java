package SeleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googledrop {

	public static void main(String[] args) {
		
    System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//to launch Chrome
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
	//	driver.findElement(By.xpath("//span[@class='vRMGwf oJeWuf'and contains(text(),'')]"));
		
		List<WebElement> List = driver.findElements(By.xpath("//span[@class='vRMGwf oJeWuf'and contains(text(),'')]"));
		

		 
		System.out.println(List.size());
		
		for(int i =0 ;i<List.size();i++) {
			System.out.println(List.get(i).getText());
		}
		

	}

}
