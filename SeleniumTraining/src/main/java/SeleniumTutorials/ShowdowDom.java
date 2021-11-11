package SeleniumTutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShowdowDom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://books-pwakit.appspot.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("Title of the page "+ driver.getTitle());
				
		// To get the element inside the shadowdom , we need to 1st identify the host element
		// with the tagname and provide it inside the JSExecutor
		
		WebElement root1 = driver.findElement(By.tagName("book-app"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele1 = (WebElement) js.executeScript("return arguments[0].shadowRoot", root1);
		
		WebElement eleR1 = ele1.findElement(By.tagName("app-header"));
		
		Thread.sleep(3000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		
		js1.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", eleR1);
		

	}

}
