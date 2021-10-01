package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.demoqa.com/radio-button");
	System.out.println(driver.findElement(By.id("yesRadio")).isSelected());
	Thread.sleep(5000);
	JavascriptExecutor execute=(JavascriptExecutor)driver;
	execute.executeScript("arguments[0].click();",driver.findElement(By.cssSelector("#yesRadio")));	
	System.out.println(driver.findElement(By.id("yesRadio")).isEnabled());
	
	List<WebElement> radio=driver.findElements(By.xpath("//input[@type=\"radio\"]/following::label"));
	for(WebElement ele:radio) {
		 String value=ele.getText();
		 System.out.println(value);
	}
	
	
	}

}
