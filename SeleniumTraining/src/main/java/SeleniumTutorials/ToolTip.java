package SeleniumTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Testing");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		WebElement element = driver.findElement(By.id("logo"));
	
		System.out.println(element.getAttribute("title"));
		
		Thread.sleep(1000);
	
		WebElement e1 = driver.findElement(By.xpath("//div[@aria-label='Settings']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(e1).build().perform();
		
		Thread.sleep(3000);
				
		driver.quit();
		
		
		
	}

}
