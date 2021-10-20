import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1Selenium1 {

	public static void main(String[] args) 
	{
	

		//Browser SETUP - Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\AriseGlobalB5\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\SARAVANAN R\\Desktop\\AriseGlobalB5\\msedgedriver.exe");
		//webdriver.gecko.driver
		
		//Initilize WebDriver with the appropriate Browser
		WebDriver myD=new ChromeDriver();
		
		// 1. OPEN Google.com
		myD.get("https://www.amazon.com");
		
		// 2. Capture the Google Title
		String vTitle=myD.getTitle();
		
		// 3. Print The Title
		System.out.println("The Title is : "+vTitle);
		
		// 4. Close the Browser
		myD.close();
		
		
		

	}

}





