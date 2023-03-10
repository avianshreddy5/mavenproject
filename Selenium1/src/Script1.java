import org.openqa.selenium.chrome.ChromeDriver;

//was to launch chromebrowser and maximize the chrome browser
public class Script1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		
		
	}

}
