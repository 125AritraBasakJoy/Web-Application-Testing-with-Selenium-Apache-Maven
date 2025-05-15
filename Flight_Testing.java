package tams;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flight_Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverPath = System.getProperty("user.dir") + "\\Drivers\\edgedriver_win32\\msedgedriver.exe";
        System.setProperty("webdriver.edge.driver", driverPath);
		//Initialize driver
				WebDriver driver = new EdgeDriver();
				//Maximize the window size 
				driver.manage().window().maximize();
				
				//call the driver
				driver.get("http://localhost/Project/Travel-and-Accommodation-Management-System/public//login");
				
				String email = "nusu@gmail.com";
				if (email.contains("@") && email.contains(".")) {
				    driver.findElement(By.id("email")).sendKeys(email);
				} else {
				    System.out.println("Warning: Invalid email format.");
				}
				
				String password = "123456789";

				if (password.length() >= 8) {
				    driver.findElement(By.id("password")).sendKeys(password);
				} else {
				    System.out.println("Warning: Password must be at least 8 characters long.");
				}
				
				driver.findElement(By.xpath("//button[text()='Login']")).click();
				
				driver.findElement(By.xpath("//img[@alt='location']\r\n")).click();
				
				driver.findElement(By.className("bg-blue-600")).click();
				
				WebElement staticDropdown = driver.findElement(By.id("departure"));
				Select dropdown = new Select(staticDropdown);
				
				dropdown.selectByValue("3");
				System.out.println(dropdown.getFirstSelectedOption().getText());
				
				WebElement staticDropdowns = driver.findElement(By.id("arrival"));
				Select dropdowns = new Select(staticDropdowns);
				
				dropdowns.selectByValue("2");
				System.out.println(dropdowns.getFirstSelectedOption().getText());
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("document.getElementsByName('departure_date')[0].value = '2025-05-20';");
				
				js.executeScript("document.getElementsByName('arrival_date')[0].value = '2025-05-23';");
				
				driver.findElement(By.id("budget")).sendKeys("4500");
				
				driver.findElement(By.xpath("//button[normalize-space(text())='Search']")).click();
				
				driver.findElement(By.xpath("//button[normalize-space(text())='Book Now']")).click();
				
				

	}

}
