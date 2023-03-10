import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sript9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// my webpage
		driver.get("http://127.0.0.1:57522/parent.html");

		// locating on link and clicking
		WebElement link = driver.findElement(By.linkText("apply for job"));
		link.click();
		// window handling
		String parent = driver.getWindowHandle();
		System.out.println("parent window" + parent);
		// window handling
		Set<String> win = driver.getWindowHandles();

		for (String i : win) {
			System.out.println(i);
		}
		//switch to parent window
		driver.switchTo().window(parent);
		link.click();

	}

}
