import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input[@type="text"]
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// go to kodnest.com
		driver.get("https://www.facebook.com/");
		// driver.findElement(By.linkText("Create new account")).click();
		// locating the xpath using relative xpath
		WebElement d = driver.findElement(By.xpath("//div[@id=\"passContainer\"]"));
		d.sendKeys("avinash");

	}

}
