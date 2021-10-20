import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1Selenium3 {

	public static void main(String[] args) 
	{
	
		Scanner myObj = new Scanner(System.in);  
	    System.out.println("Enter Browser Name");
	    String vBrowser = myObj.nextLine();  
	    
	    if (vBrowser.equalsIgnoreCase("Edge"))
	    {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SARAVANAN R\\Desktop\\AriseGlobalB5\\msedgedriver.exe");
		WebDriver myD=new EdgeDriver();
		myD.get("https://www.amazon.com");
		String vTitle=myD.getTitle();
		System.out.println("The Title is : "+vTitle);
		myD.close();
	    }		
	    else if (vBrowser.equalsIgnoreCase("Chrome"))
	    {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\AriseGlobalB5\\chromedriver.exe");
			WebDriver myD=new ChromeDriver();
			myD.get("https://www.amazon.com");
			String vTitle=myD.getTitle();
			System.out.println("The Title is : "+vTitle);
			myD.close();
	    }
	    else
	    {
	    	System.out.println("Invalid Browser");
	    }
		

	}

}





