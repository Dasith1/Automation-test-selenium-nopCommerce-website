package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Register {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement register = driver.findElement(By.className("ico-register"));
		register.click();
		
		WebElement maleradio= driver.findElement(By.id("gender-male"));
		maleradio.click();
		
		driver.findElement(By.id("FirstName")).sendKeys("John");
		driver.findElement(By.id("LastName")).sendKeys("Smith");
		
		// Create object of the Select class
		Select se = new Select(driver.findElement(By.xpath("//*[@name='DateOfBirthDay']")));
		se.selectByIndex(5);
		
		Select month = new Select(driver.findElement(By.xpath("//*[@name='DateOfBirthMonth']")));
		month.selectByIndex(5);
		
		Select year = new Select(driver.findElement(By.xpath("//*[@name='DateOfBirthYear']")));
		year.selectByIndex(5);
		
		driver.findElement(By.id("Email")).sendKeys("test1@gmail.com");
		
		driver.findElement(By.id("Company")).sendKeys("ABC Comapany");
		
		WebElement checkbox =driver.findElement(By.id("Newsletter"));
		
		if(!checkbox.isSelected()) {
			checkbox.click();
		}
		
		WebElement password =driver.findElement(By.id("Password"));
		password.sendKeys("test123");
		
		WebElement Cpassword =driver.findElement(By.id("ConfirmPassword"));
		Cpassword.sendKeys("test123");
		
		 
		WebElement sumbitBTN = driver.findElement(By.name("register-button"));
		 
		
			sumbitBTN.submit();
	 
		
	}

}
