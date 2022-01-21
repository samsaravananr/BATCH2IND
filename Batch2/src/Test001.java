import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test001 {

	public static void main(String[] args) throws InterruptedException 
	{
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Customized FT\\B2\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String vTitle=driver.getTitle();
		//System.out.println("Title is "+vTitle);
		
		if(vTitle.contains("Facebook"))
		{
			System.out.println("PASS: Title Verification");
		}
		else
		{
			System.out.println("FAIL: Title Verification");
		}
		
		driver.findElement(By.id("email")).sendKeys("samsaravananr");
		driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		
		String vError=driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]")).getText();
		System.out.println("Error Message is ------> "+vError);

		driver.close();
		
	}

}
