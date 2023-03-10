import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// go to kodnest.com
		driver.get("https://www.facebook.com");
		WebElement create = driver.findElement(By.linkText("Create new account"));
		create.click();
		Thread.sleep(3000);

		WebElement create1 = driver.findElement(By.cssSelector("input#password_step_input[autocomplete='new-password']"));
		create1.sendKeys("aviansh");
	}

}
