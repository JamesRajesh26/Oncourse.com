package oncourse.objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dealspage {
	private WebDriver  driver;
	
	public dealspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath=("//img[@mattooltip='Deals']"))
	private WebElement clickdealsicon;
	
	@FindBy(xpath=("//*[text()=' Deal']"))
	private WebElement clickdealmodule;
	
	@FindBy(xpath=("(//*[text()='CREATE'])[2]"))
	private WebElement createdeal;
	
	@FindBy(xpath=("(//input[@type='text'])[9]"))
	private WebElement searcdealhcompany;
	
	@FindBy(xpath=("(//input[@type='text'])[9]"))
	private WebElement adddealcompany;

	@FindBy(xpath=("//*[text()='Testing automation 2']"))
	private WebElement clickdealcompany;

	@FindBy(id=("dealName"))
	private WebElement dealname;
	
	@FindBy(id=("pipeValue"))
	private WebElement dealpipeline;
	
	@FindBy(xpath=("//*[text()=' Prospeting ']"))
	private WebElement addpipelinename;

	@FindBy(id=("stageValue"))
	private WebElement stagename;
	
	@FindBy(xpath=("//*[text()='1 ']"))	
	private WebElement addstagename;
	
	@FindBy(xpath=("(//input[@type='text'])[12]"))
	private WebElement dealowner;
	
	@FindBy(xpath=("//*[text()=' James Martin ']"))
	private WebElement dealownername;
	
	@FindBy(id=("oppvalue"))
	private WebElement addoppvalue;
	
	@FindBy(xpath=("(//textarea[@placeholder='Notes'])[1]"))
	private WebElement adddealnotes;
	
	@FindBy(xpath=("(//*[text()='CREATE'])[2]"))
	private WebElement clickdealcreate;
	
	@FindBy(xpath=("(//*[text()='Sales'])[1]"))
	private WebElement clickpipeline;
	
	@FindBy(xpath=("//*[text()=' Prospeting ']"))
	private WebElement addpipelinename1;
	
// PIPELINE CREATE
	
	@FindBy(xpath=("(//*[text()=' add '])[1]"))
	private WebElement addpipedeal;
	
	@FindBy(xpath=("(//*[text()='CREATE'])[5]"))
	private WebElement clickpipelinecreate; 
	
	@FindBy(xpath=("(//input[@role='combobox'])[15]"))
	private WebElement addcompany;
	
	@FindBy (xpath=("//*[text()='Testing automation 2']"))
	private WebElement addcompanyname;
	
	@FindBy(xpath=("(//input[@placeholder='Name'])[2]"))
	private WebElement dealname1;
	
	@FindBy(xpath=("(//input[@placeholder='Name'])[2]"))
	private WebElement adddealname;
	
	@FindBy(xpath=("(//div[@class='ng-input'])[16]"))
	private WebElement dealcontact;
	
	@FindBy(xpath=("(//div[@class='ng-input'])[16]"))
	private WebElement dealcontact1;
	
	@FindBy(xpath=("(//input[@formcontrolname='oppvalue'])[2]"))
	private WebElement addvalues;
	
	@FindBy(xpath=("(//input[@type='text'])[29]"))
	private WebElement pipelineowner;
	
	@FindBy(xpath=("//*[text()=' James Martin ']"))
	private WebElement pilelineownername;
	
	@FindBy(xpath=("(//textarea[@formcontrolname='comments'])[2]"))
	private WebElement commentsnotes;
	
	@FindBy(xpath=("(//*[text()='CREATE'])[5]"))
	private WebElement  createpileline;
	
	@FindBy(xpath=("(//*[text()='Sales'])[1]"))
	private WebElement clicksales;
	
	@FindBy(xpath=("//*[text()=' Prospeting ']"))
	private WebElement clickprospeting;
	
	@FindBy(xpath=("(//*[text()='Ice Cream'])[2]"))
	private WebElement clickdealname;
	
	@FindBy(xpath=("//*[text()= ' Add Task ']"))
	private WebElement adddealtask;
	
	@FindBy(xpath=("//*[text()='Select task type']"))
	private WebElement tasktype;
	
	@FindBy(xpath=("//*[text()=' Inbound ']"))
	private WebElement addinbound;
	
	@FindBy(xpath=("(//span[@class='ng-arrow-wrapper'])[8]"))
	private WebElement assigneduser;
	
	@FindBy(xpath=("//*[text()=' James Martin']"))
	private WebElement addassigneduser;
	
	@FindBy(xpath=("(//textarea[@name='description'])[3]"))
	private WebElement  adddescription; 
	
	@FindBy(id=("Button"))
	private WebElement clickcreate;
	
	@FindBy(xpath=("(//textarea[@type='text'])[6]"))
	private WebElement clickcomment;
	
	@FindBy(id=("ButtonOne"))
	private WebElement addcomment;
	
	@FindBy(xpath=("//*[text()='Won']"))
	private WebElement clickwon;
	
	@FindBy(xpath=("//img[@alt='logo']"))
	private WebElement clickaccounticon;
	
	@FindBy(xpath=("(//input[@placeholder='Search'])[2]"))
	private WebElement searchcompany;
	
	@FindBy(xpath=("//*[text()='Testing automation 2']"))
	private WebElement addcompany1;
	
	@FindBy(xpath=("(//*[text()=' Ice Cream '])[1]"))
	private WebElement clickdealname1;
	
	@FindBy(xpath=("//*[text()='Reopen']"))
	private WebElement dealreopen;
	
	@FindBy(xpath=("//img[@mattooltip='Deals']"))
	private WebElement clickdealsicon1;
	
	@FindBy(xpath=("(//*[text()='Sales'])[1]"))
	private WebElement clicksale;
	
	@FindBy(xpath=("//*[text()=' Prospeting ']"))
	private WebElement clickprospeting1;
	
	@FindBy(xpath=("(//*[text()='Ice Cream'])[1]"))
	private WebElement clickdealname2;
	
	@FindBy(xpath=("//*[text()='Lost']"))
	private WebElement clicklost;
	
	@FindBy(xpath=("//*[text()='Select Reason']"))
	private WebElement selectreason;
	
	@FindBy(xpath=("//*[text()='Stopped Responding ']"))
	private WebElement stopresponding;
	
	@FindBy(xpath=("//textarea[@name='lostreasonNote']"))
	private WebElement lostreasonnote;
	
	@FindBy(xpath=("(//*[text()=' Cancel '])[5]"))
	private WebElement canclelost;
	
	@FindBy(xpath=("//*[text()='Lost']"))
	private WebElement clicklost1;
	
	@FindBy(xpath=("//textarea[@name='lostreasonNote']"))
	private WebElement lostreasonnotes;
	
	@FindBy(xpath=("//*[text()=' Mark as Lost ']"))
	private WebElement clickmarklost;
	
	@FindBy(xpath=("//img[@alt='logo']"))
	private WebElement clickaccounticon1;
	
	@FindBy(xpath=("(//input[@placeholder='Search'])[2]"))
	private WebElement searchcompany1;
	
	@FindBy(xpath=("//*[text()='Testing automation 2']"))
	private WebElement addcompany2;
	
	@FindBy(xpath=("//*[text()=' Ice Cream ']"))
	private WebElement clickdealname3;
	
	@FindBy(xpath=("//*[text()='Reopen']"))
	private WebElement dealreopen1;
	
	@FindBy(xpath=("//img[@mattooltip='Deals']"))
	private WebElement clickdealicon;
	
	@FindBy(xpath=("(//*[text()='Sales'])[1]"))
	private WebElement clicksales1;

	@FindBy(xpath=("//*[text()=' Prospeting ']"))
	private WebElement clickprospeting2;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}













