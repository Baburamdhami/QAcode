
//This is the name of package 
package SeleniumProgram;

//Improting different classess 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {

	
	public static void main(String[] args) {
		
		//Declare webdriver interface
		WebDriver browserObject;
		
		// setup the property of chromedriver because we will perform testing of login process through chrome web browser.
	        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	        
		//  Initialize Webdriver object through ChromeDriver class.
	        browserObject = new ChromeDriver();
	        
		// Open login page of https://admin-demo.nopcommerce.com/login using get method
	        browserObject.get("https://admin-demo.nopcommerce.com/login");
	       
		// Get Email input box by locate the id method.
	        WebElement email=browserObject.findElement(By.id("Email"));
		// Clear the Email input box.
	        email.clear();
		// Get Password input box by locate the id method.
	        WebElement password=browserObject.findElement(By.id("Password"));
		// Clear the Password input box.
	        password.clear();
	        
		// Enter the correct email to email input box
	        email.sendKeys("admin@yourstore.com");
	        
		// Enter the correct password to password input box 
	        password.sendKeys("admin");
	        
		// Get login button by locate the classname method.
	        WebElement button=browserObject.findElement(By.className("button-1"));
	        
		// Submit the button.
	        button.submit();
		// Close the web browser.
		// browserObject.close();
		}

	}

