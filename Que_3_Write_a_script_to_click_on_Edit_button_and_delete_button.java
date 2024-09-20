import java.sql.Driver;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.google.common.base.Function;

public class Que_3_Write_a_script_to_click_on_Edit_button_and_delete_button
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\N B DARJI\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		Thread.sleep(2000);
		
		Actions actions=new Actions(driver);
		Action a1=actions.keyDown(Keys.CONTROL).sendKeys(Keys.PAGE_DOWN)
						 .keyUp(Keys.CONTROL).sendKeys(Keys.PAGE_DOWN)
					    .build(); 
			   a1.perform(); 
			  Thread.sleep(3000);
			  
		Action a2=actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div"))).build();
	    a2.perform();
			  
		driver.findElement(By.id("edit-record-2")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("delete-record-2")).click();
		Thread.sleep(3000);
				
		driver.close();
	}
}
