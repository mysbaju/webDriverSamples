package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTest {
	
	public static void main(String[] args) {
		
		System.out.println("Execution Started");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		//First name Details
		driver.findElement(By.id("fname")).sendKeys("TrainingUser");
//		driver.findElement(By.cssSelector("#fname")).sendKeys("TrainingUser");
//		driver.findElement(By.cssSelector("input#fname")).sendKeys("TrainingUser");
//		driver.findElement(By.cssSelector("input[id=fname]")).sendKeys("TrainingUser");
//		driver.findElement(By.cssSelector("input[name=firstName]")).sendKeys("TrainingUser");
		driver.findElement(By.id("idOfButton")).click();
		
		
		//Gender Selectorr
		WebElement gender = driver.findElement(By.id("male"));
		gender.click();
		System.out.println("Is Gender Selected : "+ gender.isSelected());
//		driver.findElement(By.className("Automation")).click();
		driver.findElement(By.cssSelector(".Automation")).click();
		
		//using WebElements
		List<WebElement> items = driver.findElements(By.tagName("input"));
		System.out.println("Total Input Elements count is "+ items.size());
		for(WebElement item:items) {
			System.out.println("Attribute Name is "+ item.getAttribute("name"));
		}
		
		//Link details
		WebElement linkToClick = driver.findElement(By.linkText("This is a link")); 
		WebElement partialLink = driver.findElement(By.partialLinkText("This is"));
		
		System.out.println("Link Text : " + partialLink.getText());
		linkToClick.click();
		
		driver.close();
		driver.quit();
		System.out.println("Execution Ended");

	}

}
