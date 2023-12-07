
//This program will open the Facebook login page and enter login & password value

//This is the selenium package name
package selenium.classwork;

//This import By, WebDriver and ChromeDriver classes
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//This is the name of the class
public class FacebookLogIn {

	//This is starting point of the program
	public static void main(String[] args) {
	
		
		WebDriver browserObject;
		  //1. setup the property of chromedriver to pass value to form input box through chrome web browser.
		    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			
		    // 2. Initialize Webdriver object through ChromeDriver class.
		    browserObject = new ChromeDriver();
		    // 3. Open form page of http://www.training.qaonlinetraining.com/testPage.php
		    browserObject.get("https://www.facebook.com/");
		    
		    // sending text to the input box in the web form--------------
		    // 4. Locate Name section using name locator and send values using sendkeys
		    browserObject.findElement(By.name("email")).sendKeys("5717219489");
		    
		 // 5. Locate email section using name locator and send values using sendkeys
		    browserObject.findElement(By.name("pass")).sendKeys("XYZABC1234");
		    
		 // 6. Locate the submit button and perform click
		    browserObject.findElement(By.name("login")).click();
		    
	}

}
