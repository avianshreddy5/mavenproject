import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takingsreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// go to kodnest.com
		driver.get("https://www.fb.com");
		// take the sreenshot using takesscreenshot interface
		File s = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// create a copy of screenshot
		FileHandler.copy(s, new File("./fb.png"));
		// close
		driver.close();
	}

}
