import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zomato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		WebElement mn = driver.findElement(By.cssSelector("input.sc-1yzxt5f-9"));
		mn.sendKeys("avinash@gamil.com");

	}

}
