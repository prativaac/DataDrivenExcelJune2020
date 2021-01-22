package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.ContactPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class AddCustomerTest {
	
	WebDriver driver;
	ExcelReader exlreader = new ExcelReader("testData\\Tf-Test Data Driven Excel.xlsx");
	String userName = exlreader.getCellData("LoginInfo", "UserName", 2);
	String password =exlreader.getCellData("LoginInfo", "Password", 2);
	String fulname =exlreader.getCellData("AddCustomer", "FullName", 2);
	String company =exlreader.getCellData("AddCustomer", "Company", 2);
	String email =exlreader.getCellData("AddCustomer", "Email", 2);
	String phone =exlreader.getCellData("AddCustomer", "Phone", 2);
	String address =exlreader.getCellData("AddCustomer", "Address", 2);
	String city =exlreader.getCellData("AddCustomer", "City", 2);
	String state =exlreader.getCellData("AddCustomer", "State", 2);
	String zipcode =exlreader.getCellData("AddCustomer", "Zipcode", 2);
	String country =exlreader.getCellData("AddCustomer", "Country", 2);
	
	@Test
	public void userShouldBeAbleToAddCustomer() {
		driver = BrowserFactory.init();
		LoginPage loginpage = PageFactory.initElements(driver,LoginPage.class );
		loginpage.enterUserName(userName); 
		loginpage.enterPassword(password);
		loginpage.clickSignInButton();
		DashboardPage dashboardpage = PageFactory.initElements(driver,DashboardPage.class );
		dashboardpage.validateDashboardPage();
		
		AddCustomerPage addCustomer = PageFactory.initElements(driver, AddCustomerPage.class );
		addCustomer.clickCustomerButton();
		addCustomer.clickAddCustomerButton();
		addCustomer.enterFullName(fulname);
		addCustomer.enterCompanyName(company);
		addCustomer.enterEmail(email);
		addCustomer.enterPhoneNumber(phone);
		addCustomer.enterAddress(address);
		addCustomer.enterCity(city);
		addCustomer.enterState(state);
		addCustomer.enterZipCode(zipcode);
		addCustomer.enterCountry(country);
		addCustomer.clickOnSaveButton();
		ContactPage contact = PageFactory.initElements(driver, ContactPage.class);
		contact.validateContacts();
	}

}
