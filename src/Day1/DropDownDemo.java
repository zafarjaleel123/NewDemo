package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumautomationpractice.blogspot.com/2021/06/automation-sample-1-abhresh.html");
		

			WebElement countryDropDown=driver.findElement(By.cssSelector("#ts_country"));
			Select selectCoutry=new Select(countryDropDown);
			System.out.println(selectCoutry.getFirstSelectedOption().getText());
			System.out.println("Select By Value");
			selectCoutry.selectByValue("2");
			Thread.sleep(5000);
			System.out.println(selectCoutry.getFirstSelectedOption().getText());
			System.out.println("Select By Index");
			selectCoutry.selectByIndex(3);
			Thread.sleep(5000);
			System.out.println(selectCoutry.getFirstSelectedOption().getText());
			System.out.println("Select By visible text");
			selectCoutry.selectByVisibleText("America");
			Thread.sleep(5000);
			System.out.println(selectCoutry.getFirstSelectedOption().getText());
			List<WebElement> country_list=selectCoutry.getOptions();
			
			for (WebElement ele:country_list) {
				
				System.out.println(ele.getText());
			}
		
		Assert.assertEquals(country_list.size(), 4);
	}

}
