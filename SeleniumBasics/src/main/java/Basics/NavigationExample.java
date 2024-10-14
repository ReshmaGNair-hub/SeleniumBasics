package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/reshmag/Documents/ChromeDriver/chromedriver" );
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().to("https://www.obsqurazone.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

		driver.quit();//terminate all tab
		driver.close();//to close current tab 
		// TODO Auto-generated method stub

	}

}
