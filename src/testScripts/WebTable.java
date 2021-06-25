package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		

		System.out.println("Execution Started");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("file:///Users/balajikumar/Desktop/WebTable.html");
		
		driver.findElement(By.xpath("//td[contains(text(),'Keyboard')]//preceding-sibling::td//input[@type='checkbox']")).click();
		
		driver.close();
		driver.quit();
		System.out.println("Execution Ended");

	}

}
