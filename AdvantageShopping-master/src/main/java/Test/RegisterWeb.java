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

public class RegisterWeb extends Browser{

	BasePage page = new BasePage();

	@Test
	public void accessForm() {
		page.btnIconeUser();
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".create-new-account")));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".create-new-account")));
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", element);
	
		page.fillTxtUserName();
		page.fillTxtEmail();
		page.fillTxtPassword();
		page.fillTxtConfirmPassword();
		page.fillTxtFirstName();
		page.fillTxtLastName();
		page.fillTxtTelephon();
		page.selectCountry();
		page.fillTxtCity();
		page.fillTxtAddress();
		page.fillTxtState();
		page.fillTxtPostalCode();
		page.selectCheckBoxPrivaci();
		page.clickBtnRegister(); 
		page.validationUser();
		
		assertEquals("Test002", page.validationUser());
	}
}
