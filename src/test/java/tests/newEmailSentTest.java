package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.EmailPage;
import base.BaseTest;


public class newEmailSentTest extends BaseTest {
	
	@Test(description = "newEmailSent")
	public void newEmailSent() {
		
		EmailPage sentEmail = new EmailPage(driver);
		sentEmail.goToDraft();
		sentEmail.sendEmail();
		sentEmail.addImplicitly();
		Assert.assertTrue(sentEmail.isTextPresent(By.xpath("//p[@class='empty-folder-footer']"), "Your Drafts folder is empty"));
		sentEmail.goToSent();
		sentEmail.addImplicitly();
		Assert.assertTrue(sentEmail.isTextPresent(By.xpath("//div[@class='list-view-items-page']//span[@class='subject ']"), SUBJECT));
		
	}
	
	

}
