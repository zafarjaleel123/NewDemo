package Day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.cssSelector("#menu1")).click();
		
		List<WebElement> dropdown_list=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));		
		for(WebElement ele:dropdown_list) {			
			String name_list=ele.getText();	
			
			if(name_list.contentEquals("JavaScript")) {
				ele.click();
				break;
			}
			System.out.println("value on the dropdown list"+name_list);
		}
		//driver.quit();

	}

}
