package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		

		System.out.println("Execution Started");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("file:///Users/balajikumar/Desktop/Index.html");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("WelcomeUser");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
//		driver.findElement(By.xpath("//input[@name='continue' or @type='button']")).click();
		
//		driver.findElement(By.xpath("//input[@name='continue' and @type='button']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(), 'Submit')]")).click();
		
		driver.findElement(By.xpath("//a[starts-with(@name,'Google')]")).click();
		
				
		
//		driver.close();
//		driver.quit();
		System.out.println("Execution Ended");

	}
}