package Homepage_Test;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import prop.Config;

public class Test_Case1_login {

	 WebDriver driver;
	 Config setup;
	 
	@BeforeTest
	public void Setup() throws IOException{
		driver = Config.Setup();
	}
	@Test
	public void Login(){
		System.out.println("Entering login");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr93283");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("AgasYsU");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		
	}
	
}
