package testScripts;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GooglePageTest {

	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver","\\Users\\balajikumar\\Desktop\\Selenium_E2\\chromedriver");
		System.out.println("Execution Started");
		WebDriver driver = new ChromeDriver();
//		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		driver.get("https://google.com");
		driver.navigate() .to("https://google.com");
		System.out.println("Page Title before search "+driver.getTitle());
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Java Tutorial");
		
//		Thread.sleep(1000);
		List<WebElement> items = driver.findElements(By.xpath("//ul[@role='listbox']/li//descendant::div[@class='pcTkSc']"));
		
//		"java tutorial pdf"
		
		for(int counter = 0; counter<items.size();counter++) {
			System.out.println("Item Number "+ counter + " is "+ items.get(counter).getText());
			if(items.get(counter).getText().equalsIgnoreCase("java tutorial pdf")) {
				items.get(counter).click();
				System.out.println("Item Clicked");
				break;
			}
				
		}
		
		
//		searchBox.submit();
//		System.out.println("Page Title after search "+driver.getTitle());
//		driver.navigate().back();
//		System.out.println("Page Title after back Button "+driver.getTitle());
//		driver.navigate().forward();
//		System.out.println("Current Page URL is  "+driver.getCurrentUrl());
		driver.close();
		driver.quit();
		System.out.println("Execution Ended");
	}

}
