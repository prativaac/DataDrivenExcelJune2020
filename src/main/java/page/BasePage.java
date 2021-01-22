package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public void waitforElement(WebDriver driver, int timeINSeconds, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 5);

		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public int randomNumberGenerator() {
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(999);
		return randomNumber;
	}

public void selectFromDropdown(WebElement element, String visibleText) {
	Select sel = new Select(element);
	sel.selectByVisibleText(visibleText);
}
}