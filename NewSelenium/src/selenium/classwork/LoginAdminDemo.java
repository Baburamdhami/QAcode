
package selenium.classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAdminDemo {

	public static void main(String[] args) throws InterruptedException {
	
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul/li[5]/a/i")).click();
        driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul/li[5]/ul/li/form/div/button/span")).click();
        
        Thread.sleep(3000);
        
        driver.findElement(By.cssSelector("body > div.wrapper > div.content-wrapper > div.alert.alert-danger.alert-dismissable > button")).click();
        
       /* Alert alert =driver.switchTo().alert();
        alert.dismiss(); */
        
       Thread.sleep(6000);
	       
       driver.close();
	}

}
