package tams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Homepage_testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String driverPath = System.getProperty("user.dir") + "\\Drivers\\edgedriver_win32\\msedgedriver.exe";
        System.setProperty("webdriver.edge.driver", driverPath);
		//Initialize driver
				WebDriver driver = new EdgeDriver();
				//Maximize the window size 
				driver.manage().window().maximize();
				
				//call the driver
				driver.get("http://localhost/Project/Travel-and-Accommodation-Management-System/public//home");
				
				driver.findElement(By.xpath("//a[text()= 'Hotels']")).click();
				
				driver.findElement(By.xpath("//a[text()= 'Cars']")).click();
				
				driver.findElement(By.xpath("//a[text()= 'Flights']")).click();

				

	}

}
