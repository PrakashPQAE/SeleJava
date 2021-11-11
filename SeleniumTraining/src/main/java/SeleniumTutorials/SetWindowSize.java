package SeleniumTutorials;

 

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetWindowSize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		Dimension s = new Dimension(300, 500);
		
		driver.manage().window().setSize(s);
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
