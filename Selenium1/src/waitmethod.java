import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// go to kodnest.com
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("Create new account")).click();
		// apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("fname")));
		driver.findElement(By.name("rstname")).sendKeys("ain");

	}

}
