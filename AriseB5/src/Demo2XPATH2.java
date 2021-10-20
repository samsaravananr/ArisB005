import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo2XPATH2 {

	public static void main(String[] args) throws InterruptedException 
	{
	
			System.setProperty("webdriver.edge.driver", "C:\\Users\\SARAVANAN R\\Desktop\\AriseGlobalB5\\msedgedriver.exe");
			WebDriver myD=new EdgeDriver();
			myD.get("https://www.google.com");
			System.out.println(myD.getTitle());
			
			int vSize=myD.findElements(By.tagName("a")).size();
			System.out.println("Total Links :"+vSize);
			for (int i=0;i<vSize;i++)
			{
				//String vLink=myD.findElements(By.tagName("a")).get(i).getAttribute("href");
				String vLinkText=myD.findElements(By.tagName("a")).get(i).getText();
				System.out.println(vLinkText);
				
				if(vLinkText.contains("Gmail"))
				{
					myD.findElements(By.tagName("a")).get(i).click();
					break;
				}
				
			}			
			Thread.sleep(4000);
			myD.close();
	
	}

}





