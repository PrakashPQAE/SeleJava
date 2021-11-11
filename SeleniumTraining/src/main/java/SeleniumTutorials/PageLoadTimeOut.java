package SeleniumTutorials;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOut {
	public static String pageStatus ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		//driver.manage().timeouts().pageLoadTimeout(0, TimeUnit.SECONDS);
		
		// JS Executor
		JavascriptExecutor js;		
		do {
			
			js = (JavascriptExecutor)driver;
			pageStatus =  (String) js.executeScript("return document.readyState");		
		}
		while(!pageStatus.equals("complete"));
		System.out.println("Page Loaded");
	
		driver.quit();
	}

}
