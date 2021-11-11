package SeleniumTutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardControls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("userName")).sendKeys("TestName");
		
		driver.findElement(By.id("userEmail")).sendKeys("TestName@gmail.com");
		
		WebElement currAddress = driver.findElement(By.id("currentAddress"));
		
		driver.findElement(By.id("currentAddress")).sendKeys("TestAddress");
		
		Thread.sleep(2000);
		
		Actions a = new Actions(driver);
		
		//a.keyDown(currAddress, Keys.CONTROL).sendKeys("a").keyUp(currAddress,Keys.CONTROL).build().perform();
		
		a.keyDown(currAddress, Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(currAddress,Keys.CONTROL).build().perform();
		
		//a.keyDown(currAddress,Keys.CONTROL).sendKeys("c").keyUp(currAddress, Keys.CONTROL).build().perform();
		
		WebElement perAddress = driver.findElement(By.id("permanentAddress"));
		
		a.keyDown(perAddress,Keys.CONTROL).sendKeys("v").keyUp(perAddress,Keys.CONTROL).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
