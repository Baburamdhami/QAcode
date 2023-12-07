
package selenium.classwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignUp {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        driver.findElement(By.linkText("Create new account")).click();

         //input[@id='u_b_b_CU']
        WebElement firstNameField = driver.findElement(By.name("firstname"));
        firstNameField.sendKeys("Baburam");

        Thread.sleep(5000);
        WebElement lastNameField = driver.findElement(By.name("lastname"));
        lastNameField.sendKeys("Dhami");

        WebElement emailField = driver.findElement(By.name("reg_email__"));
        emailField.sendKeys("babu.dhami@example.com");

        WebElement confirmEmailField = driver.findElement(By.name("reg_email_confirmation__"));
        confirmEmailField.sendKeys("babu.dhami@example.com");

        WebElement passwordField = driver.findElement(By.name("reg_passwd__"));
        passwordField.sendKeys("Yotong444");

        WebElement birthDayField = driver.findElement(By.name("birthday_day"));
        birthDayField.sendKeys("11");

        WebElement birthMonthField = driver.findElement(By.name("birthday_month"));
        birthMonthField.sendKeys("Jun");

        WebElement birthYearField = driver.findElement(By.name("birthday_year"));
        birthYearField.sendKeys("1999");

        WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']"));
        maleRadioButton.click();

        WebElement signUpButton = driver.findElement(By.name("websubmit"));
        signUpButton.click();
        
        Thread.sleep(5000);
      

        //driver.quit();
		
	}

}
