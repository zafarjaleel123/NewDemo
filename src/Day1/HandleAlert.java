package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://ksrtc.in/oprs-web/");
		
		
		JavascriptExecutor scriptExecutor=(JavascriptExecutor)driver;
		scriptExecutor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']")));
		
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

	}

}
