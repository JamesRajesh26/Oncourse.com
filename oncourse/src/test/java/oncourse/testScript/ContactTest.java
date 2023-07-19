package oncourse.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import oncourse.genericMethods.baseclass;
import oncourse.objectRepo.contactpage;
//import oncourse.objectRepo.contactpage1;


public class ContactTest extends baseclass {
@Test
public void test1() throws InterruptedException {
	
	
	contactpage page1 = new contactpage(driver);
	
	
	
	// search company
	
	Thread.sleep(3000);
	page1.getAddcompany().sendKeys("Testing automation 2");

	Thread.sleep(3000);
	page1.getSearchcompany().click();

	
	//Add address
	
	Thread.sleep(3000);
	page1.getClickaddress().click();

	Thread.sleep(3000);
	page1.getSaveaddress3().click();
	
	Thread.sleep(3000);
	page1.getAddaddress().sendKeys("# 11 33,varanasi road ");

	Thread.sleep(3000);
	page1.getAddaddress2().sendKeys("bangalore Ramurthy nager");

	Thread.sleep(3000);
	page1.getClickcountry().click();

	Thread.sleep(3000);
	page1.getCountryname().sendKeys("united state");

	Thread.sleep(3000);
	page1.getClickstate().click();

	Thread.sleep(3000);
	page1.getStatename().sendKeys("florida");

	Thread.sleep(3000);
	page1.getCityname().sendKeys("Kingdom");

	Thread.sleep(3000);
	page1.getAddzipcode().sendKeys("602113");
		
	Thread.sleep(3000);
	page1.getSaveaddress().click();


	// editing address
	Thread.sleep(3000);
	page1.getEditaddress().click();

	Thread.sleep(3000);
	page1.getEditcountry().click();

	Thread.sleep(3000);
	page1.getEditcountryname().sendKeys("united kingdom");

	Thread.sleep(3000);
	page1.getEditstate().click();

	Thread.sleep(3000);
	page1.getEditstatename().sendKeys("London");

	
	Thread.sleep(3000);
	page1.getSaveeditadress().click();

	Thread.sleep(3000);
	page1.getClickdeleteaddress().click();

	Thread.sleep(3000);
	page1.getCancledeleteaddress().click();

	Thread.sleep(3000);
	page1.getClickdeleteaddress1().click();

	Thread.sleep(3000);
	page1.getDeleteaddress().click();


	// Contact lead page1s
	Thread.sleep(3000);
	page1.getAddcontact().click();

	Thread.sleep(3000);
	page1.getContactcancle().click();

	Thread.sleep(3000);
	page1.getAddcontact1().click();

	Thread.sleep(3000);
	page1.getContactname().sendKeys("Automation");

	Thread.sleep(3000);
	page1.getTitlename().sendKeys("QA TESTER");

	Thread.sleep(3000);
	page1.getSelectflag().click();

	Thread.sleep(3000);
	page1.getFlagname().click();

	Thread.sleep(3000);
	page1.getAddnumber().sendKeys("6360244152");

	Thread.sleep(3000);
	page1.getPhonetype().click();

	Thread.sleep(3000);
	page1.getClickmobile().click();

	Thread.sleep(3000);
	page1.getSelectflag1().click();

	Thread.sleep(3000);
	page1.getFlagname1().click();

	Thread.sleep(3000);
	page1.getClickemail().click();

	Thread.sleep(3000);
	page1.getAddemailID().sendKeys("james@zibtek.in");

	Thread.sleep(3000);
	page1.getSavecontact().click();

	Thread.sleep(3000);
	page1.getClickhoriz().click();

	Thread.sleep(3000);
	page1.getEditcontact().click();


	Thread.sleep(4000);
	JavascriptExecutor script2=(JavascriptExecutor)driver;
	script2.executeScript("window.scrollBy(0,350)", "");

	Thread.sleep(3000);
	page1.getContacturl().click();

	Thread.sleep(3000);
	page1.getURLlink().sendKeys("www.oncourse.com");

	Thread.sleep(3000);
	page1.getSaveeditcontact().click();

	Thread.sleep(3000);
	page1.getClickhoriz1().click();

	Thread.sleep(3000);
	page1.getClickedit().click();

	
	Thread.sleep(3000);
	JavascriptExecutor script21=(JavascriptExecutor)script2;
	script21.executeScript("window.scrollBy(0,350)", "");
			
	Thread.sleep(3000);
	page1.getEditcancle().click();

	Thread.sleep(3000);
	page1.getClicknewcontact().click();
	
	Thread.sleep(3000);
	page1.getCanclenewcontact().click();


	// CONTACT TASK

	Thread.sleep(3000);
	JavascriptExecutor script3=(JavascriptExecutor)driver;
	script3.executeScript("window.scrollBy(0,-650)", "");

	Thread.sleep(2000);
	page1.getAddtask().click();

	Thread.sleep(2000);
	page1.getCreatetask().click();

	Thread.sleep(2000);
	page1.getCleartaskdescription().clear();

	Thread.sleep(2000);
	page1.getAddtaskdescription().sendKeys("Need to follow up today");

	Thread.sleep(2000);
	page1.getClicktasktype().click();

	Thread.sleep(2000);
	page1.getAddtasktype().click();

	Thread.sleep(2000);
	page1.getCreatetask1().click();

	Thread.sleep(3000);
	WebElement action=driver.findElement(By.xpath("(//*[text()='Prospecting'])[1]"));
	Actions act = new Actions (driver);
	act.moveToElement(action).build().perform();
	driver.findElement(By.xpath("(//*[text()='edit'])[2]")).click();

	Thread.sleep(2000);
	page1.getClickaddpriority().click();

	Thread.sleep(2000);
	page1.getAddhighPriority().click();

	Thread.sleep(2000);
	page1.getClicksave().click();

	Thread.sleep(3000);
	WebElement action1=driver.findElement(By.xpath("(//*[text()='Prospecting'])[1]"));
	Actions act1 = new Actions (driver);
	act1.moveToElement(action1).build().perform();
	driver.findElement(By.xpath("(//*[text()='edit'])[2]")).click();

	Thread.sleep(2000);
	page1.getClickcheck().click();

	Thread.sleep(3000);
	page1.getClickfollowup().click();

	Thread.sleep(2000);
	page1.getClickfollowup1().click();

	Thread.sleep(3000);
	WebElement action11=driver.findElement(By.xpath("//*[text()='Need to follow up today']"));
	Actions act11 = new Actions (driver);
	act11.moveToElement(action11).build().perform();
	driver.findElement(By.xpath("//*[text()='undo']")).click();

	driver.navigate().refresh();

	Thread.sleep(4000);
	WebElement action21=driver.findElement(By.xpath("(//*[text()='Prospecting'])[1]"));
	Actions act21 = new Actions (driver);
	act21.moveToElement(action21).build().perform();
	driver.findElement(By.xpath("//*[text()='check']")).click();	

	Thread.sleep(2000);
	page1.getClickfollowup2().click();

	Thread.sleep(2000);
	page1.getClickundo().click();

	Thread.sleep(3000);
	WebElement action211=driver.findElement(By.xpath("(//*[text()='Prospecting'])[1]"));
	Actions act211 = new Actions (driver);
	act211.moveToElement(action211).build().perform();
	driver.findElement(By.xpath("(//*[text()='delete'])[2]")).click();

	Thread.sleep(2000);
	page1.getClicktaskcancle().click();

	Thread.sleep(3000);
	WebElement action2111=driver.findElement(By.xpath("(//*[text()='Prospecting'])[1]"));
	Actions act2111 = new Actions (driver);
	act2111.moveToElement(action2111).build().perform();
	driver.findElement(By.xpath("(//*[text()='delete'])[2]")).click();

	Thread.sleep(2000);
	page1.getClicktaskdelete().click();



	// CREATE DEALS
	Thread.sleep(3000);
	page1.getAddDeal().click();

	Thread.sleep(4000);
	JavascriptExecutor script31=(JavascriptExecutor)driver;
	script31.executeScript("window.scrollBy(0,800)", "");	

	Thread.sleep(3000);
	page1.getClicksavedeal().click();

	Thread.sleep(3000);
	JavascriptExecutor script311=(JavascriptExecutor)driver;
	script311.executeScript("window.scrollBy(0,-750)", "");


	Thread.sleep(3000);
	page1.getDealname().sendKeys("Cricket");

	Thread.sleep(3000);
	page1.getDealcontactPerson().click();

	Thread.sleep(3000);
	page1.getDealcontactname().click();

	Thread.sleep(3000);
	page1.getDealpipeline().click();

	Thread.sleep(3000);
	page1.getPipelinename().click();

	Thread.sleep(3000);
	page1.getDealstage().click();

	Thread.sleep(3000);
	page1.getStagename().click();

	Thread.sleep(3000);
	page1.getDealvalues().sendKeys("300");

	Thread.sleep(3000);
	page1.getDealOwner().click();

	Thread.sleep(3000);
	page1.getDealNotes().sendKeys("Testing Automation");

	Thread.sleep(3000);
	page1.getDealSave().click();

	Thread.sleep(3000);
	JavascriptExecutor script211=(JavascriptExecutor)driver;
	script211.executeScript("window.scrollBy(0,-550)", "");	

	Thread.sleep(3000);
	page1.getClickDealName().click();

	Thread.sleep(3000);
	page1.getClickMoreVert().click();

	Thread.sleep(3000);
	page1.getDealEdit().click();

	Thread.sleep(3000);
	page1.getClearDealName().clear();

	Thread.sleep(3000);
	page1.getDealEditName().sendKeys("Martin");

	Thread.sleep(3000);
	JavascriptExecutor script41=(JavascriptExecutor)driver;
	script41.executeScript("window.scrollBy(0,650)", "");

	Thread.sleep(3000);
	page1.getDealEditSave().click();

	Thread.sleep(3000);
	JavascriptExecutor script4=(JavascriptExecutor)driver;
	script4.executeScript("window.scrollBy(0,-350)", "");


	// WON DEALS
	 
	Thread.sleep(3000);
	page1.getClickDealName1().click();

	Thread.sleep(3000);
	page1.getDealWon().click();

	Thread.sleep(3000);
	JavascriptExecutor script5=(JavascriptExecutor)driver;
	script5.executeScript("window.scrollBy(0,-750)", "");

	Thread.sleep(3000);
	page1.getClickDealName2().click();

	Thread.sleep(3000);
	page1.getClickWonStatus().click();

	Thread.sleep(3000);
	page1.getClickDealName3().click();

	Thread.sleep(3000);
	page1.getDealReopen().click();

	Thread.sleep(2000);
	driver.navigate().refresh();

	// LOST DEALS

	Thread.sleep(3000);
	page1.getClickDealName4().click();

	Thread.sleep(3000);
	page1.getClickDealLost().click();

	Thread.sleep(3000);
	page1.getDealLostReason().click();

	Thread.sleep(3000);
	page1.getDealsReasonNotes().click();

	Thread.sleep(3000);
	page1.getDealLostNotes().click();

	Thread.sleep(3000);
	page1.getDealLostNotesText().sendKeys("Testing Automation");

	Thread.sleep(3000);
	page1.getDealLostCancle().click();

	Thread.sleep(3000);
	page1.getClickDealLost1().click();

	Thread.sleep(3000);
	page1.getDealLostReason1().click();

	Thread.sleep(3000);
	page1.getDealsReasonNotes1().click();

	Thread.sleep(3000);
	page1.getDealLostNotes1().click();

	Thread.sleep(3000);
	page1.getDealLostNotesText1().sendKeys("Testing Automation");

	Thread.sleep(3000);
	page1.getDealsLostButton().click();

	Thread.sleep(3000);
	page1.getClickDealName5().click();

	Thread.sleep(3000);
	page1.getDealLostStatus().click();

	Thread.sleep(3000);
	page1.getClickDealName6().click();

	Thread.sleep(3000);
	page1.getDealsLostReopen().click();

	Thread.sleep(3000);
	page1.getClickDealName7().click();

	Thread.sleep(3000);
	page1.getClickMoreVert1().click();

	Thread.sleep(3000);
	page1.getClickdelete1().click();

	Thread.sleep(3000);
	page1.getClickcanclebutton().click();

	Thread.sleep(3000);
	page1.getClickMoreVert2().click();

	Thread.sleep(3000);
	page1.getClickdelete2().click();

	Thread.sleep(3000);
	page1.getDeletedeals().click();  


	// Create Sequences

	Thread.sleep(3000);
	JavascriptExecutor script51=(JavascriptExecutor)driver;
	script51.executeScript("window.scrollBy(0,-750)", "");

	Thread.sleep(2000);
	page1.getAddcontactSequences().click();

	Thread.sleep(2000);
	page1.getClickStart().click();

	Thread.sleep(2000);
	page1.getSelectSequences().click();

	Thread.sleep(2000);
	page1.getAddSequencesName().click();

	Thread.sleep(2000);
	page1.getClickSequencescontact().click();

	Thread.sleep(2000);
	page1.getAddSequencescontact().click();

	Thread.sleep(2000);
	page1.getClicksequencesfrom().click();

	Thread.sleep(2000);
	page1.getAddsequencesemailID().click();

	Thread.sleep(2000);
	page1.getSequencesClickStart().click();

	// CONTACT SEQUENCES EDIT

	Thread.sleep(2000);
	WebElement action3=driver.findElement(By.xpath("//p[text()='Step 0/1']"));
	Actions act3 = new Actions (driver);
	act3.moveToElement(action3).build().perform();
	driver.findElement(By.xpath("//i[text()='more_vert']")).click();

	Thread.sleep(2000);
	page1.getClickViewEditSquences().click();

	Thread.sleep(2000);
	page1.getPauseSequences().click();

	Thread.sleep(2000);
	page1.getCancelEditSequences().click();

	Thread.sleep(2000);
	WebElement action4=driver.findElement(By.xpath("//p[text()='Step 0/1']"));
	Actions act4 = new Actions (driver);
	act4.moveToElement(action4).build().perform();
	driver.findElement(By.xpath("//i[text()='more_vert']")).click();

	Thread.sleep(2000);
	page1.getClickeditsequences1().click();

	Thread.sleep(2000);
	page1.getClickResume().click();

	Thread.sleep(2000);
	page1.getPauseSequences1().click();

	Thread.sleep(2000);
	page1.getDeleteReminder().click();

	Thread.sleep(2000);
	page1.getCancleeditsequence1().click();

	Thread.sleep(2000);
	page1.getCancleSequences().click();

	// SEQUENCE ADD ANOTHER CONTACT

	Thread.sleep(2000);
	WebElement action111=driver.findElement(By.xpath("(//*[text()='Step 0/1'])[1]"));
	Actions act111 = new Actions (driver);
	act111.moveToElement(action111).build().perform();
	driver.findElement(By.xpath("(//*[text()='more_vert'])[1]")).click();

	Thread.sleep(2000);
	page1.getAddAnotherContact().click();

	Thread.sleep(2000);
	page1.getAddSelectSequences().click();

	Thread.sleep(2000);
	page1.getAddJames1().click();

	Thread.sleep(2000);
	page1.getClickstart().click();

	Thread.sleep(2000);
	page1.getClickContactSequences().click();

	Thread.sleep(2000);
	page1.getAddcontactsequences().click();

	Thread.sleep(2000);
	page1.getAddcontactemailid().click();

	Thread.sleep(2000);
	page1.getAddemailid().click();

	Thread.sleep(2000);
	page1.getClickaddsequences().click();

	// CONTACT VIEW SEQUENCES

	Thread.sleep(3000);
	JavascriptExecutor script311111=(JavascriptExecutor)driver;
	script311111.executeScript("window.scrollBy(0,-450)", "");
		 
	Thread.sleep(3000);
	WebElement action1111=driver.findElement(By.xpath("(//*[text()='Step 0/2'])[1]"));
	Actions act1111 = new Actions (driver);
	act1111.moveToElement(action1111).build().perform();
	driver.findElement(By.xpath("(//*[text()='more_vert'])[1]")).click();

	Thread.sleep(2000);
	page1.getClickviewsequences().click();

	Thread.sleep(3000);
	JavascriptExecutor je = (JavascriptExecutor)driver;
	WebElement scroll = driver.findElement(By.xpath("//*[text()=' james1 ']"));
	je.executeScript("arguments[0].scrollIntoView();", scroll);

	Thread.sleep(2000);
	page1.getClickaccountmodule().click();

	Thread.sleep(2000);
	page1.getSearchcompany1().sendKeys("Testing automation 2");

	Thread.sleep(2000);
	page1.getAddcompany1().click();


	// CONTACT DELETE SEQUENCES

	Thread.sleep(3000);
	JavascriptExecutor script3111=(JavascriptExecutor)driver;
	script3111.executeScript("window.scrollBy(0,450)", "");

	Thread.sleep(2000);
	WebElement action5=driver.findElement(By.xpath("(//*[text()='Step 0/2'])[1]"));
	Actions act5 = new Actions (driver);
	act5.moveToElement(action5).build().perform();
	driver.findElement(By.xpath("(//*[text()='more_vert'])[1]")).click();


	Thread.sleep(2000);
	page1.getEditsequences().click();

	Thread.sleep(2000);
	page1.getPauseSequences2().click();

	Thread.sleep(2000);
	page1.getDeletereminder().click();

	Thread.sleep(2000);
	page1.getDeletesequence().click();

	Thread.sleep(2000);
	WebElement action6=driver.findElement(By.xpath("(//*[text()='Step 0/1'])[1]"));
	Actions act6 = new Actions (driver);
	act6.moveToElement(action6).build().perform();
	driver.findElement(By.xpath("(//*[text()='more_vert'])[1]")).click();

	Thread.sleep(2000);
	page1.getDeletesequence1().click();

	Thread.sleep(2000);
	page1.getDeletesequence2().click();

	// CONTACT HOME PAGE 
	// HOME PAGE EMAIL
	
	Thread.sleep(3000);
	JavascriptExecutor script1=(JavascriptExecutor)driver;
	script1.executeScript("window.scrollBy(0,-850)", "");
	WebElement ele1 =driver.findElement(By.xpath("(//*[text()='Email'])[3]")); 
	ele1.click();
	
	page1.getDeleteemail().click();
	
	//CONTACT HOME PAGE CALL
	Thread.sleep(4000);
	JavascriptExecutor script22=(JavascriptExecutor)driver;
	script22.executeScript("window.scrollBy(0,-250)", "");
	WebElement ele22=driver.findElement(By.xpath("//a[@title=' Calls']")); 
	ele22.click();
	
	page1.getCanclecall().click();
	
	//HOME PAGE SMS
	page1.getClicksms().click();
	page1.getDeletesms().click();
	
	
	//HOME PAGE NOTES 
	page1.getClicknotes().click();
	page1.getCanclenotes().click();
	
	//HOME PAGE FILES
	page1.getClickfiles().click();
	
	//HOME PAGE STATUS FIELD
	page1.getStatuslist().click();
	page1.getSelectstatusfield().click();
	
	//HOMEPAGE INDIVIDUALS HISTORY LIST
	page1.getHistorylist().click();
	page1.getSelectemail().click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}