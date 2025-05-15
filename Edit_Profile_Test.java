package tams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Edit_Profile_Test {

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
				
				driver.findElement(By.id("userDropdownBtn")).click();
				
				driver.findElement(By.xpath("//a[text()= 'My Account']")).click();
				
				WebElement phoneInput = driver.findElement(By.name("phone"));
				phoneInput.clear();
				
				driver.findElement(By.name("phone")).sendKeys("01816562328");
				
				WebElement saveButton = driver.findElement(By.xpath("//button[normalize-space(text())='Save Changes']"));
				saveButton.click();
				
				System.out.println(driver.findElement(By.xpath("//button[normalize-space(text())='Save Changes']")).isDisplayed());
				
				driver.findElement(By.xpath("//a[text()= 'Back to Dashboard']")).click();
				
				driver.findElement(By.id("userDropdownBtn")).click();
				
				driver.findElement(By.xpath("//a[text()= 'Sign Out']")).click();






	}

}
