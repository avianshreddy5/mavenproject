import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// go to kodnest.com
		driver.get("https://www.google.com");
		//locatingonsearchbar
		WebElement search = driver.findElement(By.name("q"));
		//typeonsearchbar
		search.sendKeys("kodnest.com");
	}

}
