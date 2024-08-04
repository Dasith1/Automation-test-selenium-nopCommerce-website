package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_test {

	public static void main(String[] args) {
	
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.nopcommerce.com/");
			
			WebElement login =  driver.findElement(By.className("ico-login"));
			login.click();
			
			driver.findElement(By.className("email")).sendKeys("test1@gmail.com");
			driver.findElement(By.className("password")).sendKeys("test123");
			
			WebElement sumbit = driver.findElement(By.className("login-button"));
			sumbit.click();
			
		}
		catch(Exception e) {
			
		}

	}

}
