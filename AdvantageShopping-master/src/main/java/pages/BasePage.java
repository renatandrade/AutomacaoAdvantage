package pages;

import org.openqa.selenium.By;

public class BasePage extends WebLogic {

	// Dados para cadastro de novo usuario
	public void btnIconeUser() {
		clickButton(By.id("menuUser"));
	}

	public void fillTxtUserName() {
		write(By.name("usernameRegisterPage"), "Test004");
	}

	public void fillTxtEmail() {
		write(By.name("emailRegisterPage"), "brenda.c@gmail.com");
	}

	public void fillTxtPassword() {
		write(By.name("passwordRegisterPage"), "1D458h962");
	}

	public void fillTxtConfirmPassword() {
		write(By.name("confirm_passwordRegisterPage"), "1D458h962");
	}

	public void fillTxtFirstName() {
		write(By.name("first_nameRegisterPage"), "Brenda");
	}

	public void fillTxtLastName() {
		write(By.name("last_nameRegisterPage"), "Alcântara");
	}

	public void fillTxtTelephon() {
		write(By.name("phone_numberRegisterPage"), "000000000");
	}

	public void selectCountry() {
		selectCombo(By.name("countryListboxRegisterPage"), "Brazil");
	}

	public void fillTxtCity() {
		write(By.name("cityRegisterPage"), "Sao Paulo");
	}

	public void fillTxtAddress() {
		write(By.name("addressRegisterPage"), "Bragança street");
	}

	public void fillTxtState() {
		write(By.name("state_/_province_/_regionRegisterPage"), "SP");
	}

	public void fillTxtPostalCode() {
		write(By.name("postal_codeRegisterPage"), "01236-020");
	}

	
	public void selectCheckBoxPrivaci() {
		clickButton(By.name("i_agree"));
	}

	public void clickBtnRegister() {
		clickButton(By.id("register_btnundefined"));
	}

	//Dados para fazer o login
	public void fillTxtUserNameLogin() {
		write(By.name("username"), "Test004");
	}

	public void fillTxtPasswordLogin() {
		write(By.name("password"), "1D458h962");
	}

	//Validação de páginas
	public String validationUser() {
		return getText(By.linkText("Test004"));
	}

	public String validationLogin() {
		return getText(By.linkText("Test004"));

	}
}
