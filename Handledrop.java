package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handledrop {

	public static void main(String[] args) {
        
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//to launch Chrome
		driver.get("https://www.google.com/");

		driver.get("https://www.orchidsinternationalschool.com/bengaluru-schools/?utm_source=bing&utm_medium=search&utm_campaign=Bangalore_City_2021-22&utm_term=online%20form&utm_content=&utm_adgroup=school_form_Broad_New&utm_extension=&utm_position=&utm_network=o&utm_experiment={aceid}&utm_placement&gclid=&msclkid=f8be372aa6c819e2748c5775cc7c04da");

		driver.findElement(By.xpath("//*[@id=\"name_lead\"]")).sendKeys("Ritik");
		driver.findElement(By.id("emailid")).sendKeys("Ritikraj2020@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("8927199171");
		
		
		Select select = new Select(driver.findElement(By.id("city_lead")));
		select.selectByVisibleText("Bangalore");
		
	}

}
