import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script10 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// go to kodnest.com
		driver.get("https://www.facebook.com");
		WebElement create = driver.findElement(By.linkText("Create new account"));
		create.click();
		Thread.sleep(3000);
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("avianshreddy");
		WebElement pwd = driver.findElement(By.cssSelector("input#password_step_input"));
		pwd.sendKeys("avinash@123");
		Thread.sleep(3000);

		WebElement fmale = driver.findElement(By.cssSelector("input[value='2']"));
		fmale.click();

	}

}
