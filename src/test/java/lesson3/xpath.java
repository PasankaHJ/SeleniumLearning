package lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		//xpath with single attribute
		//driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Laptop");
		
		//xpath with multiple attributes
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Laptop");
		
		//xpath with 'and', 'or' operators
		//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("Laptop");
		//driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("Laptop");
		
		//xpath with inner text - text()
		//driver.findElement(By.xpath("//a[text()='Desktops']")).click();
		
		//xpath with text()
		//driver.findElement(By.xpath("//*[text()='Desktops']")).click();
		
		//boolean text_innterText = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		//System.out.println(text_innterText);
		
		//String text_innterText = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		//System.out.println(text_innterText);
		
		//xpath with contains
		//driver.findElement(By.xpath("//input[contains(@placeholder, 'Sea')]")).sendKeys("tab");
		
		//xpath with starts-with()
		//driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Sea')]")).sendKeys("lap");
		
		//chained xpath
		boolean image_display = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(image_display);

	}

}