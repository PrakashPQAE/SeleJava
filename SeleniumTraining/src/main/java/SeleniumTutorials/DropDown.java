package SeleniumTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		WebElement dropDown = driver.findElement(By.id("testingDropdown"));
		
		Select sel = new Select(dropDown);
		
		sel.selectByIndex(0);		
		Thread.sleep(1000);
		
		sel.selectByVisibleText("Performance Testing");
		Thread.sleep(1000);
		
		sel.selectByValue("Manual");
		
		driver.quit();

	}

}
