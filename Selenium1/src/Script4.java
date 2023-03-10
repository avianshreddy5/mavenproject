import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// go to kodnest.com
		driver.get("https://www.facebook.com");
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println("total number of links present in"+linklist.size());
		//display the total links present in the facebook
		for (WebElement i : linklist) {
			System.out.println(i.getText());
		}
	}

}
