package core;

import static core.DriverFactory.killDriver;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import static core.DriverFactory.getDriver;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Browser {


	@Before
	public void startBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TBS\\WebDriver\\chromedriver.exe");
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getDriver().get("https://advantageonlineshopping.com/#/");
	}

	@Rule
	public TestName testName = new TestName();

	@After
	public void finish() throws IOException {
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File(
				"target" + File.separator + "screenshot" + File.separator + testName.getMethodName() + ".jpg"));

		if (Properties.CLOSE_BROWSER) {
			killDriver();
		}

	}
}
