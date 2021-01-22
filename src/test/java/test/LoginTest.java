package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class LoginTest {

	WebDriver driver;
	ExcelReader exlreader = new ExcelReader("testData\\Tf-Test Data Driven Excel.xlsx");
	String userName = exlreader.getCellData("LoginInfo", "UserName", 2);
	String password =exlreader.getCellData("LoginInfo", "Password", 2);
	
@Test
	public void userShouldBeAbleToLogin() {

		driver = BrowserFactory.init();
		LoginPage loginpage = PageFactory.initElements(driver,LoginPage.class );
		loginpage.enterUserName(userName); 
		loginpage.enterPassword(password);
		loginpage.clickSignInButton();
		DashboardPage dashboardpage = PageFactory.initElements(driver,DashboardPage.class );
		dashboardpage.validateDashboardPage();
		BrowserFactory.tearDown();
	}

}
