package jenkins3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummy3 {
	

	WebDriver driver=null;
	@Test
	
	public void test() 
	{
		/*System.out.println("hi");
		WebDriver driver=new ChromeDriver();
   driver.get("https://www.flipkart.com/");*/
   
   
   String BROWSER=System.getProperty("browser");
   String URL=System.getProperty("url");
	
	// driver;
	if(BROWSER.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver=new ChromeDriver();
	}
	
	else if(BROWSER.equalsIgnoreCase("edge"))
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
		//driver=new EdgeDriver();
	}
	
	else
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver=new ChromeDriver();
	}
	
	 driver.get(URL);  
}
}

