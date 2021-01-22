package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	WebDriver driver;
	
	
	public DashboardPage(WebDriver driver) {
	this.driver = driver;
	}
	@FindBy(how =How.XPATH,using = "//h2[contains(text(), Dashboard )]")
	WebElement DASHBOARD_ELEMENT;
	
	
	public void validateDashboardPage() {
		String dashboardPage =DASHBOARD_ELEMENT.getText();
		System.out.println(dashboardPage + "= Dashboard Page Matched");
		Assert.assertEquals(dashboardPage, "Dashboard", "Wrong page!!");
		
	}

}
