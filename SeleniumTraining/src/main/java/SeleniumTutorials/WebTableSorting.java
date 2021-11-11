package SeleniumTutorials;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebTableSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,1,4,6,7,3};
		int a_length = a.length;		
		for(int i = 0; i< a_length; i++) {
			for(int j = 0; j < a_length-1;j++) {
				if(a[j]> a[j+1]) {

					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;					
				}				
			}				
			System.out.println(a[i]);
		}

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		RemoteWebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/web-table-element.php");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		java.util.List<WebElement>  all_values =   driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));

		System.out.println(all_values.size());

		for(int i = 1;i<= all_values.size();i++) { 
			
			String eachVal = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td[1]/a")).getText();
			
			System.out.println(eachVal);

			if(eachVal.contains("REC")) {
				
				System.out.println(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td[5]")).getText());
			}
		}
		
		for(int i =1; i<= all_values.size();i++) {
			
			String expValue = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]")).getText();
			
			if(expValue.contains("Sun")){
				
				List<WebElement> allColumns= driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td"));
				
				int totalColumns = allColumns.size();
				
				for(int j = 1; j <=totalColumns; j++) {
					
					driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]")).getText();
								
				}	
				
			}
		}
							
		driver.quit();
	}	

}
