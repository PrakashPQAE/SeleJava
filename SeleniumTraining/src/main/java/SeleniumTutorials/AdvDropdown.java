package SeleniumTutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;


public class AdvDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		
		driver.get("https://demoqa.com/select-menu");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement dropDown = driver.findElement(By.id("oldSelectMenu"));
		
		Select sel = new Select(dropDown);
		
		java.util.List<WebElement> allDropDownValues = sel.getOptions();
		
		int totalValues = allDropDownValues.size();
		
		System.out.println(totalValues);
		
		for (WebElement eachDropDownValue : allDropDownValues) {
			
			System.out.println(eachDropDownValue.getText());			
		}
		
		System.out.println("Last Element in the dropdown is "+ allDropDownValues.get(totalValues-1).getText());
		
		driver.quit();
		
		
		
		

	}

}
