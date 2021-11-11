package SeleniumTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		Actions a = new Actions(driver);
		
		WebElement ele = driver.findElement(By.id("idOfButton"));
		
		a.contextClick(ele).build().perform();		
		
		Thread.sleep(2000);
		
		driver.quit();
	 

	}

}
