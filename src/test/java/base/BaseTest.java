package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.LoginPage;
import pages.MailboxHomePage;


public class BaseTest {
	
	protected static final String START_URL = "http://mail.yahoo.com";
	protected static final String LOGIN = "marinakishkan";
	protected static final String PASSWORD = "theProdigy77";
	protected static final String TO = "marina.kishkan@gmail.com";
	protected static final String SUBJECT = "Test Email";
	protected static final String BODY = "New test email!";
	protected WebDriver driver;
	
	@BeforeClass(description = "Start browser")
	public void startBrowser() {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(START_URL);
			LoginPage Login = new LoginPage(driver);
			MailboxHomePage mailboxHomePage = Login.doLogin(LOGIN,PASSWORD);
		
	}
	
	
	
	@AfterClass(description = "Stop Browser")
	public void tearDown() {
		driver.close();
	}
	
	

}
