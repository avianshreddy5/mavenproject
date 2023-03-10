import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// go to kodnest.com
		// driver.get("http://127.0.0.1:62763/xpath.html");
		driver.get("http:www.instagram.com");

		// driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[1]/a")).click();
		driver.findElement(By.xpath(
				"//*[@id=\"mount_0_0_M8\"]/div/div/div/div[1]/div/div/div/div[1]/div[1]/div[2]/section/main/div/header/divs"))
				.click();

	}

}
