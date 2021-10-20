import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;



public class Demo2XPATH6 {

	public static void main(String[] args) throws InterruptedException 
	{
	
			System.setProperty("webdriver.edge.driver", "C:\\Users\\SARAVANAN R\\Desktop\\AriseGlobalB5\\msedgedriver.exe");
			WebDriver myD=new EdgeDriver();
			myD.manage().window().maximize();
			
			
			myD.get("https://www.gmail.com");
			System.out.println(myD.getTitle());
			myD.findElement(By.linkText("Help")).click();
			
			Set<String> ids= myD.getWindowHandles();
			//System.out.println(ids);
			Iterator<String> it=ids.iterator();
			
			String GmailWindow=it.next();
			String HelpWindow=it.next();
			
			myD.switchTo().window(HelpWindow);
		
			System.out.println(myD.getTitle());
			myD.quit();	
			
			
			
			
					

	
	}

}





