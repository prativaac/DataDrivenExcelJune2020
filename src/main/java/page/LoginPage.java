package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.ID, using = "username")
	WebElement USER_NAME;

	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PASSWORD_NAME;

	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SIGN_IN_BUTTON;

	public void enterUserName(String userName) {
		USER_NAME.sendKeys(userName);

	}

	public void enterPassword(String password) {
		PASSWORD_NAME.sendKeys(password);
	}

	public void clickSignInButton() {
		SIGN_IN_BUTTON.click();
	}

}
