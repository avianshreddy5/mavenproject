import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// go to kodnest.com
		driver.get("https://jqueryui.com/droppable/");
		// locating on iframe
		WebElement create = driver.findElement(By.className("demo-frame"));
		// switch to iframe
		driver.switchTo().frame(create);
		// locating on drag box
		WebElement drag = driver.findElement(By.id(" draggable"));
		// lacating on drop box
		
		WebElement drop = driver.findElement(By.id(" droppable"));
		// performing the drag and drop action
		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop).build().perform();

	}

}
