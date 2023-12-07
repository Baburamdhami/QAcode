
package selenium.classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Use chrome driver and provide its location 
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
						
		// 2. Create browserObject so you can use all the methods of this WebDriver class
		ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
		browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		//Select class is used in case of Dropdown. Select class object countrySelect specifies the webElement location.
		Select countrySelect = new Select(browserObject.findElement(By.name("country")));
					        
	    countrySelect.selectByVisibleText("France");
		}
	}

