package SeleniumTutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://demoqa.com/alerts");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("alertButton")).click();

		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);

			wait.until(ExpectedConditions.alertIsPresent());

			driver.switchTo().alert().accept();
			
			System.out.println("Clicked on Alert");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 
			System.out.println("Alert Not Present");
		}

		driver.quit();






	}

}
