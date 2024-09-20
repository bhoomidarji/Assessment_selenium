import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que_2_Techlist_Task_3
{
	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\N B DARJI\\Downloads\\chromedriver-win32\\chromedriver.exe");
     ChromeDriver Driver = new ChromeDriver();
     Driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
     Thread.sleep(2000);
     
     List<WebElement> rows = Driver.findElements(By.xpath("//*[@id='post-body-1325137018292710854']/div[1]/div[1]/div[5]/table/tbody/tr"));
	 
     int ptr = 0, max = 0;
	 for(int i=0;i<rows.size();i++)
	 {
		 List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
		 String heightStr = columns.get(2).getText();
		 int height = Integer.parseInt(heightStr.substring(0, heightStr.length() - 1));
		 if(height > max) {
			 max = height;
			 ptr = i;
		 }
	 }
	 WebElement headerElement = rows.get(ptr).findElement(By.tagName("th"));
	 String headName = headerElement.getText();
	 System.out.println("highest structure is " + headName + " with height " + max + "m.");
     Driver.close();
	}
}
