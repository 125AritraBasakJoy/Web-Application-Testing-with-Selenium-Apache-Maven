package tams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Manage_vendors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverPath = System.getProperty("user.dir") + "\\Drivers\\edgedriver_win32\\msedgedriver.exe";
        System.setProperty("webdriver.edge.driver", driverPath);
		//Initialize driver
				WebDriver driver = new EdgeDriver();
				//Maximize the window size 
				driver.manage().window().maximize();
				
				//call the driver
				driver.get("http://localhost/Project/Travel-and-Accommodation-Management-System/public//vendor/login");
				
				String email = "j@gmail.com";
				if (email.contains("@") && email.contains(".")) {
				    driver.findElement(By.id("email")).sendKeys(email);
				} else {
				    System.out.println("Warning: Invalid email format.");
				}
				
				String password = "1234567890";

				if (password.length() >= 8) {
				    driver.findElement(By.id("password")).sendKeys(password);
				} else {
				    System.out.println("Warning: Password must be at least 8 characters long.");
				}
				
				//Edit Profile Section
				driver.findElement(By.xpath("//button[text()='Login']")).click();
				
				/*driver.findElement(By.xpath("//a[normalize-space(text()='Edit Profile')]")).click();
				
				driver.findElement(By.id("phone")).clear();
				driver.findElement(By.id("phone")).sendKeys("01865828794");
				
				driver.findElement(By.xpath("//button[normalize-space(text())='Save Changes']")).click();*/
				
				//Change Passwprd Section
				/*driver.findElement(By.xpath("//a[normalize-space(text())='Change Password']")).click();
				driver.findElement(By.id("current_password")).sendKeys("12345678910");
				driver.findElement(By.id("new_password")).sendKeys("1234567890");
				driver.findElement(By.xpath("//button[normalize-space(text())='Change Password']")).click();*/
				
				//Panel Management Section
				/*driver.findElement(By.xpath("//a[normalize-space(text())='Panel']")).click();
				driver.findElement(By.id("name")).sendKeys("The Joy's Kingdom");
				driver.findElement(By.id("location_id")).sendKeys("5");
				driver.findElement(By.id("description")).sendKeys("The Joy's Kingdom is a well-konown 5 star hotel.Which provide world class facilities to their customer.");
				driver.findElement(By.id("price_per_night")).sendKeys("4500");
				driver.findElement(By.id("capacity")).sendKeys("1200");
				driver.findElement(By.id("hotelPhoto")).sendKeys("C:\\Users\\JOY SAHA\\Downloads\\for Testing.jpg");
				driver.findElement(By.xpath("//button[normalize-space(text())='Save']")).click();*/
				
				//Manage Order Section 
				driver.findElement(By.xpath("//a[normalize-space(text())='Manage Order']")).click();
				driver.findElement(By.xpath("//button[normalize-space(text())='Approve']")).click();




	}

}
