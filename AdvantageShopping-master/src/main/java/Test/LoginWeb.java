package Test;

import static core.DriverFactory.getDriver;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Browser;
import pages.BasePage;

public class LoginWeb extends Browser {
	BasePage page = new BasePage();

	@Test
	public void pageLogin() {
		page.btnIconeUser();
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		page.fillTxtUserNameLogin();
		page.fillTxtPasswordLogin();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sign_in_btnundefined")));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("sign_in_btnundefined")));
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", element);

		assertEquals("Test002", page.validationLogin());
	}

}
