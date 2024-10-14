package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/reshmag/Documents/ChromeDriver/chromedriver" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement emailid = driver.findElement(By.id("email"));//declaring webelement//By is a class
		emailid.click();
		emailid.sendKeys("reshmavijayabhanu111@gmail.com");
		WebElement passwordfield = driver.findElement(By.name("pass"));
		passwordfield.click();
		passwordfield.sendKeys("Reshma");
		passwordfield.clear();//clearing passowrd
		//uniqueness in id and name but class name cannot be trusted.class name keeps on changing
		WebElement classnameog = driver.findElement(By.id("inputtext _55r1 _6luy")) ;
		classnameog.click();
	}

}
