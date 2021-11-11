package SeleniumTutorials;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedShadowDom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://shop.polymer-project.org/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement ShowBaseHost = driver.findElement(By.xpath("//shop-app[@page='home']"));
		
		WebElement allele = showRoot(ShowBaseHost, driver);
		
		WebElement ironPage = allele.findElement(By.tagName("iron-pages"));
		
		WebElement showhomeShadowHost = ironPage.findElement(By.tagName("shop-home"));
		
		WebElement shopButton = showRoot(showhomeShadowHost, driver);
		
		shopButton.findElement(By.cssSelector("div:nth-child(2)>shop-button>a")).click();
		
		System.out.println("clicked Successfully");		
	}
	
	public static WebElement showRoot(WebElement element,WebDriver driver) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement shadowRoot  = (WebElement) js.executeScript("return arguments[0].shadowRoot", element);		
		return shadowRoot;
		
	}

}
