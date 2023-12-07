
package SeleniumProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		// setup the property of chromedriver to open google page through chrome web browser.
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		  
		// Create a Webdriver's object through ChromeDriver class.
	        WebDriver browserObject = new ChromeDriver();
		// Open the http://www.google.com/ link using get method.
	        browserObject.get("http://www.google.com/");
	        
	     // Maximize the browser window
	        browserObject.manage().window().maximize();
	}
}
