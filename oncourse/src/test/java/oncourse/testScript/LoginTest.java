package oncourse.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import oncourse.genericMethods.baseclass;
import oncourse.objectRepo.loginpage;

public class LoginTest extends baseclass {
	private WebDriver driver;
	@BeforeMethod
	public void browsersetup() throws InterruptedException {
		loadPropertiesFile();
		driver=initializeAndOpenBrowser(prop.getProperty("browser"));
	}
	@AfterMethod
	public void quitt() throws InterruptedException {
		Thread.sleep(2000);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

@Test
public void testcase () throws InterruptedException  {
loginpage page = new loginpage(driver);


// LOGIN PAGE

Thread.sleep(2000);
page.getLoginID().sendKeys("james@zibtek.in");

Thread.sleep(4000);
page.getLoginPassword().sendKeys("123456");

Thread.sleep(3000);
page.getSignin().click();

Thread.sleep(2000);
page.getClearPassword().clear();

Thread.sleep(2000);
page.getClearEmail().clear();

Thread.sleep(4000);
page.getAddEmail().sendKeys("james@zibtek.co");

Thread.sleep(2000);
page.getAddPassword().sendKeys("zibtek2023");

Thread.sleep(2000);
page.getSignin1().click();

Thread.sleep(2000);
page.getClearEmail1().clear();

Thread.sleep(2000);
page.getAddEmail1().sendKeys("james@zibetk.in");

Thread.sleep(2000);
page.getClearPassword1().clear();

Thread.sleep(4000);
page.getAddPassword1().sendKeys("123456");

Thread.sleep(4000);
page.getSignin2().click();

Thread.sleep(2000);
page.getClickForgotPassword().click();

Thread.sleep(4000);
page.getAddEmail2().sendKeys("james@zibtek.co");

Thread.sleep(4000);
page.getResetPassword().click();

Thread.sleep(2000);
page.getClearEmail2().clear();

Thread.sleep(3000);
page.getAddEmail3().sendKeys("james@zibtek.in");

Thread.sleep(4000);
page.getResetPassword1().click();

Thread.sleep(3000);
page.getBackToSignin().click(); 

Thread.sleep(3000);
page.getAddEmail4().sendKeys("james@zibtek.in");

Thread.sleep(3000);
page.getAddPassword2().sendKeys("zibtek2024");

Thread.sleep(2000);
page.getVisibilityoff().click();

Thread.sleep(2000);
page.getVisilibityOn().click();

Thread.sleep(3000);
page.getSignin3().click();

 





}
}
