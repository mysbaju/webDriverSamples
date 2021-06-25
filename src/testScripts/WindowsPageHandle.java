package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsPageHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Execution Started");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.stqatools.com/demo/Windows.php");
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window "+parentWindow);
		driver.findElement(By.xpath("//button[contains(text(),'new Tab')]")).click();
		Thread.sleep(5000);
		driver.switchTo().window(parentWindow);
		Set<String> tabs = driver.getWindowHandles();
		System.out.println("Number of windows is "+ tabs.size());
		for(String childWin:tabs) {
			System.out.println(childWin);
			if(!childWin.equalsIgnoreCase(parentWindow)) {
				driver.switchTo().window(childWin);
				driver.findElement(By.xpath("//span[contains(text(),'Java')]")).click();
				Thread.sleep(5000);
			}
		}
//		Closing Child
		driver.close();
		
		driver.switchTo().window(parentWindow);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'new Window')]")).click();
		Set<String> wins = driver.getWindowHandles();
		for(String childWin:wins) {
			System.out.println(childWin);
			if(!childWin.equalsIgnoreCase(parentWindow)) {
				driver.switchTo().window(childWin);
				driver.findElement(By.xpath("//button[contains(text(),'Message Window')]")).click();
				Thread.sleep(5000);
			}
		}
		
		//try interacting with 3rd Window
		driver.close();
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Execution Ended");

	}

}
