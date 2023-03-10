import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zomato1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		//locate using css selectors
		WebElement mn = driver.findElement(By.cssSelector("circle.sc-djusq7-3[label=\"Phone\"]"));
		mn.click();
	}

}
