import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que_4_Task_1_Verify_That_Test_Pass_or_fail 
{
	public static void main(String[] args, File TakesScreenshot) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\N B DARJI\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("uid")).sendKeys("mngr590902");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("sarEqaq");
		Thread.sleep(2000);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
		
		if(!driver.getCurrentUrl().equals("http://www.demo.guru99.com/V4/"))
		{
			System.out.println("testcase passed");
		}
		else
		{
			System.out.println("testcase failed");
		}
		
		driver.close();
		
	}
}
