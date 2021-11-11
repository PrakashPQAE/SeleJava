package SeleniumTutorials;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		TakesScreenshot srcShot = (TakesScreenshot) driver;
		
		File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
		
		File DestFile = new File("./Drivers");
		
		//FileUtils.copyFile(srcFile,DestFile);

	}

}
