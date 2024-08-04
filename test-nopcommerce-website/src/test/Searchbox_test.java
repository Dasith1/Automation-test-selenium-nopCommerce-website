package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchbox_test {

	public static void main(String[] args) {
		//  

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Computer");
		
		WebElement searchbtn = driver.findElement(By.className("search-box-button"));
		searchbtn.click();
		
		
		
	}

}
