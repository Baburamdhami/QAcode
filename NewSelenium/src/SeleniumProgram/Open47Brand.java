

package SeleniumProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open47Brand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject = new ChromeDriver();
		
		browserObject.get ("https://www.47brand.com/");
		
		
		browserObject.close();
	}

}
