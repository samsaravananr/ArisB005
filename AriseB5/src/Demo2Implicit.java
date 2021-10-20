import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2Implicit {

	public static void main(String[] args) throws InterruptedException 
	{
	
			System.setProperty("webdriver.edge.driver", "C:\\Users\\SARAVANAN R\\Desktop\\AriseGlobalB5\\msedgedriver.exe");
			WebDriver myD=new EdgeDriver();
			myD.manage().window().maximize();
			myD.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			myD.get("https://www.amazon.in");
			System.out.println(myD.getTitle());
				
			myD.findElement(By.linkText("Mobiles")).click();
			
			myD.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[3]/span[1]/divvvvvvv")).click();
			myD.close();
			
			
			
					

	
	}

}





