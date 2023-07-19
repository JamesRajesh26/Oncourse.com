package oncourse.objectRepo;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactpage {
	private WebDriver driver;
	
	public contactpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	
@FindBy(xpath=("(//input[@placeholder='Search'])[2]"))
private WebElement addcompany;

@FindBy(xpath=("//*[text()='Testing automation 2']"))
private WebElement searchcompany;	

//add address
@FindBy(xpath=("//*[text()='+ Add Address']"))
private WebElement clickaddress;

@FindBy(xpath=("(//*[text()=' Save '])[5]"))
private WebElement saveaddress3;

@FindBy(id=("address"))
private WebElement addaddress;
	
@FindBy(id=("address1"))
private WebElement addaddress2;
	
@FindBy(id=("country"))
private WebElement clickcountry;

@FindBy(id=("country"))
private WebElement countryname;

@FindBy(id=("state"))
private WebElement clickstate;

@FindBy(id=("state"))
private WebElement statename;


@FindBy(id=("city"))
private WebElement cityname;

@FindBy(id=("zipcode"))
private WebElement addzipcode;

@FindBy(xpath=("(//*[text()=' Save '])[5]"))
private WebElement saveaddress;

//Edit & save address
@FindBy(xpath=("(//*[text()='edit'])[1]"))
private WebElement editaddress;

@FindBy(xpath=("(//select[@name='country'])[2]"))
private WebElement editcountry;

@FindBy(xpath=("(//select[@name='country'])[2]"))
private WebElement editcountryname;

@FindBy(xpath=("(//select[@name='state'])[2]"))
private WebElement editstate;

@FindBy(xpath=("(//select[@name='state'])[2]"))
private WebElement editstatename;

@FindBy(xpath=("(//*[text()=' Save '])[6]"))
private WebElement saveeditadress;

@FindBy(xpath=("(//*[text()='delete'])[1]"))
private WebElement clickdeleteaddress;

@FindBy(xpath=("(//*[text()=' Cancel '] )[7]"))
private WebElement cancledeleteaddress;

@FindBy(xpath=("(//*[text()='delete'])[1]"))
private WebElement clickdeleteaddress1;

@FindBy(xpath=("(//button[text()=' Delete '])[1]"))
private WebElement deleteaddress;

//contact lead pages
@FindBy(xpath=("(//*[text()='add_circle_outline'])[3]"))
private WebElement addcontact;

@FindBy(xpath=("(//*[text()='Cancel'])[6]"))
private WebElement contactcancle;

@FindBy(xpath=("(//*[text()='add_circle_outline'])[3]"))
private WebElement addcontact1;

@FindBy(xpath=("(//input[@formcontrolname='contactName'])[2]"))
private WebElement contactname;

@FindBy(xpath=("(//input[@name='title'])[2]"))
private WebElement titlename;

@FindBy(xpath=("(//div[@class='iti__selected-flag'])[4]"))
private WebElement selectflag;

@FindBy(xpath=("(//*[text()='United States'])[8]"))
private WebElement flagname;

@FindBy(xpath=("(//input[@placeholder='(000)000-0000'])[2]"))
private WebElement addnumber;

@FindBy(xpath=("(//mat-select[@formcontrolname='phonetype'])[2]"))
private WebElement phonetype;

@FindBy(xpath=("//*[text()='Mobile']"))
private WebElement clickmobile;

@FindBy(xpath=("(//div[@class='iti__selected-flag'])[4]"))
private WebElement selectflag1;

@FindBy(xpath=("(//*[text()='India (भारत)'])[4]"))
private WebElement flagname1;

@FindBy(xpath=("(//input[@id='emails'])[2]"))
private WebElement clickemail;

@FindBy(xpath=("(//input[@id='emails'])[2]"))
private WebElement addemailID;

@FindBy(xpath=("(//*[text()='Save'])[5]"))
private WebElement savecontact;

@FindBy(xpath=("(//*[text()='more_horiz '])[1]"))
private WebElement clickhoriz;

@FindBy(xpath=("//*[text()=' Edit ']"))
private WebElement editcontact;

@FindBy(xpath=("(//input[@name='contactUrl'])[3]"))
private WebElement contacturl;

@FindBy(xpath=("(//input[@name='contactUrl'])[3]"))
private WebElement URLlink;

@FindBy(xpath=("(//*[text()=' Save '])[8]"))
private WebElement saveeditcontact;

@FindBy(xpath=("(//*[text()='more_horiz '])[1]"))
private WebElement clickhoriz1;

@FindBy(xpath=("(//i[@class='material-icons ed-icon'])[2]"))
private WebElement clickedit;

@FindBy(xpath=("(//*[text()=' Cancel '])[12]"))
private WebElement editcancle;

//@FindBy(xpath=("(//*[text()='more_horiz '])[1]"))
//private WebElement clickhoriz3;
//
//@FindBy(xpath=("(//*[text()=' Delete '])[6]"))
//private WebElement clickdelete;
//
//@FindBy(xpath=("(//*[text()=' Delete '] )[6]"))
//private WebElement Deletecontact;

@FindBy(xpath=("//*[text()=' Contact']"))
private WebElement clicknewcontact;

@FindBy(xpath=("(//*[text()='Cancel'])[3]"))
private WebElement  canclenewcontact; 

//CONTACT CREATE TASK
@FindBy(xpath=("(//*[text()='add_circle_outline'])[1]"))
private WebElement addtask;

@FindBy(xpath=("//*[text()=' Create ']"))
private WebElement createtask;

@FindBy(xpath=("//textarea[@placeholder='Task Description']"))
private WebElement cleartaskdescription;

@FindBy(xpath=("//textarea[@placeholder='Task Description']"))
private WebElement addtaskdescription;

@FindBy(xpath=("//*[text()='Select task type']"))
private WebElement clicktasktype;

@FindBy(xpath=("(//*[text()='Prospecting'])[1]"))
private WebElement addtasktype;

@FindBy(xpath=("//*[text()=' Create ']"))
private WebElement createtask1;

@FindBy(xpath=("(//*[text()='Medium'])[3]"))
private WebElement  clickaddpriority;

@FindBy(xpath=("//*[text()='High ']"))
private WebElement addhighPriority;

@FindBy(xpath=("(//*[text()=' Save '])[7]"))
private WebElement clicksave;

@FindBy(xpath=("(//*[text()='check'])[1]"))
private WebElement clickcheck;

@FindBy(xpath=("//*[text()='Need to follow up today']"))
private WebElement clickfollowup;

@FindBy(xpath=("//*[text()='Need to follow up today']"))
private WebElement clickfollowup1;

@FindBy(xpath=("//*[text()='Need to follow up today']"))
private WebElement  clickfollowup2;

@FindBy(xpath=("//*[text()='undo']"))
private WebElement clickundo;

@FindBy(xpath=("(//*[text()=' Cancel '])[8]"))
private WebElement clicktaskcancle;

@FindBy(xpath=("(//*[text()=' Delete '])[2]"))
private WebElement clicktaskdelete;


//CONTACT Create Deals
@FindBy(xpath=("(//*[text()='add_circle_outline'])[2]"))
private WebElement addDeal;

@FindBy(id=("addoppurtunitiesSave"))
private WebElement clicksavedeal;

@FindBy(xpath=("(//input[@formcontrolname='name'])[4]"))
private WebElement Dealname;

@FindBy(xpath=("//*[@placeholder='Select Contact']"))
private WebElement dealcontactPerson;

@FindBy(xpath=("(//*[text()='Automation '])[1]"))
private WebElement dealcontactname;

@FindBy(id=("pipeline-opp"))
private WebElement Dealpipeline;

@FindBy(xpath=("//*[text()='Production ']"))
private WebElement Pipelinename;

@FindBy(id=("status"))
private WebElement Dealstage;

@FindBy(xpath=("(//*[text()='1 '])[1]"))
private WebElement Stagename;

@FindBy(id=("oppvalue"))
private WebElement Dealvalues;

@FindBy(id=("userSelect"))
private WebElement DealOwner;

@FindBy(xpath=("(//textarea[@placeholder='Notes'])[2]"))
private WebElement DealNotes;

@FindBy(id=("addoppurtunitiesSave"))
private WebElement DealSave;

@FindBy(xpath=("(//*[text()=' Cricket '])[1]"))
private WebElement ClickDealName;

@FindBy(xpath=("(//*[text()='more_vert'])[1]"))
private WebElement ClickMoreVert;

@FindBy(xpath=("(//*[text()='Edit'])[1]"))
private WebElement DealEdit;

@FindBy(xpath=("(//input[@formcontrolname='name'])[4]"))
private WebElement ClearDealName;

@FindBy(xpath=("(//input[@formcontrolname='name'])[4]"))
private WebElement DealEditName;

@FindBy(xpath=("(//*[text()=' Save '])[8]"))
private WebElement DealEditSave;

//CONTACT WON DEALS
@FindBy(xpath=("(//*[text()=' Martin '])[1]"))
private WebElement ClickDealName1;

@FindBy(xpath=("//*[text()=' Won ']"))
private WebElement DealWon;

@FindBy(xpath=("(//*[text()=' Martin '])[1]"))
private WebElement ClickDealName2;

@FindBy(xpath=("(//div[@data-toggle='collapse'])[1]"))
private WebElement ClickWonStatus;

@FindBy(xpath=("(//*[text()=' Martin '])[1]"))
private WebElement ClickDealName3;

@FindBy(xpath=("//*[text()='Reopen']"))
private WebElement DealReopen;


//CONTACT LOST DEALS
@FindBy(xpath=("(//*[text()=' Martin '])[1] "))
private WebElement ClickDealName4;

@FindBy(xpath=("//*[text()=' Lost ']"))
private WebElement ClickDealLost;

@FindBy(xpath=("(//*[text()='Select Reason'])[1]"))
private WebElement DealLostReason;

@FindBy(xpath=("(//*[text()='Stopped Responding '])[1]"))
private WebElement DealsReasonNotes;

@FindBy(xpath=("(//textarea[@formcontrolname='name'])[1]"))
private WebElement DealLostNotes;

@FindBy(xpath=("(//textarea[@formcontrolname='name'])[1]"))
private WebElement DealLostNotesText;

@FindBy(xpath=("(//*[text()=' Cancel '])[13]"))
private WebElement DealLostCancle;

@FindBy(xpath=("//*[text()=' Lost ']"))
private WebElement ClickDealLost1;

@FindBy(xpath=("(//*[text()='Select Reason'])[1]"))
private WebElement DealLostReason1;

@FindBy(xpath=("(//*[text()='Stopped Responding '])[1]"))
private WebElement DealsReasonNotes1;

@FindBy(xpath=("(//textarea[@formcontrolname='name'])[1]"))
private WebElement DealLostNotes1;

@FindBy(xpath=("(//textarea[@formcontrolname='name'])[1]"))
private WebElement DealLostNotesText1;

@FindBy(xpath=("(//*[text()=' Mark as Lost '])[1]"))
private WebElement DealsLostButton;

@FindBy(xpath=("(//*[text()=' Martin '])[1]"))
private WebElement ClickDealName5;

@FindBy(xpath=("(//div[@data-toggle='collapse'])[1]"))
private WebElement DealLostStatus;

@FindBy(xpath=("(//*[text()=' Martin '])[1]"))
private WebElement ClickDealName6;

@FindBy(xpath=("//*[text()='Reopen']"))
private WebElement DealsLostReopen;

@FindBy(xpath=("(//*[text()=' Martin '])[1] "))
private WebElement ClickDealName7;

@FindBy(xpath=("(//*[text()='more_vert'])[1]"))
private WebElement ClickMoreVert1;

@FindBy(xpath=("(//*[text()='Delete'])[3]"))
private WebElement clickdelete1;

@FindBy(xpath=("(//*[text()=' Cancel '])[12]"))
private WebElement clickcanclebutton;

@FindBy(xpath=("(//*[text()='more_vert'])[1]"))
private WebElement ClickMoreVert2;

@FindBy(xpath=("(//*[text()='Delete'])[3]"))
private WebElement clickdelete2;

@FindBy(xpath=("(//*[text()=' Delete '])[5]"))
private WebElement deletedeals;

//CONTACT SEQUENCES 
@FindBy(xpath=("(//*[text()='add_circle_outline' ])[4]"))
private WebElement AddcontactSequences;

@FindBy(xpath=("//*[text()='Start']"))
private WebElement ClickStart;

@FindBy(xpath=("//*[text()='Select Sequence']"))
private WebElement SelectSequences;

@FindBy(xpath=("//*[text()=' sequences 1']"))
private WebElement AddSequencesName;

@FindBy(xpath=("(//div[@class=\"ng-select-container\"])[5]"))
private WebElement ClickSequencescontact;

@FindBy(xpath=("(//*[text()='Automation'])[1]"))
private WebElement AddSequencescontact;

@FindBy(xpath=("(//*[@formcontrolname='from'])[2]"))
private WebElement Clicksequencesfrom;

@FindBy(xpath=("(//*[text()='james@zibtek.in'])[2]"))
private WebElement AddsequencesemailID;

@FindBy(xpath=("//*[text()='Start']"))
private WebElement SequencesClickStart;

//CONTACT SEQUENCES EDIT
@FindBy(xpath=("//*[text()='View/Edit Sequence']"))
private WebElement ClickViewEditSquences;

@FindBy(xpath=("//*[text()='Pause Sequence']"))
private WebElement PauseSequences;

@FindBy(xpath=("(//*[text()='Cancel'])[7]"))
private WebElement CancelEditSequences;

@FindBy(xpath=("//*[text()='View/Edit Sequence']"))
private WebElement Clickeditsequences1;

@FindBy(xpath=("//*[text()='Resume']"))
private WebElement ClickResume;

@FindBy(xpath=("//*[text()='Pause Sequence']"))
private WebElement PauseSequences1;

@FindBy(xpath=("//*[text()='Delete Remainder']"))
private WebElement DeleteReminder;

@FindBy(xpath=("(//*[text()='Cancel'])[8]"))
private WebElement Cancleeditsequence1;

@FindBy(xpath=("(//*[text()='Cancel'])[7]"))
private WebElement CancleSequences;

//Add AnotherContact Sequences
@FindBy(xpath=("(//*[text()='Add another contact '])[1]"))
private WebElement AddAnotherContact;

@FindBy(xpath=("//mat-select[@placeholder='Select Sequence']"))
private WebElement AddSelectSequences;

@FindBy(xpath=("//*[text()=' james1']"))
private WebElement AddJames1;

@FindBy(xpath=("//*[text()='Start']"))
private WebElement Clickstart;

@FindBy(xpath=("(//div[@class=\"ng-select-container\"])[5]"))
private WebElement ClickContactSequences;

@FindBy(xpath=("(//*[text()='Automation'])[1]"))
private WebElement addcontactsequences;

@FindBy(xpath=("(//*[@formcontrolname='from'])[2]"))
private WebElement addcontactemailid;

@FindBy(xpath=("(//*[text()='james@zibtek.in'])[4]"))
private WebElement addemailid;

@FindBy(xpath=("//*[text()='Start']"))
private WebElement clickaddsequences;

//CONTACT VIEW SEQUENCES
@FindBy(xpath=("//*[text()='View in sequences']"))
private WebElement Clickviewsequences;

@FindBy(xpath=("//img[@alt='logo']"))
private WebElement clickaccountmodule;

@FindBy(xpath=("(//input[@placeholder='Search'])[2]"))
private WebElement searchcompany1;

@FindBy(xpath=("//*[text()='Testing automation 2']"))
private WebElement  addcompany1;

//CONTACT DELETE SEQUENCES
@FindBy(xpath=("//*[text()='View/Edit Sequence']"))
private WebElement Editsequences;

@FindBy(xpath=("//*[text()='Pause Sequence']"))
private WebElement PauseSequences2;

@FindBy(xpath=("//*[text()='Delete Remainder']"))
private WebElement deletereminder;

@FindBy(xpath=("(//*[text()='Delete'])[3]"))
private WebElement deletesequence;

@FindBy(xpath=("(//*[text()=' Delete '])[6]"))
private WebElement deletesequence1;

@FindBy(xpath=("(//*[text()='Delete'])[3]"))
private WebElement deletesequence2;

//CREATE CONTACT HOME PAGE
//HOME PAGE EMAIL

@FindBy(xpath=("//i[@class='material-icons deleteicon']"))
private WebElement deleteemail;

//CONTACT HOME PAGE CALL
@FindBy(xpath=("(//*[text()='Cancel'])[11]"))
private WebElement canclecall;

//HOME PAGE SMS
@FindBy(xpath=("//a[text()='SMS']"))
private WebElement clicksms;

@FindBy(xpath=("(//*[text()=' delete '])[1]"))
private WebElement deletesms;

//HOME PAGE NOTES 
@FindBy(xpath=("//a[text()='Notes']"))
private WebElement clicknotes;

@FindBy(xpath=("(//*[text()='Cancel'])[11]"))
private WebElement canclenotes;

@FindBy(xpath=("//*[text()='Files']"))
private WebElement clickfiles;

//HOME PAGE STATUS FIELD
@FindBy(id=("status-list"))
private WebElement statuslist;

@FindBy(xpath=("//*[text()=' Marketing Qualified ']"))
private WebElement selectstatusfield;

//HOMEPAGE INDIVIDUALS DATA PULL
@FindBy(xpath=("//mat-select[@id='history-list']"))
private WebElement historylist;

@FindBy(xpath=("//*[text()= ' Email']"))
private WebElement selectemail;













	
	
	
	

	
	
	
	
	
	
	
	
	


public WebElement getAddcompany() {
	return addcompany;
}

public WebElement getSaveaddress3() {
	return saveaddress3;
}

public void setSaveaddress3(WebElement saveaddress3) {
	this.saveaddress3 = saveaddress3;
}

public void setAddcompany(WebElement addcompany) {
	this.addcompany = addcompany;
}

public WebElement getSearchcompany() {
	return searchcompany;
}

public void setSearchcompany(WebElement searchcompany) {
	this.searchcompany = searchcompany;
}

public WebDriver getDriver() {
	return driver;
}

public void setDriver(WebDriver driver) {
	this.driver = driver;
}




public WebElement getClickaddress() {
	return clickaddress;
}

public void setClickaddress(WebElement clickaddress) {
	this.clickaddress = clickaddress;
}

public WebElement getAddaddress() {
	return addaddress;
}

public void setAddaddress(WebElement addaddress) {
	this.addaddress = addaddress;
}

public WebElement getAddaddress2() {
	return addaddress2;
}

public void setAddaddress2(WebElement addaddress2) {
	this.addaddress2 = addaddress2;
}

public WebElement getClickcountry() {
	return clickcountry;
}

public void setClickcountry(WebElement clickcountry) {
	this.clickcountry = clickcountry;
}

public WebElement getCountryname() {
	return countryname;
}

public void setCountryname(WebElement countryname) {
	this.countryname = countryname;
}

public WebElement getClickstate() {
	return clickstate;
}

public void setClickstate(WebElement clickstate) {
	this.clickstate = clickstate;
}

public WebElement getStatename() {
	return statename;
}

public void setStatename(WebElement statename) {
	this.statename = statename;
}

public WebElement getCityname() {
	return cityname;
}

public void setCityname(WebElement cityname) {
	this.cityname = cityname;
}

public WebElement getAddzipcode() {
	return addzipcode;
}

public void setAddzipcode(WebElement addzipcode) {
	this.addzipcode = addzipcode;
}


public WebElement getSaveaddress() {
	return saveaddress;
}

public void setSaveaddress(WebElement saveaddress) {
	this.saveaddress = saveaddress;
}

public WebElement getEditaddress() {
	return editaddress;
}

public void setEditaddress(WebElement editaddress) {
	this.editaddress = editaddress;
}

public WebElement getEditcountry() {
	return editcountry;
}

public void setEditcountry(WebElement editcountry) {
	this.editcountry = editcountry;
}

public WebElement getEditcountryname() {
	return editcountryname;
}

public void setEditcountryname(WebElement editcountryname) {
	this.editcountryname = editcountryname;
}

public WebElement getEditstate() {
	return editstate;
}

public void setEditstate(WebElement editstate) {
	this.editstate = editstate;
}

public WebElement getEditstatename() {
	return editstatename;
}

public void setEditstatename(WebElement editstatename) {
	this.editstatename = editstatename;
}

public WebElement getSaveeditadress() {
	return saveeditadress;
}

public void setSaveeditadress(WebElement saveeditadress) {
	this.saveeditadress = saveeditadress;
}

public WebElement getClickdeleteaddress() {
	return clickdeleteaddress;
}

public void setClickdeleteaddress(WebElement clickdeleteaddress) {
	this.clickdeleteaddress = clickdeleteaddress;
}

public WebElement getCancledeleteaddress() {
	return cancledeleteaddress;
}

public void setCancledeleteaddress(WebElement cancledeleteaddress) {
	this.cancledeleteaddress = cancledeleteaddress;
}

public WebElement getClickdeleteaddress1() {
	return clickdeleteaddress1;
}

public void setClickdeleteaddress1(WebElement clickdeleteaddress1) {
	this.clickdeleteaddress1 = clickdeleteaddress1;
}

public WebElement getDeleteaddress() {
	return deleteaddress;
}

public void setDeleteaddress(WebElement deleteaddress) {
	this.deleteaddress = deleteaddress;
}

public WebElement getAddcontact() {
	return addcontact;
}

public void setAddcontact(WebElement addcontact) {
	this.addcontact = addcontact;
}

public WebElement getContactcancle() {
	return contactcancle;
}

public void setContactcancle(WebElement contactcancle) {
	this.contactcancle = contactcancle;
}

public WebElement getAddcontact1() {
	return addcontact1;
}

public void setAddcontact1(WebElement addcontact1) {
	this.addcontact1 = addcontact1;
}

public WebElement getContactname() {
	return contactname;
}

public void setContactname(WebElement contactname) {
	this.contactname = contactname;
}

public WebElement getTitlename() {
	return titlename;
}

public void setTitlename(WebElement titlename) {
	this.titlename = titlename;
}

public WebElement getSelectflag() {
	return selectflag;
}

public void setSelectflag(WebElement selectflag) {
	this.selectflag = selectflag;
}

public WebElement getFlagname() {
	return flagname;
}

public void setFlagname(WebElement flagname) {
	this.flagname = flagname;
}

public WebElement getAddnumber() {
	return addnumber;
}

public void setAddnumber(WebElement addnumber) {
	this.addnumber = addnumber;
}

public WebElement getPhonetype() {
	return phonetype;
}

public void setPhonetype(WebElement phonetype) {
	this.phonetype = phonetype;
}

public WebElement getClickmobile() {
	return clickmobile;
}

public void setClickmobile(WebElement clickmobile) {
	this.clickmobile = clickmobile;
}

public WebElement getSelectflag1() {
	return selectflag1;
}

public void setSelectflag1(WebElement selectflag1) {
	this.selectflag1 = selectflag1;
}

public WebElement getFlagname1() {
	return flagname1;
}

public void setFlagname1(WebElement flagname1) {
	this.flagname1 = flagname1;
}

public WebElement getClickemail() {
	return clickemail;
}

public void setClickemail(WebElement clickemail) {
	this.clickemail = clickemail;
}

public WebElement getAddemailID() {
	return addemailID;
}

public void setAddemailID(WebElement addemailID) {
	this.addemailID = addemailID;
}

public WebElement getSavecontact() {
	return savecontact;
}

public void setSavecontact(WebElement savecontact) {
	this.savecontact = savecontact;
}

public WebElement getClickhoriz() {
	return clickhoriz;
}

public void setClickhoriz(WebElement clickhoriz) {
	this.clickhoriz = clickhoriz;
}

public WebElement getEditcontact() {
	return editcontact;
}

public void setEditcontact(WebElement editcontact) {
	this.editcontact = editcontact;
}

public WebElement getContacturl() {
	return contacturl;
}

public void setContacturl(WebElement contacturl) {
	this.contacturl = contacturl;
}

public WebElement getURLlink() {
	return URLlink;
}

public void setURLlink(WebElement uRLlink) {
	URLlink = uRLlink;
}

public WebElement getSaveeditcontact() {
	return saveeditcontact;
}

public void setSaveeditcontact(WebElement saveeditcontact) {
	this.saveeditcontact = saveeditcontact;
}

public WebElement getClickhoriz1() {
	return clickhoriz1;
}

public void setClickhoriz1(WebElement clickhoriz1) {
	this.clickhoriz1 = clickhoriz1;
}

public WebElement getClickedit() {
	return clickedit;
}

public void setClickedit(WebElement clickedit) {
	this.clickedit = clickedit;
}

public WebElement getEditcancle() {
	return editcancle;
}

public void setEditcancle(WebElement editcancle) {
	this.editcancle = editcancle;
}

//public WebElement getClickhoriz3() {
//	return clickhoriz3;
//}
//
//public void setClickhoriz3(WebElement clickhoriz3) {
//	this.clickhoriz3 = clickhoriz3;
//}
//
//public WebElement getClickdelete() {
//	return clickdelete;
//}
//
//public void setClickdelete(WebElement clickdelete) {
//	this.clickdelete = clickdelete;
//}
//
//public WebElement getDeletecontact() {
//	return Deletecontact;
//}
//
//public void setDeletecontact(WebElement deletecontact) {
//	Deletecontact = deletecontact;
//}



public WebElement getAddtask() {
	return addtask;
}

public WebElement getClicknewcontact() {
	return clicknewcontact;
}

public void setClicknewcontact(WebElement clicknewcontact) {
	this.clicknewcontact = clicknewcontact;
}

public WebElement getCanclenewcontact() {
	return canclenewcontact;
}

public void setCanclenewcontact(WebElement canclenewcontact) {
	this.canclenewcontact = canclenewcontact;
}

public void setAddtask(WebElement addtask) {
	this.addtask = addtask;
}

public WebElement getCreatetask() {
	return createtask;
}

public void setCreatetask(WebElement createtask) {
	this.createtask = createtask;
}

public WebElement getCleartaskdescription() {
	return cleartaskdescription;
}

public void setCleartaskdescription(WebElement cleartaskdescription) {
	this.cleartaskdescription = cleartaskdescription;
}

public WebElement getAddtaskdescription() {
	return addtaskdescription;
}

public void setAddtaskdescription(WebElement addtaskdescription) {
	this.addtaskdescription = addtaskdescription;
}

public WebElement getClicktasktype() {
	return clicktasktype;
}

public void setClicktasktype(WebElement clicktasktype) {
	this.clicktasktype = clicktasktype;
}

public WebElement getAddtasktype() {
	return addtasktype;
}

public void setAddtasktype(WebElement addtasktype) {
	this.addtasktype = addtasktype;
}

public WebElement getCreatetask1() {
	return createtask1;
}

public void setCreatetask1(WebElement createtask1) {
	this.createtask1 = createtask1;
}


public WebElement getClickaddpriority() {
	return clickaddpriority;
}

public void setClickaddpriority(WebElement clickaddpriority) {
	this.clickaddpriority = clickaddpriority;
}

public WebElement getAddhighPriority() {
	return addhighPriority;
}

public void setAddhighPriority(WebElement addhighPriority) {
	this.addhighPriority = addhighPriority;
}

public WebElement getClicksave() {
	return clicksave;
}

public void setClicksave(WebElement clicksave) {
	this.clicksave = clicksave;
}

public WebElement getClickcheck() {
	return clickcheck;
}

public void setClickcheck(WebElement clickcheck) {
	this.clickcheck = clickcheck;
}

public WebElement getClickfollowup() {
	return clickfollowup;
}

public void setClickfollowup(WebElement clickfollowup) {
	this.clickfollowup = clickfollowup;
}

public WebElement getClickfollowup1() {
	return clickfollowup1;
}

public void setClickfollowup1(WebElement clickfollowup1) {
	this.clickfollowup1 = clickfollowup1;
}


public WebElement getClickfollowup2() {
	return clickfollowup2;
}

public void setClickfollowup2(WebElement clickfollowup2) {
	this.clickfollowup2 = clickfollowup2;
}

public WebElement getClickundo() {
	return clickundo;
}

public void setClickundo(WebElement clickundo) {
	this.clickundo = clickundo;
}

public WebElement getClicktaskcancle() {
	return clicktaskcancle;
}

public void setClicktaskcancle(WebElement clicktaskcancle) {
	this.clicktaskcancle = clicktaskcancle;
}

public WebElement getClicktaskdelete() {
	return clicktaskdelete;
}

public void setClicktaskdelete(WebElement clicktaskdelete) {
	this.clicktaskdelete = clicktaskdelete;
}

public WebElement getAddDeal() {
	return addDeal;
}

public void setAddDeal(WebElement addDeal) {
	this.addDeal = addDeal;
}

public WebElement getClicksavedeal() {
	return clicksavedeal;
}

public void setClicksavedeal(WebElement clicksavedeal) {
	this.clicksavedeal = clicksavedeal;
}

public WebElement getDealname() {
	return Dealname;
}

public void setDealname(WebElement dealname) {
	Dealname = dealname;
}

public WebElement getDealcontactPerson() {
	return dealcontactPerson;
}

public void setDealcontactPerson(WebElement dealcontactPerson) {
	this.dealcontactPerson = dealcontactPerson;
}

public WebElement getDealcontactname() {
	return dealcontactname;
}

public void setDealcontactname(WebElement dealcontactname) {
	this.dealcontactname = dealcontactname;
}

public WebElement getDealpipeline() {
	return Dealpipeline;
}

public void setDealpipeline(WebElement dealpipeline) {
	Dealpipeline = dealpipeline;
}

public WebElement getPipelinename() {
	return Pipelinename;
}

public void setPipelinename(WebElement pipelinename) {
	Pipelinename = pipelinename;
}

public WebElement getDealstage() {
	return Dealstage;
}

public void setDealstage(WebElement dealstage) {
	Dealstage = dealstage;
}

public WebElement getStagename() {
	return Stagename;
}

public void setStagename(WebElement stagename) {
	Stagename = stagename;
}

public WebElement getDealvalues() {
	return Dealvalues;
}

public void setDealvalues(WebElement dealvalues) {
	Dealvalues = dealvalues;
}

public WebElement getDealOwner() {
	return DealOwner;
}

public void setDealOwner(WebElement dealOwner) {
	DealOwner = dealOwner;
}

public WebElement getDealNotes() {
	return DealNotes;
}

public void setDealNotes(WebElement dealNotes) {
	DealNotes = dealNotes;
}

public WebElement getDealSave() {
	return DealSave;
}

public void setDealSave(WebElement dealSave) {
	DealSave = dealSave;
}

public WebElement getClickDealName() {
	return ClickDealName;
}

public void setClickDealName(WebElement clickDealName) {
	ClickDealName = clickDealName;
}

public WebElement getClickMoreVert() {
	return ClickMoreVert;
}

public void setClickMoreVert(WebElement clickMoreVert) {
	ClickMoreVert = clickMoreVert;
}

public WebElement getDealEdit() {
	return DealEdit;
}

public void setDealEdit(WebElement dealEdit) {
	DealEdit = dealEdit;
}

public WebElement getClearDealName() {
	return ClearDealName;
}

public void setClearDealName(WebElement clearDealName) {
	ClearDealName = clearDealName;
}

public WebElement getDealEditName() {
	return DealEditName;
}

public void setDealEditName(WebElement dealEditName) {
	DealEditName = dealEditName;
}

public WebElement getDealEditSave() {
	return DealEditSave;
}

public void setDealEditSave(WebElement dealEditSave) {
	DealEditSave = dealEditSave;
}

public WebElement getClickDealName1() {
	return ClickDealName1;
}

public void setClickDealName1(WebElement clickDealName1) {
	ClickDealName1 = clickDealName1;
}

public WebElement getDealWon() {
	return DealWon;
}

public void setDealWon(WebElement dealWon) {
	DealWon = dealWon;
}

public WebElement getClickDealName2() {
	return ClickDealName2;
}

public void setClickDealName2(WebElement clickDealName2) {
	ClickDealName2 = clickDealName2;
}

public WebElement getClickWonStatus() {
	return ClickWonStatus;
}

public void setClickWonStatus(WebElement clickWonStatus) {
	ClickWonStatus = clickWonStatus;
}

public WebElement getClickDealName3() {
	return ClickDealName3;
}

public void setClickDealName3(WebElement clickDealName3) {
	ClickDealName3 = clickDealName3;
}

public WebElement getDealReopen() {
	return DealReopen;
}

public void setDealReopen(WebElement dealReopen) {
	DealReopen = dealReopen;
}

public WebElement getClickDealName4() {
	return ClickDealName4;
}

public void setClickDealName4(WebElement clickDealName4) {
	ClickDealName4 = clickDealName4;
}

public WebElement getClickDealLost() {
	return ClickDealLost;
}

public void setClickDealLost(WebElement clickDealLost) {
	ClickDealLost = clickDealLost;
}

public WebElement getDealLostReason() {
	return DealLostReason;
}

public void setDealLostReason(WebElement dealLostReason) {
	DealLostReason = dealLostReason;
}

public WebElement getDealsReasonNotes() {
	return DealsReasonNotes;
}

public void setDealsReasonNotes(WebElement dealsReasonNotes) {
	DealsReasonNotes = dealsReasonNotes;
}

public WebElement getDealLostNotes() {
	return DealLostNotes;
}

public void setDealLostNotes(WebElement dealLostNotes) {
	DealLostNotes = dealLostNotes;
}

public WebElement getDealLostNotesText() {
	return DealLostNotesText;
}

public void setDealLostNotesText(WebElement dealLostNotesText) {
	DealLostNotesText = dealLostNotesText;
}

public WebElement getDealLostCancle() {
	return DealLostCancle;
}

public void setDealLostCancle(WebElement dealLostCancle) {
	DealLostCancle = dealLostCancle;
}

public WebElement getClickDealLost1() {
	return ClickDealLost1;
}

public void setClickDealLost1(WebElement clickDealLost1) {
	ClickDealLost1 = clickDealLost1;
}

public WebElement getDealLostReason1() {
	return DealLostReason1;
}

public void setDealLostReason1(WebElement dealLostReason1) {
	DealLostReason1 = dealLostReason1;
}

public WebElement getDealsReasonNotes1() {
	return DealsReasonNotes1;
}

public void setDealsReasonNotes1(WebElement dealsReasonNotes1) {
	DealsReasonNotes1 = dealsReasonNotes1;
}

public WebElement getDealLostNotes1() {
	return DealLostNotes1;
}

public void setDealLostNotes1(WebElement dealLostNotes1) {
	DealLostNotes1 = dealLostNotes1;
}

public WebElement getDealLostNotesText1() {
	return DealLostNotesText1;
}

public void setDealLostNotesText1(WebElement dealLostNotesText1) {
	DealLostNotesText1 = dealLostNotesText1;
}

public WebElement getDealsLostButton() {
	return DealsLostButton;
}

public void setDealsLostButton(WebElement dealsLostButton) {
	DealsLostButton = dealsLostButton;
}

public WebElement getClickDealName5() {
	return ClickDealName5;
}

public void setClickDealName5(WebElement clickDealName5) {
	ClickDealName5 = clickDealName5;
}

public WebElement getDealLostStatus() {
	return DealLostStatus;
}

public void setDealLostStatus(WebElement dealLostStatus) {
	DealLostStatus = dealLostStatus;
}

public WebElement getClickDealName6() {
	return ClickDealName6;
}

public void setClickDealName6(WebElement clickDealName6) {
	ClickDealName6 = clickDealName6;
}

public WebElement getDealsLostReopen() {
	return DealsLostReopen;
}

public void setDealsLostReopen(WebElement dealsLostReopen) {
	DealsLostReopen = dealsLostReopen;
}

public WebElement getClickDealName7() {
	return ClickDealName7;
}

public void setClickDealName7(WebElement clickDealName7) {
	ClickDealName7 = clickDealName7;
}

public WebElement getClickMoreVert1() {
	return ClickMoreVert1;
}

public void setClickMoreVert1(WebElement clickMoreVert1) {
	ClickMoreVert1 = clickMoreVert1;
}

public WebElement getClickdelete1() {
	return clickdelete1;
}

public void setClickdelete1(WebElement clickdelete1) {
	this.clickdelete1 = clickdelete1;
}

public WebElement getClickcanclebutton() {
	return clickcanclebutton;
}

public void setClickcanclebutton(WebElement clickcanclebutton) {
	this.clickcanclebutton = clickcanclebutton;
}

public WebElement getClickMoreVert2() {
	return ClickMoreVert2;
}

public void setClickMoreVert2(WebElement clickMoreVert2) {
	ClickMoreVert2 = clickMoreVert2;
}

public WebElement getClickdelete2() {
	return clickdelete2;
}

public void setClickdelete2(WebElement clickdelete2) {
	this.clickdelete2 = clickdelete2;
}

public WebElement getDeletedeals() {
	return deletedeals;
}

public void setDeletedeals(WebElement deletedeals) {
	this.deletedeals = deletedeals;
}

public WebElement getAddcontactSequences() {
	return AddcontactSequences;
}

public void setAddcontactSequences(WebElement addcontactSequences) {
	AddcontactSequences = addcontactSequences;
}

public WebElement getClickStart() {
	return ClickStart;
}

public void setClickStart(WebElement clickStart) {
	ClickStart = clickStart;
}

public WebElement getSelectSequences() {
	return SelectSequences;
}

public void setSelectSequences(WebElement selectSequences) {
	SelectSequences = selectSequences;
}

public WebElement getAddSequencesName() {
	return AddSequencesName;
}

public void setAddSequencesName(WebElement addSequencesName) {
	AddSequencesName = addSequencesName;
}

public WebElement getClickSequencescontact() {
	return ClickSequencescontact;
}

public void setClickSequencescontact(WebElement clickSequencescontact) {
	ClickSequencescontact = clickSequencescontact;
}

public WebElement getAddSequencescontact() {
	return AddSequencescontact;
}

public void setAddSequencescontact(WebElement addSequencescontact) {
	AddSequencescontact = addSequencescontact;
}

public WebElement getClicksequencesfrom() {
	return Clicksequencesfrom;
}

public void setClicksequencesfrom(WebElement clicksequencesfrom) {
	Clicksequencesfrom = clicksequencesfrom;
}

public WebElement getAddsequencesemailID() {
	return AddsequencesemailID;
}

public void setAddsequencesemailID(WebElement addsequencesemailID) {
	AddsequencesemailID = addsequencesemailID;
}

public WebElement getSequencesClickStart() {
	return SequencesClickStart;
}

public void setSequencesClickStart(WebElement sequencesClickStart) {
	SequencesClickStart = sequencesClickStart;
}

public WebElement getClickViewEditSquences() {
	return ClickViewEditSquences;
}

public void setClickViewEditSquences(WebElement clickViewEditSquences) {
	ClickViewEditSquences = clickViewEditSquences;
}

public WebElement getPauseSequences() {
	return PauseSequences;
}

public void setPauseSequences(WebElement pauseSequences) {
	PauseSequences = pauseSequences;
}

public WebElement getCancelEditSequences() {
	return CancelEditSequences;
}

public void setCancelEditSequences(WebElement cancelEditSequences) {
	CancelEditSequences = cancelEditSequences;
}

public WebElement getClickeditsequences1() {
	return Clickeditsequences1;
}

public void setClickeditsequences1(WebElement clickeditsequences1) {
	Clickeditsequences1 = clickeditsequences1;
}

public WebElement getClickResume() {
	return ClickResume;
}

public void setClickResume(WebElement clickResume) {
	ClickResume = clickResume;
}

public WebElement getPauseSequences1() {
	return PauseSequences1;
}

public void setPauseSequences1(WebElement pauseSequences1) {
	PauseSequences1 = pauseSequences1;
}

public WebElement getDeleteReminder() {
	return DeleteReminder;
}

public void setDeleteReminder(WebElement deleteReminder) {
	DeleteReminder = deleteReminder;
}

public WebElement getCancleeditsequence1() {
	return Cancleeditsequence1;
}

public void setCancleeditsequence1(WebElement cancleeditsequence1) {
	Cancleeditsequence1 = cancleeditsequence1;
}

public WebElement getCancleSequences() {
	return CancleSequences;
}

public void setCancleSequences(WebElement cancleSequences) {
	CancleSequences = cancleSequences;
}

public WebElement getAddAnotherContact() {
	return AddAnotherContact;
}

public void setAddAnotherContact(WebElement addAnotherContact) {
	AddAnotherContact = addAnotherContact;
}

public WebElement getAddSelectSequences() {
	return AddSelectSequences;
}

public void setAddSelectSequences(WebElement addSelectSequences) {
	AddSelectSequences = addSelectSequences;
}

public WebElement getAddJames1() {
	return AddJames1;
}

public void setAddJames1(WebElement addJames1) {
	AddJames1 = addJames1;
}

public WebElement getClickstart() {
	return Clickstart;
}

public void setClickstart(WebElement clickstart) {
	Clickstart = clickstart;
}

public WebElement getClickContactSequences() {
	return ClickContactSequences;
}

public void setClickContactSequences(WebElement clickContactSequences) {
	ClickContactSequences = clickContactSequences;
}

public WebElement getAddcontactsequences() {
	return addcontactsequences;
}

public void setAddcontactsequences(WebElement addcontactsequences) {
	this.addcontactsequences = addcontactsequences;
}

public WebElement getAddcontactemailid() {
	return addcontactemailid;
}

public void setAddcontactemailid(WebElement addcontactemailid) {
	this.addcontactemailid = addcontactemailid;
}

public WebElement getAddemailid() {
	return addemailid;
}

public void setAddemailid(WebElement addemailid) {
	this.addemailid = addemailid;
}

public WebElement getClickaddsequences() {
	return clickaddsequences;
}

public void setClickaddsequences(WebElement clickaddsequences) {
	this.clickaddsequences = clickaddsequences;
}

public WebElement getClickviewsequences() {
	return Clickviewsequences;
}

public void setClickviewsequences(WebElement clickviewsequences) {
	Clickviewsequences = clickviewsequences;
}

public WebElement getClickaccountmodule() {
	return clickaccountmodule;
}

public void setClickaccountmodule(WebElement clickaccountmodule) {
	this.clickaccountmodule = clickaccountmodule;
}

public WebElement getSearchcompany1() {
	return searchcompany1;
}

public void setSearchcompany1(WebElement searchcompany1) {
	this.searchcompany1 = searchcompany1;
}

public WebElement getAddcompany1() {
	return addcompany1;
}

public void setAddcompany1(WebElement addcompany1) {
	this.addcompany1 = addcompany1;
}

public WebElement getEditsequences() {
	return Editsequences;
}

public void setEditsequences(WebElement editsequences) {
	Editsequences = editsequences;
}

public WebElement getPauseSequences2() {
	return PauseSequences2;
}

public void setPauseSequences2(WebElement pauseSequences2) {
	PauseSequences2 = pauseSequences2;
}

public WebElement getDeletereminder() {
	return deletereminder;
}

public void setDeletereminder(WebElement deletereminder) {
	this.deletereminder = deletereminder;
}

public WebElement getDeletesequence() {
	return deletesequence;
}

public void setDeletesequence(WebElement deletesequence) {
	this.deletesequence = deletesequence;
}

public WebElement getDeletesequence1() {
	return deletesequence1;
}

public void setDeletesequence1(WebElement deletesequence1) {
	this.deletesequence1 = deletesequence1;
}

public WebElement getDeletesequence2() {
	return deletesequence2;
}

public void setDeletesequence2(WebElement deletesequence2) {
	this.deletesequence2 = deletesequence2;
}

public WebElement getDeleteemail() {
	return deleteemail;
}

public void setDeleteemail(WebElement deleteemail) {
	this.deleteemail = deleteemail;
}

public WebElement getCanclecall() {
	return canclecall;
}

public void setCanclecall(WebElement canclecall) {
	this.canclecall = canclecall;
}

public WebElement getClicksms() {
	return clicksms;
}

public void setClicksms(WebElement clicksms) {
	this.clicksms = clicksms;
}

public WebElement getDeletesms() {
	return deletesms;
}

public void setDeletesms(WebElement deletesms) {
	this.deletesms = deletesms;
}

public WebElement getClicknotes() {
	return clicknotes;
}

public void setClicknotes(WebElement clicknotes) {
	this.clicknotes = clicknotes;
}

public WebElement getCanclenotes() {
	return canclenotes;
}

public void setCanclenotes(WebElement canclenotes) {
	this.canclenotes = canclenotes;
}

public WebElement getClickfiles() {
	return clickfiles;
}

public void setClickfiles(WebElement clickfiles) {
	this.clickfiles = clickfiles;
}

public WebElement getStatuslist() {
	return statuslist;
}

public void setStatuslist(WebElement statuslist) {
	this.statuslist = statuslist;
}

public WebElement getSelectstatusfield() {
	return selectstatusfield;
}

public void setSelectstatusfield(WebElement selectstatusfield) {
	this.selectstatusfield = selectstatusfield;
}

public WebElement getHistorylist() {
	return historylist;
}

public void setHistorylist(WebElement historylist) {
	this.historylist = historylist;
}

public WebElement getSelectemail() {
	return selectemail;
}

public void setSelectemail(WebElement selectemail) {
	this.selectemail = selectemail;
}



}
