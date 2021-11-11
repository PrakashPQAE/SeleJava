package SeleniumTutorials;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.sun.glass.events.KeyEvent;

public class FileUpload {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.indeed.co.in");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.className("resume-promo-link")).click();
		
		driver.findElement(By.xpath("//label[contains(text(),'Upload Resume')]")).click();

		//driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\God\\Desktop\\RefNum_AMCAT.txt");

		// Method 2 - Robot class
		Thread.sleep(2000);
		
		StringSelection strSel = new StringSelection("C:\\SeleniumResume.doc");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSel, null);

		Robot r = new Robot();

		r.delay(2000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
