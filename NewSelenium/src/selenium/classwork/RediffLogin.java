

//This program will open rediff.com and enter login credentials
//This is the name of the package 
package selenium.classwork;

//This code import 'by' 'WebElement', and 'chromedriver' class 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//This is the name of the class/program
public class RediffLogin {
    
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
	    
	        //It will find login box using locator and type the login charachers
	        browserObject.findElement(By.name("login")).sendKeys("Dhunkia");
		 
	        //It will find password box using locator and type the password charachers
	        browserObject.findElement(By.name("passwd")).sendKeys("Ccc12354");
	        
	        //Wait time is 2 second 
	        Thread.sleep(2000);
		 
	        //It will locate 'Keep me signed in' checkbox element using by.name locator
	        WebElement CheckBox = browserObject.findElement(By.name("remember"));
	        
	        //Click the checkbox
	        CheckBox.click();
	        
	        //It will find 'sign in' button ans click
		    browserObject.findElement(By.name("proceed")).click();
		    
		   //Wait time is 3 second 
	        Thread.sleep(3000);
		    
		    //It will find 'Forgot Password?' link using 'Xpath' locator 
		    WebElement ForgotPW = browserObject.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[3]/div[2]/span/a/u"));
		    
		    //It will click the link
		    ForgotPW.click();
		    
		   // Close the web browser.
		  //  browserObject.close();
	}

}
