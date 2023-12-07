
//This program will open rediff.com and enter login button and hendle alert
//This is the name of the package 
package selenium.classwork;

//This code import 'Alert', and 'chromedriver' class 
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//This is the name of the class/program
public class RediffAlert {
    
	//This is the start point of the program
	public static void main(String[] args) throws InterruptedException {
		

		//It setup property of chromedriver and locate the chrome drive
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		
			// Create a object named 'browserObject'
	        ChromeDriver browserObject = new ChromeDriver();
	        
	        // Open the http://www.mail.rediff.com/ link using get method.
	        browserObject.get("https://mail.rediff.com/cgi-bin/login.cgi");
	        
	        // Maximize the window    
	        browserObject.manage().window().maximize();
	        
	        //Wait time is 2 second
	        Thread.sleep(2000);
	        
	      //It will find 'sign in' button ans click
		    browserObject.findElement(By.name("proceed")).click();
		    
		    
		 // switch to alert box
	        Alert alert = browserObject.switchTo().alert();
	        
	     // getText method is used to get the text from alert box 
	        alert.getText();
	        
		 //It will hold the part of code for given time limit. 
	      Thread.sleep(2000); 
		
	     //It will hit the cancle button on the alert window
	       alert.accept(); 
		    
	        
	        
	        
	}
	
}