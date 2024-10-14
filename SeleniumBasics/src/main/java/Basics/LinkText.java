package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/reshmag/Documents/ChromeDriver/chromedriver" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		//WebElement forgotpswd = driver.findElement(By.linkText("Forgotten account?"));
		//forgotpswd.click();
		WebElement pswd = driver.findElement(By.partialLinkText("acco"));
		pswd.click();

	}

}
