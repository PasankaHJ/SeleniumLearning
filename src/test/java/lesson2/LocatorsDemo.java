package lesson2;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		//Open chrome browser
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("https://demo.opencart.com/");

		//Maximize browser window
		driver.manage().window().maximize();
		
		//name locator
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id locator
		//boolean logoDisplayStatus = driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logoDisplayStatus);
		
		//LinkText
		//driver.findElement(By.linkText("Tablets")).click();
		
		//PartialLinkText = No need to pass complete text. Can pass a portion of linkText.
		//driver.findElement(By.partialLinkText("blets")).click();
		
		//className : Capture how many links in the header
		//List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
		//System.out.println("Total number of header links : "+headerLinks.size());
		
		//tagName : How many # links present in the web page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total # links : "+links.size());
		
	}

}
