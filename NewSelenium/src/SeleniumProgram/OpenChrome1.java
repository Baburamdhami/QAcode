package SeleniumProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("http://www.amazon.com/");
	        
	     // Maximize the browser window
	        browserObject.manage().window().maximize();
	       
	        //Close the browser
	        browserObject.close();

	}

}
