package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerPage extends BasePage {
	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Customers')]")
	WebElement CUSTOMERS_FIELD;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Add Customer')]")
	WebElement ADDCUSTOMER_FIELD;

	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement FULL_NAME_FIELD;

	@FindBy(how = How.XPATH, using = "//select[@id='cid']")
	WebElement COMPANY_FIELD;

	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement EMAIL_FIELD;

	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement PHONE_FIELD;

	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	WebElement ADDRESS_FIELD;

	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement CITY_FIELD;

	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	WebElement STATE_FIELD;

	@FindBy(how = How.XPATH, using = "//input[@id='zip']")
	WebElement ZIPCODE_FIELD;

	@FindBy(how = How.ID, using = ("country"))
	WebElement COUNTRY_FIELD;

	@FindBy(how = How.XPATH, using = "//button[@id='submit']")
	WebElement SAVE_BUTTON;

	public void clickCustomerButton() {
		CUSTOMERS_FIELD.click();
	}

	public void clickAddCustomerButton() {
		ADDCUSTOMER_FIELD.click();
		waitforElement(driver, 5, ADDCUSTOMER_FIELD);
	}

	public void enterFullName(String fullName) {
		waitforElement(driver, 5, FULL_NAME_FIELD);
		int randomNumber = randomNumberGenerator();
		FULL_NAME_FIELD.sendKeys(fullName + randomNumber);

	}

	public void enterCompanyName(String companyName) {
		selectFromDropdown(COMPANY_FIELD, companyName);
		waitforElement(driver, 5, COMPANY_FIELD);
	}

	public void enterEmail(String email) {
		int randomNumber = randomNumberGenerator();
		EMAIL_FIELD.sendKeys(randomNumber + email);
	}

	public void enterPhoneNumber(String phone) {
		int randomNumber = randomNumberGenerator();
		PHONE_FIELD.sendKeys(phone + randomNumber);
	}

	public void enterAddress(String address) {
		int randomNumber = randomNumberGenerator();
		ADDRESS_FIELD.sendKeys(address + randomNumber);
	}

	public void enterCity(String city) {
		int randomNumber = randomNumberGenerator();
		CITY_FIELD.sendKeys(city + randomNumber);
	}

	public void enterState(String state) {
		int randomNumber = randomNumberGenerator();
		STATE_FIELD.sendKeys(state + randomNumber);
	}

	public void enterZipCode(String zipcode) {
		int randomNumber = randomNumberGenerator();
		ZIPCODE_FIELD.sendKeys(zipcode + randomNumber);

	}

	public void enterCountry(String country) {
		selectFromDropdown(COUNTRY_FIELD, country);

	}

	public void clickOnSaveButton() {
		SAVE_BUTTON.click();
	}

}
