package Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownOrder {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		List<String> actualList=new ArrayList<String>();
		
		Select country=new Select(driver.findElement(By.xpath("//div[@class='information closable']/following::p//select")));
		 List<WebElement> countrylist=country.getOptions();
		 for(WebElement ele:countrylist) {
			 actualList.add(ele.getText());
			 		 
		 }
		 
		 List<String> temp=new ArrayList<String>();
		 
		 temp.addAll(actualList);
		 
		 Collections.sort(temp);
		 System.out.println(actualList);
		 System.out.println(temp);
			
		 Assert.assertTrue(actualList.equals(temp));
		 
	}

}
