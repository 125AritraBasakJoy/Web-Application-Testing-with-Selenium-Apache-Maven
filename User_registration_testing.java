package tams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class User_registration_testing {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") + "\\Drivers\\edgedriver_win32\\msedgedriver.exe";
        System.setProperty("webdriver.edge.driver", driverPath);
		//Initialize driver
				WebDriver driver = new EdgeDriver();
				//Maximize the window size 
				driver.manage().window().maximize();
				
				//call the driver
				driver.get("http://localhost/Project/Travel-and-Accommodation-Management-System/public//login");
				
				driver.findElement(By.xpath("//a[text()='Sign up']")).click();
				
				driver.findElement(By.id("name")).sendKeys("Nusrat Jahan Noor");
				
				driver.findElement(By.id("email")).sendKeys("nusu@gmail.com");
				
				//driver.findElement(By.id("password")).sendKeys("123456789");
				
				String password = "123456789";

				if (password.length() >= 8) {
				    driver.findElement(By.id("password")).sendKeys(password);
				} else {
				    System.out.println("Warning: Password must be at least 8 characters long.");
				}
				
				String retype_password = "123456789";
				
				if(password == retype_password) {
					driver.findElement(By.id("retype_password")).sendKeys(retype_password);
				} else {
					System.out.println("Warning: Password does not matched.");
				}
				
				String phone = "01816562328";
				
				if(phone.length() >= 11) {
					driver.findElement(By.id("phone")).sendKeys(phone);
				} else {
					System.out.println("Warning: Phone number must be 11digits long.");
				}
				
				driver.findElement(By.xpath("//button[contains(normalize-space(text()), 'Sign Up')]")).click();
				
				driver.findElement(By.xpath("//a[text()='Log in']")).click();

	}

}
