import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2XPATH5 {

	public static void main(String[] args) throws InterruptedException 
	{
	
			System.setProperty("webdriver.edge.driver", "C:\\Users\\SARAVANAN R\\Desktop\\AriseGlobalB5\\msedgedriver.exe");
			WebDriver myD=new EdgeDriver();
			myD.manage().window().maximize();
			
			
			myD.get("https://www.amazon.in");
			System.out.println(myD.getTitle());
				
			Select SearchProductDropDown=new Select(myD.findElement(By.id("searchDropdownBox")));
			SearchProductDropDown.selectByIndex(2);
			Thread.sleep(4000);
			SearchProductDropDown.selectByValue("search-alias=mobile-apps");
			Thread.sleep(4000);
			SearchProductDropDown.selectByVisibleText("Amazon Devices");
			
			
			//Enter Mobile in the Search Text Box
			//CLICK - Search Button
			//CLICK - Todays Deals
			//Close the APP
			
			
			
			
					

	
	}

}





