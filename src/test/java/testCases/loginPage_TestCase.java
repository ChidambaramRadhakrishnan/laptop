package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Object_Repo.loginpage_Object;
import baseclass.baseclass;

public class loginPage_TestCase extends baseclass {
	
	@Test
	public void login() {
		PageFactory.initElements(driver, loginpage_Object.class); 
		loginpage_Object.username.sendKeys("admin");
		loginpage_Object.password.sendKeys("admin123");
		loginpage_Object.submit.click();
	}
	
	
}
