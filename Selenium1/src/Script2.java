import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// go to kodnest.com
		driver.get("https://www.kodnest.com");
		driver.getCurrentUrl();
	}

}
