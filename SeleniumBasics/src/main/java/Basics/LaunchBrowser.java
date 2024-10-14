package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/reshmag/Documents/ChromeDriver/chromedriver" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");//open Url
	    driver.manage().window().maximize(); //maximize
	   String title= driver.getTitle();//application tab title
	   System.out.println(title);
	   String currenturl = driver.getCurrentUrl();//getting current url
	   System.out.println(currenturl);
	   driver.get(currenturl);//refresh
	}

}
