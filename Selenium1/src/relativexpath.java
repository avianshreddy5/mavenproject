import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativexpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// go to kodnest.com
		driver.get("http://127.0.0.1:55604/relativexpath.HTML");
		// locating the xpath using relative xpath
		driver.findElement(By.xpath("//a[@target=\"blank\"]")).click();
	}
}
