import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1Selenium4 {

	public static void main(String[] args) throws InterruptedException 
	{
	
			System.setProperty("webdriver.edge.driver", "C:\\Users\\SARAVANAN R\\Desktop\\AriseGlobalB5\\msedgedriver.exe");
			WebDriver myD=new EdgeDriver();
			myD.get("https://www.linkedin.com/");
			System.out.println(myD.getTitle());
			//IDENTIFY THE ELEMENT WITH CLASS NAME
			myD.findElement(By.className("nav__button-secondary")).click();
			Thread.sleep(4000);
			System.out.println(myD.getTitle());
			
			myD.findElement(By.id("username")).sendKeys("samsaravananr");
			myD.findElement(By.name("session_password")).sendKeys("123456");
			
			//Add STEP to Click on Sign in - Use Only CLASS
			myD.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
			
			String vError=myD.findElement(By.id("error-for-username")).getText();
			System.out.println(vError);
			
			myD.findElement(By.partialLinkText("Forgot")).click();
			System.out.println(myD.getTitle());
			
			myD.findElement(By.linkText("Join now")).click();
			System.out.println(myD.getTitle());
			
			int vSize=myD.findElements(By.tagName("a")).size();
			System.out.println("Total Number of Links "+vSize);
			
			
			Thread.sleep(4000);
			myD.close();
	
	}

}





