package tams;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Sylhet_Test {

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
				
				driver.findElement(By.xpath("//img[@alt='location' and contains(@src, 'uploads/caption.jpg')]\r\n")).click();
				
				driver.findElement(By.xpath("//div[contains(., 'Sylhet')]//input[@name='hotel_nights']")).clear();
				
				driver.findElement(By.xpath("//div[contains(., 'Sylhet')]//input[@name='hotel_nights']")).sendKeys("5");
				
				WebElement carHourInput = driver.findElement(By.xpath("//div[contains(., 'Sylhet')]//input[@name='car_hours']"));
				carHourInput.clear();
				carHourInput.sendKeys("4");

				
				/*driver.findElement(By.xpath("//div[contains(., 'Sylhet') and contains(., 'Update Trip Cost')]//button[normalize-space(text())='Update Trip Cost']")).click();
				
				driver.findElement(By.xpath("//a[@href='booking?hotel_id=17' and contains(text(), 'Book Now')]")).click();
				
				JavascriptExecutor js = (JavascriptExecutor) driver;

				// Set Check-in Date
				js.executeScript("document.querySelector('input[name=\"check_in\"]').value = '2025-05-20'");

				// Set Check-out Date
				js.executeScript("document.querySelector('input[name=\"check_out\"]').value = '2025-05-23'");
				
				driver.findElement(By.xpath("//button[text()='Confirm Booking']")).click();*/

			
				driver.findElement(By.xpath("//form[@action='booking/car']//button[normalize-space(text())='Book Now']")).click();
				JavascriptExecutor js = (JavascriptExecutor) driver;

				// Set Start Time
				js.executeScript("document.getElementById('start_time').value = '2025-05-20T17:00'");

				// Set End Time
				js.executeScript("document.getElementById('end_time').value = '2025-05-21T19:00'");


				driver.findElement(By.xpath("//button[text()='Book Now']")).click();

				




				
				



	}

}
