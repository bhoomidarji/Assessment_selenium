import java.awt.AlphaComposite;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

public class Que_1_Write_script_to_fill_this_form_using_selenium_webdriver
{
	public static void main(String[] args, File TakesScreenshot) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\N B DARJI\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		
		Actions actions=new Actions(driver);
		Action a1=actions.keyDown(Keys.CONTROL).sendKeys(Keys.PAGE_DOWN)
						 .keyUp(Keys.CONTROL).sendKeys(Keys.PAGE_DOWN)
					    .build(); 
		a1.perform(); 
		Thread.sleep(2000);
		
			  
		Action a2=actions.moveToElement(driver.findElement(By.id("firstName"))).build();
	    a2.perform();  
		driver.findElement(By.id("firstName")).sendKeys("bhumi");
		Thread.sleep(1000);
	    driver.findElement(By.id("lastName")).sendKeys("darji");
	    Thread.sleep(1000);
	    driver.findElement(By.id("userEmail")).sendKeys("bnd.24@gmail.com");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
	    Thread.sleep(1000);
	    
		Action a3=actions.moveToElement(driver.findElement(By.id("userNumber"))).build();
	    a3.perform();
	    driver.findElement(By.id("userNumber")).sendKeys("1234567892");
	    Thread.sleep(1000);
	    
	    
	    
	    driver.findElement(By.id("dateOfBirthInput")).click();
	    Thread.sleep(2000);
	    Select s1=new Select(driver.findElement(By.cssSelector("select.react-datepicker__month-select")));
	    s1.selectByValue("7");
	    Thread.sleep(1000);
	    Select s2=new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")));
	    s2.selectByValue("2012");
	    Thread.sleep(1000);
	    Action a4=actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[4]"))).build();
	    a4.perform();  
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[4]")).click();
		Thread.sleep(2000);
	   
	    driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
	    Thread.sleep(1000);
        driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
        Thread.sleep(1000);
       
        driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\N B DARJI\\Pictures\\ebay defects\\capture.PNG");  
	    Thread.sleep(2000);
	  
       
        driver.findElement(By.id("currentAddress")).sendKeys("delhi,india");
        Thread.sleep(2000);
       
        Action a5=actions.keyDown(Keys.CONTROL).sendKeys(Keys.PAGE_DOWN)
				 .keyUp(Keys.CONTROL).sendKeys(Keys.PAGE_DOWN)
			    .build(); 
        a5.perform(); 
        Thread.sleep(2000);
       
        driver.findElement(By.id("state")).click();
        Thread.sleep(2000); 
        driver.findElement(By.xpath("//div[text()='NCR']")).click();
		

        driver.findElement(By.id("city")).click();
        Thread.sleep(1000); 
        driver.findElement(By.xpath("//div[text()='Delhi']")).click();
		
	  
	    driver.findElement(By.id("submit")).click();
	    Thread.sleep(4000);
	    
	    System.out.println("successfully submitted");
	   
	    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest=new File("C:\\Users\\N B DARJI\\Pictures\\Screenshots\\11.png");
	    FileUtils.copyFile(src, dest);
	    
	    driver.close();
	 	
	}
}

