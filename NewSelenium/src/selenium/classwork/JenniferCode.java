package selenium.classwork;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By; //importing selenium By class
import org.openqa.selenium.chrome.ChromeDriver; //Importing ChromeDriver class

public class JenniferCode { //name of this program is Selenium_mail_rediff
	
	//code execution start after main method 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
// using chrome webdriver and specifying location of chromedriver on my machine 
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		
		// creating broweserObject. This object is generated from chromedriver class. 
		// I am creating the object so that I can apply the Method.
	        ChromeDriver browserObject = new ChromeDriver();
	        
		// 3. Open the http://www.mail.rediff.com/ link using get method.
	        browserObject.get("https://mail.rediff.com/cgi-bin/login.cgi");
	        
	     
	        // it will locate the webelement on the page who's name is Proceed and then click it.
			   browserObject.findElement(By.name("proceed")).click();
			    
	        
	        // switch to alert box
	        Alert alert = browserObject.switchTo().alert();
	        
	     // getText method is used to get the text from alert box 
	        alert.getText();
	        
	        //Thread.sleep is used to hold the part of code for given time limit. 
	        Thread.sleep(3000);
			
		    
		   // . Close the web browser.
			browserObject.close();
			
	}
}