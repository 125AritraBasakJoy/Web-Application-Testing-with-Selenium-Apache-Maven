package tams;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel_testing {

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
				
				driver.findElement(By.className("bg-green-600")).click();
				
				driver.findElement(By.id("search")).sendKeys("The Water Garden");
				
				driver.findElement(By.id("min_price")).sendKeys("1000");
				
				driver.findElement(By.id("max_price")).sendKeys("2000");
				
				WebElement staticDropdown = driver.findElement(By.id("location_id"));
				Select dropdown = new Select(staticDropdown);
				
				dropdown.selectByValue("3");
				System.out.println(dropdown.getFirstSelectedOption().getText());
				
				driver.findElement(By.className("px-6")).click();
				
				driver.findElement(By.xpath("//a[normalize-space(text())='Book Now' and contains(@href, 'hotel_id=17')]")).click();
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("document.getElementsByName('check_in')[0].value = '2025-05-20';");
				
				js.executeScript("document.getElementsByName('check_out')[0].value = '2025-05-23';");
				
				driver.findElement(By.xpath("//button[normalize-space(text())='Confirm Booking']")).click();


	}

}
