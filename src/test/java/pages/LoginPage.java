package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public MailboxHomePage doLogin (String login, String password) {
		driver.findElement(By.id("username")).sendKeys(login);
		driver.findElement(By.id("passwd")).sendKeys(password);
		driver.findElement(By.id(".save")).click();
		return new MailboxHomePage(driver);
	}

}
