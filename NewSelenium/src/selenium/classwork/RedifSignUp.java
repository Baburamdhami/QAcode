
//This program open the rediff.com website and sign up for the new user
//This is a package name
package selenium.classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedifSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
	    WebDriver browserObj = new ChromeDriver();
	    
	    browserObj.manage().window().maximize();
	    
	    browserObj.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    
	    //browserObj.findElement(By.xpath("//*[@id=\"signin_info\"]/a[2]")).click();
	    
	    browserObj.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[2]/div/a/u")).click();
	    
	    //Thread.sleep(3000);
	    
	   // browserObj.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	    
	    browserObj.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Babu Dhami");
	    browserObj.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("Babu123555");
	    
	    browserObj.findElement(By.name("btnchkavail95424ec4")).click(); 
	    
	}

}
