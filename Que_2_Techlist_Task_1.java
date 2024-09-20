import java.sql.Driver;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Que_2_Techlist_Task_1 
{
		public static void main(String[] args) throws InterruptedException  
		{
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\N B DARJI\\Downloads\\chromedriver-win32\\chromedriver.exe");
	        ChromeDriver Driver = new ChromeDriver();
	        Driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
	        Thread.sleep(2000);
	        
	       
			String th=Driver.findElement(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/thead/tr/th[1]")).getText();
			System.out.println("title name is "+ th);
		
			
	        List<WebElement> tr = Driver.findElements(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/tbody/tr"));
	        System.out.println("there are only "+tr.size()+" structure values present in the table");
	    	
	        Driver.close();
		}
}
		

