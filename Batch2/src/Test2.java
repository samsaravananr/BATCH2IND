import java.io.File;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

	public static void main(String[] args) throws Exception 
	{
		
		
		
		Scanner sc=new Scanner(System.in);
		String vBrowser=sc.nextLine();
		System.out.println(vBrowser);
		
	
		if(vBrowser.equalsIgnoreCase("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Customized FT\\B2\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		takeSnapShot(driver, "D://sam.png");
		String vTitle=driver.getTitle();
		driver.close();
		}
		else if (vBrowser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Customized FT\\B2\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");
			takeSnapShot(driver, "D://sam.png");
			String vTitle=driver.getTitle();
			driver.close();
			
		}
		else
		{
			System.out.println("INVALID Browser");
		}
		
		
		
	}
	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }
	
	

}
