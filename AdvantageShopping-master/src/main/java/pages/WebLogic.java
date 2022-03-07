package pages;

import static core.DriverFactory.getDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebLogic {
	public void write(By by, String texto) {
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(texto);
	}

	public void clickButton(By by) {
		getDriver().findElement(by).click();
	}

	public String getFieldValue(String id_campo) {
		return getDriver().findElement(By.id(id_campo)).getAttribute("value");
	}

	public boolean isCheckMarked(By by) {
		return getDriver().findElement(by).isSelected();
	}

	public void selectCombo(By by, String valor) {
		WebElement element = getDriver().findElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}

	public String getComboValue(String id) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo1 = new Select(element);
		return combo1.getFirstSelectedOption().getText();
	}

	public String getText(By by) {
		return getDriver().findElement(by).getText();
	}
}
