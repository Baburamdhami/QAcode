

package SeleniumProgram_Part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		// 2. Initialize Webdriver object through ChromeDriver class.
       		 WebDriver browserObject = new ChromeDriver();
		// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	        
	        browserObject.findElement(By.xpath("//input[@value ='female']")).click();
	        
	        Thread.sleep(5000);
	        
	        browserObject.findElement(By.xpath("/html/body/form/input[5]")).click();
	        
	        Thread.sleep(5000);
	        
	        browserObject.findElement(By.xpath("//*[@id=\"other\"]")).click();
	        
	        browserObject.findElement(By.name("submit")).click();
	}

}