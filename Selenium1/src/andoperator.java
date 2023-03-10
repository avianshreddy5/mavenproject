import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class andoperator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// input[@type='radio'and @value='1']
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// go to kodnest.com
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='radio'and @value='1']\r\n" + "")).click();
	}

}
