package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class ContactPage {
	WebDriver driver;
	public ContactPage(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how = How.XPATH,using = "//h2[contains(text(),' Contacts ')]")
	WebElement CONTACT;
	public void validateContacts() {
		String contact = CONTACT.getText();
		System.out.println(contact+ "=Page Matched");
		Assert.assertEquals(contact, "Contacts", "Page didnot matched!!");
	}
}
