import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadingfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// go to kodnest.com
		driver.get("https://www.google.co.in/imghp?hl=en&ogbl");
		//locating on image icon and clicking
		driver.findElement(By.className("Gdd5U")).click();
		//locating on upload file
		driver.findElement(By.className("DV7the")).click();


	}

}
