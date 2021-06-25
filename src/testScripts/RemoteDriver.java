package testScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteDriver {

	public static void main(String[] args) throws MalformedURLException {
		
		System.out.println("Execution Started");
		
		ChromeOptions options = new ChromeOptions();
		options.setCapability(CapabilityType.PLATFORM_NAME, Platform.MAC);
		String strHub = "http://192.168.0.101:4444/wd/hub";
		
		WebDriver driver = new RemoteWebDriver(new URL(strHub),options);

		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate() .to("https://google.com");
	
		System.out.println("Page Title before search "+driver.getTitle());
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Java Tutorial");
		searchBox.submit();
		System.out.println("Page Title after search "+driver.getTitle());		
		
	
		driver.close();
		driver.quit();
		System.out.println("Execution Ended");

	}

}
