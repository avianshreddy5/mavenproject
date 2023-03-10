import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automatingthescrollbar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// go to kodnest.com
		driver.get("https://www.zomato.com");
		// creating reference to JavascriptExecutor interface
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// excuting the script for automating the scrollbar from 0px to 2000px
		js.executeScript("window.scroll(0,1000)");

	}

}
