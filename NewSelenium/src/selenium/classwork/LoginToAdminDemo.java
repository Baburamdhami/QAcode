
/*This program will first clear the text from login and password field
and enter the new login & password to login into the dashboard and finally close the browser. */

//This is the name of the package
package selenium.classwork;

//Importing (By, WebDriver, WebElement, and ChromeDriver) classes
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//This declares a public Java class named LoginToAdminDemo
public class LoginToAdminDemo {

	//This is the starting point of the program
	public static void main(String[] args) throws InterruptedException {
		
		//This will setup the property of Chromedriver and locate it
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		//Create WebDriver's object 
		WebDriver browserObj = new ChromeDriver();
		
		//This will open login page of https://admin-demo.nopcommerce.com/login using get method
		browserObj.get("https://admin-demo.nopcommerce.com/login");

		// Get Email input box by locate the id method.
        WebElement email=browserObj.findElement(By.id("Email"));
        // Clear the Email input box.
        email.clear();
        
        // Get Password input box by locate the id method.
        WebElement password=browserObj.findElement(By.id("Password"));
        // Clear the Password input box.
        password.clear();
        
        // Enter the correct email to email input box
        email.sendKeys("admin@yourstore.com");
        
        // Enter the correct password to password input box 
        password.sendKeys("admin");
        
        // Get login button by locate the classname method.
        WebElement button=browserObj.findElement(By.className("button-1"));
        
        // Submit the button.
        button.submit();
        
        //This will hold browser for 3 second before it closes
        Thread.sleep(3000);
        
        // Close the web browser.
        browserObj.close();
	}

}
