import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo2Actions {

	public static void main(String[] args) throws InterruptedException 
	{
	
			System.setProperty("webdriver.edge.driver", "C:\\Users\\SARAVANAN R\\Desktop\\AriseGlobalB5\\msedgedriver.exe");
			WebDriver myD=new EdgeDriver();
			myD.manage().window().maximize();
			
			
			myD.get("https://www.amazon.in");
			System.out.println(myD.getTitle());
				
			Actions act=new Actions(myD);
			act.moveToElement(myD.findElement(By.id("nav-link-accountList"))).build().perform();
			
			Thread.sleep(4000);
			myD.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
			
			Thread.sleep(4000);
			myD.close();

	
	}

}





