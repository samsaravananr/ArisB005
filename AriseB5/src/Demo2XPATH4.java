import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo2XPATH4 {

	public static void main(String[] args) throws InterruptedException 
	{
	
			System.setProperty("webdriver.edge.driver", "C:\\Users\\SARAVANAN R\\Desktop\\AriseGlobalB5\\msedgedriver.exe");
			WebDriver myD=new EdgeDriver();
			myD.manage().window().maximize();
			
			
			myD.get("https://www.amazon.in");
			System.out.println(myD.getTitle());
				
			//tagname[@attribute='value']
			//div[@id='navbar']/div[5]/div[2]/div/div/a[1] - Amazon. in for mobiles element
			//div[@id='nav-xshop']/a[1] - Amazon. in for mobiles element
			//div[@class='repayment-block']/div[1]/div[1]/h3 - https://www.mortgagecalculator.org/ (total Monthly Payment)
			//$x("//div[@class='repayment-block']/div[1]/div[1]/*") https://www.mortgagecalculator.org/ (total Monthly Payment)
			
			
			myD.findElement(By.xpath("//div[@id='navbar']/div[5]/div[2]/div/div/a[1]")).click();
			System.out.println(myD.getTitle());
			Thread.sleep(4000);
			
			myD.close();
					

	
	}

}





