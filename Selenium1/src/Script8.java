import org.openqa.selenium.chrome.ChromeDriver;

public class Script8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// navigating fb page
		driver.navigate().to("https://www.facebook.com/");
		// navigating amazon page
		driver.navigate().to("https://www.amazon.com/");
//navigating back
		driver.navigate().back();
		Thread.sleep(2000);
		// naviagting forward
		driver.navigate().forward();
		// refreshing the window
		driver.navigate().refresh();

	}

}
