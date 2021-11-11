package SeleniumTutorials;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.get("https://demoqa.com/browser-windows");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("tabButton")).click();

		Thread.sleep(2000);

		Set<String> allWindows = driver.getWindowHandles();

		System.out.println("Total Windows Opened " + allWindows.size());
		
		  // Moving to Last window	  
		  
		  for (String string : allWindows) {
		  
		  driver.switchTo().window(string);
		  
		  }		 

		// Moving to specified window

		int i = 0;

		for (String string : allWindows) {

			driver.switchTo().window(string);

			if (i == 1) {

				break;
			}

			i++;
		}

		// Moving to 1st window

		for (String string : allWindows) {

			driver.switchTo().window(string);

			break;
		}

		// OR

		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());

		driver.close();

		driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());

		driver.findElement(By.id("tabButton")).click();

	}

}
