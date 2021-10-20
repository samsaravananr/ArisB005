import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo2XPATH1 {

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
			//1. myD.findElement(By.xpath("//button[@aria-label='Sign in']")).click();
			//2. myD.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']")).click();
			//3. myD.findElement(By.xpath("//*[@class='btn__primary--large from__button--floating']")).click();
			//4. myD.findElement(By.xpath("//button[@type='submit' and @aria-label='Sign in']")).click();
			//5. myD.findElement(By.xpath("//button[text()='Sign in']")).click();
			
			//6. $x("//button[text()='Sign in']") - to check if XPATH is correct in Browser
			
			
			String vError=myD.findElement(By.id("error-for-username")).getText();
			System.out.println(vError);
			
						
			Thread.sleep(4000);
			myD.close();
	
	}

}





