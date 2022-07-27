package week2day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class edit {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver leaf = new ChromeDriver();

		leaf.get("http://leafground.com/pages/Edit.html");
		leaf.manage().window().maximize();
		leaf.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Enter your email address
		leaf.findElement(By.id("email")).sendKeys("lamiv1996@gmail.com");
		// Append a text and press keyboard tab
		//default value
		String txt = leaf.findElement(By.name("username")).getAttribute("value");
		System.out.println("Default text : " + txt);

         //confirm whether edit field is disabled
		System.out.println(
				leaf.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input")).isEnabled());
         //// Clear the text
		leaf.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).clear();
	}
}
