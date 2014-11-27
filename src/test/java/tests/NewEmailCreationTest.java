package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.EmailPage;
import base.BaseTest;



public class NewEmailCreationTest extends BaseTest {
	
	@Test(description = "NewEmailCreation")
	public void newEmailCreation() {
		
		EmailPage newEmail = new EmailPage(driver);
		newEmail.startNewMailCreation();
		newEmail.addImplicitly();
		newEmail.newEmail(TO, SUBJECT,BODY);
		newEmail.goToDraft();
		Assert.assertTrue(newEmail.isTextPresent(By.id("to-field"), TO));
		Assert.assertTrue(newEmail.isTextPresent(By.id("subject-field"), SUBJECT));
		Assert.assertTrue(newEmail.isTextPresent(By.id("rtetext"), BODY));
	}
	

}
