package oncourse.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class accountspage {
	private WebDriver driver;
	
	public accountspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}	

	@FindBy(xpath=("//*[text()=' Company']"))
	private WebElement clickcompany;
	
	@FindBy(xpath=("//input[@name='company']"))
	private WebElement clickplaceholder;
	
	@FindBy(xpath=("(//*[text()='CREATE'])[2]"))
	private WebElement Create;
	
	@FindBy(xpath=("//img[@alt='logo']"))
	private WebElement clickaccounticon;
	
	@FindBy(xpath=("//*[text()=' Company']"))
	private WebElement clickcompany1;
	
	@FindBy(xpath=("//input[@name='company']"))
	private WebElement clickplaceholder1;
	
	@FindBy(xpath=("(//*[text()='CANCEL'])[3]"))
	private WebElement canclecompany;

	@FindBy(xpath=("//img[@alt='logo']"))
	private WebElement clickaccounticon1;
	
	@FindBy(xpath=("(//input[@placeholder='Search'])[2]"))
	private WebElement searchcompany;
	
	@FindBy(xpath=("//*[text()='Testing automation 3']"))
	private WebElement clickcompany2;
	
	@FindBy(xpath=("//*[text()='Delete Lead']"))
	private WebElement deleteleadpage;
	
	@FindBy(xpath=("//*[text()=' Yes - I am sure Delete ']"))
	private WebElement deletecompany;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getClickcompany() {
		return clickcompany;
	}

	public void setClickcompany(WebElement clickcompany) {
		this.clickcompany = clickcompany;
	}

	public WebElement getClickplaceholder() {
		return clickplaceholder;
	}

	public void setClickplaceholder(WebElement clickplaceholder) {
		this.clickplaceholder = clickplaceholder;
	}

	public WebElement getCreate() {
		return Create;
	}

	public void setCreate(WebElement create) {
		Create = create;
	}

	public WebElement getClickaccounticon() {
		return clickaccounticon;
	}

	public void setClickaccounticon(WebElement clickaccounticon) {
		this.clickaccounticon = clickaccounticon;
	}

	public WebElement getClickcompany1() {
		return clickcompany1;
	}

	public void setClickcompany1(WebElement clickcompany1) {
		this.clickcompany1 = clickcompany1;
	}

	public WebElement getClickplaceholder1() {
		return clickplaceholder1;
	}

	public void setClickplaceholder1(WebElement clickplaceholder1) {
		this.clickplaceholder1 = clickplaceholder1;
	}

	
	public WebElement getClickaccounticon1() {
		return clickaccounticon1;
	}

	public void setClickaccounticon1(WebElement clickaccounticon1) {
		this.clickaccounticon1 = clickaccounticon1;
	}

	public WebElement getSearchcompany() {
		return searchcompany;
	}

	public void setSearchcompany(WebElement searchcompany) {
		this.searchcompany = searchcompany;
	}

	public WebElement getClickcompany2() {
		return clickcompany2;
	}

	public void setClickcompany2(WebElement clickcompany2) {
		this.clickcompany2 = clickcompany2;
	}

	public WebElement getDeleteleadpage() {
		return deleteleadpage;
	}

	public void setDeleteleadpage(WebElement deleteleadpage) {
		this.deleteleadpage = deleteleadpage;
	}

	public WebElement getDeletecompany() {
		return deletecompany;
	}

	public void setDeletecompany(WebElement deletecompany) {
		this.deletecompany = deletecompany;
	}

	public WebElement getCanclecompany() {
		return canclecompany;
	}

	public void setCanclecompany(WebElement canclecompany) {
		this.canclecompany = canclecompany;
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
}
