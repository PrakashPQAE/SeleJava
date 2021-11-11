package SeleniumTutorials;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");

		driver.manage().window().maximize();

		List<WebElement> allLinks= driver.findElements(By.tagName("a"));

		System.out.println("Total number of Links available in the webpage-->"+allLinks.size());

		for (int i = 0; i < allLinks.size(); i++) {

			WebElement eachLink = allLinks.get(i);
			
			String hrefValue = eachLink.getAttribute("href");
			
			URL url = new URL(hrefValue);
			
			HttpURLConnection httpConnection =  (HttpURLConnection) url.openConnection();
			
			httpConnection.setConnectTimeout(3000);
			
			httpConnection.connect();
			
			if(httpConnection.getResponseCode()==200) {
				
				System.out.println(hrefValue + " --> "+ httpConnection.getResponseMessage());
			}
			else {
				
				System.out.println(hrefValue + " --> "+ httpConnection.getResponseMessage());
			}
		}

		driver.close();
	}

}
