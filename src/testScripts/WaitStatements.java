package testScripts;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitStatements {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.out.println("Execution Started");
		WebDriver driver = new ChromeDriver();
		
//		Implicit Wait
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		
		
		driver.manage().window().maximize();
		driver.navigate() .to("https://google.com");
		System.out.println("Page Title before search "+driver.getTitle());
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Java Tutorial");
		//Explicit Wait
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@role='listbox']"))));
		
		//Flu Wait
		
//		Wait<WebDriver> fluwait = new FluentWait<WebDriver>(driver);
////						.withTimeout(60, TimeUnit.SECONDS)
////						.pollingEvery(5,TimeUnit.SECONDS)
////						.ignoring(NoSuchElementException.class);
		
//		fluwait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@role='listbox']"))));
//					
//		List<WebElement> items = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
//		System.out.println("List Size is "+ items.size());
		
		
		//Screenshot
		searchBox.submit();
		TakesScreenshot screen = (TakesScreenshot)driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/Users/balajikumar/Desktop/Selenium_E2/Screenshot/screenShot1.png"));
		
		driver.close();
		driver.quit();
		System.out.println("Execution Ended");
	
	}
}
