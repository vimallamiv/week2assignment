package week2day2;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

	
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// selectByIndex()
		WebElement DD1 =driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select index = new Select(DD1);
		index.selectByIndex(4);

		// selectByVisibleText
		WebElement DD2 =driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select text = new Select(DD2);
		text.selectByVisibleText("Appium");
		// select By Value.
		WebElement DD3 = driver.findElement(By.xpath("//select[@id='dropdown3']"));
		Select value = new Select(DD3);
		value.selectByValue("3");
		
		
					

}
}