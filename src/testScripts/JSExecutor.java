package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {

	public static void main(String[] args) {
		System.out.println("Execution Started");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		//jS executor
		JavascriptExecutor	js = (JavascriptExecutor)driver;
		String PageTitle = js.executeScript("return document.title").toString();
		System.out.println("Page Title is "+ PageTitle);
		
		//First name Details
//		driver.findElement(By.id("fname")).sendKeys("TrainingUser");
		WebElement textBox = (WebElement)js.executeScript("return document.getElementsByName('firstName')[0]");
		textBox.sendKeys("TrainingUser");
		
		//Gender Selectorr
		WebElement gender = driver.findElement(By.id("male"));
		gender.click();
		
//		js.executeScript("window.scrollBY(200,700)");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.linkText("This is a link")).click();
		js.executeScript("history.go(-1)");
		
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		js.executeScript("document.querySelector('#datepicker1').value='28/7/2020'");
		
		
		driver.close();
		driver.quit();
		System.out.println("Execution Ended");

	}

}
