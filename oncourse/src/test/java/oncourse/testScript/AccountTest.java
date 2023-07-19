package oncourse.testScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import oncourse.genericMethods.baseclass;
import oncourse.objectRepo.accountspage;



public class AccountTest extends baseclass {
@Test
public void test1() throws InterruptedException {

	accountspage page2 = new accountspage(driver);
	



 //create company

Thread.sleep(3000);
page2.getClickcompany().click();

Thread.sleep(3000);
page2.getClickplaceholder().sendKeys("testing automation 3");

Thread.sleep(2000);
page2.getCreate().click();

Thread.sleep(3000);
page2.getClickaccounticon().click();

Thread.sleep(3000);
page2.getClickcompany1().click();

Thread.sleep(3000);
page2.getClickplaceholder1().sendKeys("testing automation 3");

Thread.sleep(2000);
page2.getCanclecompany().click();  

Thread.sleep(3000);
page2.getClickaccounticon1().click();

Thread.sleep(2000);
page2.getSearchcompany().sendKeys("Testing automation 3");

Thread.sleep(2000);
page2.getClickcompany2().click();

Thread.sleep(2000);
page2.getDeleteleadpage().click();

Thread.sleep(2000);
page2.getDeletecompany().click();




}
}
