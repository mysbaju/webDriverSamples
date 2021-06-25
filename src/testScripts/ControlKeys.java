package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ControlKeys {

	public static void main(String[] args) throws InterruptedException {
	
		System.out.println("Execution Started");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.opencart.com/");
		
		
		WebElement searchBox = driver.findElement(By.name("search"));
		searchBox.sendKeys(Keys.chord(Keys.SHIFT + "p"));
		searchBox.sendKeys(Keys.chord("hone"));
		searchBox.sendKeys(Keys.ENTER);	
		
		searchBox = driver.findElement(By.name("search"));
		searchBox.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(10000);
		searchBox.sendKeys(Keys.PAGE_UP);
		Thread.sleep(10000);
		searchBox.sendKeys(Keys.BACK_SPACE);
		
//		driver.close();
//		driver.quit();
		System.out.println("Execution Ended");

	}

}
