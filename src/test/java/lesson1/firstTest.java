package lesson1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class firstTest {
	
	/*
	1. Launch browser (chrome)
	2. Open URL : https://demo.opencart.com/
	3. Validate title : "Your Store"
	4. Close browser
	*/

	public static void main(String[] args) {
		
		// 1. Launch browser (chrome)
		
		WebDriver driver = new ChromeDriver();
		
		// 2. Open URL : https://demo.opencart.com/
		
		driver.get("https://demo.opencart.com/");
		
		// 3. Validate title : "Your Store"
		
		String act_title = driver.getTitle();
		if(act_title.equals("Your Store"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		// 4. Close browser
		
		driver.close();
	}

}
