package SeleniumTutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageRefresh {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		Thread.sleep(2000);
		
		driver.get(driver.getCurrentUrl());
		
		System.out.println(driver.getCurrentUrl()); 
		
		driver.quit();


	}

}
