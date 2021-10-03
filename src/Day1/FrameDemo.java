package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameDemo {

	@Test
	public void singleFrame() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		//driver.findElement(By.xpath("//iframe[@id='singleframe']"))
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		
		driver.switchTo().frame("singleframe");
		
		driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']/input")).sendKeys("Zafar");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().defaultContent();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.quit();
	}
	
}
