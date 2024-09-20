import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que_2_Techlist_Task_2 
{
	public static void main(String[] args) throws InterruptedException  
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\N B DARJI\\Downloads\\chromedriver-win32\\chromedriver.exe");
        ChromeDriver Driver = new ChromeDriver();
        Driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        Thread.sleep(2000);
         
		List<WebElement> th=Driver.findElements(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/thead/tr/th"));
		System.out.println("total columns are "+th.size());

        List<WebElement> tr=Driver.findElements(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table//tr"));
        System.out.println("total rows size is "+tr.size());
        
  
         List<WebElement> lastRowColumns=Driver.findElements(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/tfoot/tr/*"));
         if (lastRowColumns.size()== 2) 
	        {
	            System.out.println("The last row has 2 columns");
	        } 
	        else
	        {
	            System.out.println("Expected 2 columns,but found " +lastRowColumns.size()+ " columns");
	        }
        Driver.close();
}}
