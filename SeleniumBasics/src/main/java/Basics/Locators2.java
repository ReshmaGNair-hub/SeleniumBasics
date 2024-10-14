package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/reshmag/Documents/ChromeDriver/chromedriver" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		WebElement emailid = driver.findElement(By.id("single-input-field"));
		emailid.click();
		emailid.sendKeys("reshmavijayabhanu111@gmail.com");
		WebElement button = driver.findElement(By.id("button-one"));
		button.click();
		
		
		

	}

}
