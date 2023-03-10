import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// go to kodnest.com
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("kodnest");
		List<WebElement> d = driver.findElements(By.xpath("//li[@role='presentation']"));
		for (WebElement i : d) {
			System.out.println(i.getText());
		}
	}

}
