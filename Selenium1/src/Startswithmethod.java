import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Startswithmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// go to kodnest.com
		driver.get("http://127.0.0.1:55604/relativexpath.HTML");
		// driver.findElement(By.linkText("Create new account")).click();
		// locating the xpath using relative xpath
		WebElement d = driver.findElement(By.xpath("//li[stars-with(@value,'th')]"));
		d.click();

	}

}
