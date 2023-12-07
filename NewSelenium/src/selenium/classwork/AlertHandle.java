
//This program will open the web page, find the alert, and accept/handle the alert.

//Name of the package 
package selenium.classwork;

//Importing (Alert, By, and ChromeDriver) classes
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//This is name of the class
public class AlertHandle {

	//This is the start point of the program
	public static void main(String[] args) throws InterruptedException {

			//This will setup the property of chromedriver and locate it.
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
			//This create a abject of the ChromeDriver class
			ChromeDriver browserObject = new ChromeDriver();
		
			// Open the web page http://training.qaonlinetraining.com/testPage.php using 'get' method
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	        
	        // Locate the alert button and perform click 
	        browserObject.findElement(By.id("alert")).click();
	        
	        
	        // switch to alert box
	        Alert alert = browserObject.switchTo().alert();
	        
	        // getText method is used to get the text from alert box 
	        System.out.println(alert.getText());
	        
	        // Thread.sleep is used to wait for 6000 milli seconds 
	        Thread.sleep(6000); 
		
	        //hit the ok button on the alert window
	        alert.accept(); 
	        
	        // wait for 6000 milli seconds    
	        Thread.sleep(6000);
	       
	        //Close the web browser
	        browserObject.close();

	}

}
