
//This program will find alert and then dismiss it.

//This is the package name
package selenium.classwork;

//Importing (Alert, By, and ChromeDriver) classes
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//This is the name of the class/program
public class AlertDismiss {

	//This is the entry point of the program
	public static void main(String[] args) throws InterruptedException {

		  //It will setup property of chromedriver and locate it.
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		  //This create a abject of the ChromeDriver class
		  ChromeDriver browserObject = new ChromeDriver();
		
		 // Open the form page http://training.qaonlinetraining.com/testPage.php using 'get' method
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	        
		 // Locate the 'Conform me' button using 'id' locator and perform click 
	        browserObject.findElement(By.id("confirm")).click();
	        
	        
		 // switch to alert box
	        Alert alert = browserObject.switchTo().alert();
	        
	     // getText method is used to get the text from alert box 
	        alert.getText();
	        
		 //It will hold the part of code for given time limit. 
	       Thread.sleep(3000); 
		
	     //It will hit the cancle button on the alert window
	       alert.dismiss(); 
	      
	     //It will hold 3 second
	       Thread.sleep(3000);
	       
	     //It will close the browser    
	       browserObject.close();

	}

}
