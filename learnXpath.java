package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class learnXpath {
	public static void main(String[] args) {
		
		//setup the driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		//max window
		driver.manage().window().maximize();
		//wait time out
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter the user name 
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class=\"decorativeSubmit\"]")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"CRM/SFA\")]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()=\"Create Lead\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_companyName\"]")).sendKeys("testleaf");
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstName\"]")).sendKeys("vimal");
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_lastName\"]")).sendKeys("nathan");
		WebElement market = driver.findElement(By.xpath("//select[@id=\"createLeadForm_marketingCampaignId\"]"));
		Select drop2=new Select(market);
		drop2.selectByIndex(3);
		String title1=driver.getTitle();
		System.out.println(title1);
		
		driver.findElement(By.xpath("//input[@name=\"submitButton\"]")).click();
		
		String title2=driver.getTitle();
		System.out.println(title2);
		
		if(title1.equals(title2));{
		System.out.println("title is same");
		}
		
		} 
			
		
			
		
		
		}
		
	



