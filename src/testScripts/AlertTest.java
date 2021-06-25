package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Execution Started");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text is "+ alert.getText());
		alert.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		Thread.sleep(2000);
		Alert dismiss = driver.switchTo().alert();
		System.out.println("Confirm Message is "+ dismiss.getText());
		dismiss.dismiss();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Prompt Box')]")).click();
		Thread.sleep(2000);
		Alert prompt = driver.switchTo().alert();
		System.out.println("Prompt Text is "+ prompt.getText());

		prompt.sendKeys("Verify Hello");
		Thread.sleep(2000);
		prompt.accept();
		
		
//		driver.close();
//		driver.quit();
		System.out.println("Execution Ended");

	}

}
