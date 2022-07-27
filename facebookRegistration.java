package week2day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class facebookRegistration {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver fb = new ChromeDriver();
		fb.get("https://en-gb.facebook.com/");
				
				 fb.manage().window().maximize();
				fb.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				fb.findElement(By.linkText("//a[contains(text(),\"Create New Account\")]")).click();
				fb.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("vimal");
				fb.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("lamiv28");
				fb.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("lamiv1996@gmail.com");
				fb.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("Msdhoni123");
				
				WebElement date = fb.findElement(By.xpath("//select[@id=\"day\"]"));
				Select selectdate =new Select(date);
				selectdate.selectByValue("28");
				
				WebElement month = fb.findElement(By.xpath("//select[@id=\"month\"]"));
				Select selectmonth =new Select(month);
				selectmonth.selectByValue("10");
				
				WebElement year = fb.findElement(By.xpath("//select[@id=\"year\"]"));
				Select selectyear=new Select(year);
				selectyear.selectByValue("1996");
				
				WebElement gender = fb.findElement(By.xpath("//label[text()=\"Male\"]"));
				gender.click();
				
				WebElement submit = fb.findElement(By.xpath("//button[@name=\"websubmit\"]"));
				submit.click();
				
				 
}
	
}
