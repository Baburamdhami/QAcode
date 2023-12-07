
package selenium.classwork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert47Brand {

	public static void main(String[] args) throws InterruptedException  {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	
	    WebDriver browserObj = new ChromeDriver();
	    
	    
	    browserObj.get("https://www.47brand.com/");
	    
	    //Thread.sleep(9000);
	    
	    browserObj.manage().window().maximize();
	    
	    browserObj.findElement(By.xpath("//*[@id=\"main_nav_login_trigger\"]/span")).click();
	    
	    browserObj.findElement(By.name("customer[email]")).sendKeys("baburamdhami@yahoo.com");
	    
	    browserObj.findElement(By.name("customer[password]")).sendKeys("Bindu@1987");
	    
	    browserObj.findElement(By.className("right__drawer__form__button")).click();
	   
	    Alert alert = browserObj.switchTo().alert();  
	    
	    System.out.println(alert.getText());
	    
	    Thread.sleep(6000);
	    
	    
	    
	    //browserObj.findElement(By.xpath("//*[@id=\"input0label\"]")).sendKeys("baburam@yahoo.com");
	    //browserObj.findElement(By.xpath("//*[@id=\"ctabutton1header1\"]")).click();
	   
	   
	   //alert.dismiss();
	   
        
	     // browserObj.findElement(By.xpath("//*[@id=\"Embed\"]/div/div/button/span[2]")).click();
	   
         //browserObj.findElement(By.xpath("//*[@id=\"dismissbutton2header1\"]")).click();
	
	}

}
