	package oncourse.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
private WebDriver driver;


public loginpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
// Signing Page
@FindBy(id=("email"))	
private WebElement LoginID;

@FindBy(id=("pwd"))
private WebElement LoginPassword;

@FindBy(className=("sign-btn"))
private WebElement Signin;

@FindBy(id=("pwd"))
private WebElement ClearPassword;

@FindBy(id=("email"))
private WebElement ClearEmail;

@FindBy(id=("email"))
private WebElement AddEmail;

@FindBy(id=("pwd"))
private WebElement AddPassword;

@FindBy(className=("sign-btn"))
private WebElement Signin1;

@FindBy(id=("email"))
private WebElement ClearEmail1;
	
@FindBy(id=("email"))	
private WebElement AddEmail1;
	
@FindBy(id=("pwd"))
private WebElement ClearPassword1;
	
@FindBy(id=("pwd"))
private WebElement AddPassword1;
	
@FindBy(className=("sign-btn"))
private WebElement Signin2;
	
@FindBy(xpath=("//*[text()='Forgot Password?']"))
private WebElement ClickForgotPassword;
	
@FindBy(xpath=("//input[@name='email']"))	
private WebElement AddEmail2;
	
@FindBy(xpath=("//*[text()='Reset Password']"))	
private WebElement ResetPassword;
	
@FindBy(xpath=("//input[@name='email']"))
private WebElement ClearEmail2;
	
@FindBy(xpath=("//input[@name='email']"))
private WebElement AddEmail3;

@FindBy(xpath=("//*[text()='Reset Password']"))
private WebElement ResetPassword1;
	
@FindBy(xpath=("//*[text()='Back to Sign in']"))
private WebElement BackToSignin;  

@FindBy(id=("email"))	
private WebElement AddEmail4;
	
@FindBy(id=("pwd"))
private WebElement AddPassword2;
	
@FindBy(xpath=("//*[text()='visibility_off']"))
private WebElement Visibilityoff;
	
@FindBy(xpath=("(//*[text()='visibility'])[1]"))
private WebElement VisilibityOn;
	
@FindBy(className=("sign-btn"))
private WebElement Signin3;
	











public WebElement getLoginID() {
	return LoginID;
}

public void setLoginID(WebElement loginID) {
	LoginID = loginID;
}

public WebElement getLoginPassword() {
	return LoginPassword;
}

public void setLoginPassword(WebElement loginPassword) {
	LoginPassword = loginPassword;
}

public WebElement getSignin() {
	return Signin;
}

public void setSignin(WebElement signin) {
	Signin = signin;
}

public WebElement getClearPassword() {
	return ClearPassword;
}

public void setClearPassword(WebElement clearPassword) {
	ClearPassword = clearPassword;
}

public WebElement getClearEmail() {
	return ClearEmail;
}

public void setClearEmail(WebElement clearEmail) {
	ClearEmail = clearEmail;
}

public WebElement getAddEmail() {
	return AddEmail;
}

public void setAddEmail(WebElement addEmail) {
	AddEmail = addEmail;
}

public WebElement getAddPassword() {
	return AddPassword;
}

public void setAddPassword(WebElement addPassword) {
	AddPassword = addPassword;
}

public WebElement getSignin1() {
	return Signin1;
}

public void setSignin1(WebElement signin1) {
	Signin1 = signin1;
}

public WebElement getClearEmail1() {
	return ClearEmail1;
}

public void setClearEmail1(WebElement clearEmail1) {
	ClearEmail1 = clearEmail1;
}

public WebElement getAddEmail1() {
	return AddEmail1;
}

public void setAddEmail1(WebElement addEmail1) {
	AddEmail1 = addEmail1;
}

public WebElement getClearPassword1() {
	return ClearPassword1;
}

public void setClearPassword1(WebElement clearPassword1) {
	ClearPassword1 = clearPassword1;
}

public WebElement getAddPassword1() {
	return AddPassword1;
}

public void setAddPassword1(WebElement addPassword1) {
	AddPassword1 = addPassword1;
}

public WebElement getSignin2() {
	return Signin2;
}

public void setSignin2(WebElement signin2) {
	Signin2 = signin2;
}

public WebElement getClickForgotPassword() {
	return ClickForgotPassword;
}

public void setClickForgotPassword(WebElement clickForgotPassword) {
	ClickForgotPassword = clickForgotPassword;
}

public WebElement getAddEmail2() {
	return AddEmail2;
}

public void setAddEmail2(WebElement addEmail2) {
	AddEmail2 = addEmail2;
}

public WebElement getResetPassword() {
	return ResetPassword;
}

public void setResetPassword(WebElement resetPassword) {
	ResetPassword = resetPassword;
}

public WebElement getClearEmail2() {
	return ClearEmail2;
}

public void setClearEmail2(WebElement clearEmail2) {
	ClearEmail2 = clearEmail2;
}

public WebElement getAddEmail3() {
	return AddEmail3;
}

public void setAddEmail3(WebElement addEmail3) {
	AddEmail3 = addEmail3;
}

public WebElement getResetPassword1() {
	return ResetPassword1;
}

public void setResetPassword1(WebElement resetPassword1) {
	ResetPassword1 = resetPassword1;
}

public WebElement getBackToSignin() {
	return BackToSignin;
}

public void setBackToSignin(WebElement backToSignin) {
	BackToSignin = backToSignin;
}

public WebElement getAddEmail4() {
	return AddEmail4;
}

public void setAddEmail4(WebElement addEmail4) {
	AddEmail4 = addEmail4;
}

public WebElement getAddPassword2() {
	return AddPassword2;
}

public void setAddPassword2(WebElement addPassword2) {
	AddPassword2 = addPassword2;
}

public WebElement getVisibilityoff() {
	return Visibilityoff;
}

public void setVisibilityoff(WebElement visibilityoff) {
	Visibilityoff = visibilityoff;
}

public WebElement getVisilibityOn() {
	return VisilibityOn;
}

public void setVisilibityOn(WebElement visilibityOn) {
	VisilibityOn = visilibityOn;
}

public WebElement getSignin3() {
	return Signin3;
}

public void setSignin3(WebElement signin3) {
	Signin3 = signin3;
}
}
