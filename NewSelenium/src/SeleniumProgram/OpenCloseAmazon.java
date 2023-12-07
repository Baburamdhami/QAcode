
package SeleniumProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCloseAmazon {

	public static void main(String[] args) {
		// 1. setup the property of chromedriver to open amazon page through chrome web browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class. 
	        WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.amazon.com/ link using get method.
	        browserObject.get("http://www.amazon.com/");
	        
	        try {
	            Thread.sleep(5000); // Wait for 5 seconds.
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

		browserObject.close();

	}

}