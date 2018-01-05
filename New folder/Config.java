package prop;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;


public class Config {
	
	  private static WebDriver driver;
	  
	public static WebDriver Setup() throws IOException{
		System.setProperty(BaseTest.getData("geckoDriver"), BaseTest.getData("firefox"));
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(BaseTest.getData("URL"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	
	}
	
	@AfterTest
	public void TearDown(){
		System.out.println("Performing tear down");
		driver.close();
		
		System.out.println("driver closed");
	}

}

