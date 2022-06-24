package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileupload {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//to launch Chrome
		driver.get("https://www.google.com/");
		
		//url where we need to upload file
		driver.get("http:www.input.file//");
		
		//Button name in xpath and in send keys path of file
		driver.findElement(By.xpath("Filename")).sendKeys("C:\\downloads\\selenium\\file");

	}

}
