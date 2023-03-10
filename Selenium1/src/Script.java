import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// go to kodnest.com
		driver.get("https://www.facebook.com");
		WebElement create = driver.findElement(By.linkText("Create new account"));
		create.click();
		Thread.sleep(3000);
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("avianshreddy");

		WebElement sname = driver.findElement(By.name("lastname"));
		sname.sendKeys("govindanor");

		WebElement mn = driver.findElement(By.name("reg_email__"));
		mn.sendKeys("reddyavinash679@gmail.com");

		WebElement pwd = driver.findElement(By.name(" reg_passwd__"));
		pwd.sendKeys("Avinash@123");

		WebElement day = driver.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByIndex(21);
		
		WebElement month = driver.findElement(By.id("Month"));
		Select s1=new Select(month);
		

		

	}

}
