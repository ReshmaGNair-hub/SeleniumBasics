package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/reshmag/Documents/ChromeDriver/chromedriver" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?tag=googmantxtmob170-21&ascsubtag=_k_EAIaIQobChMI3KKFwt2MiQMVgKNmAh0-IRkHEAAYASAAEgIGJvD_BwE_k_");
		WebElement refname = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		refname.sendKeys("mobile");
		refname.clear();
		
		WebElement cssvalue = driver.findElement(By.cssSelector(".nav-input.nav-progressive-attribute"));
		cssvalue.sendKeys("books");
		driver.close();

	}

}
