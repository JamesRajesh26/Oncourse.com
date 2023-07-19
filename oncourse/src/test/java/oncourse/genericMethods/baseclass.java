package oncourse.genericMethods;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.support.PageFactory;

import oncourse.objectRepo.accountspage;
import oncourse.objectRepo.contactpage;
import oncourse.objectRepo.dealspage;
import oncourse.objectRepo.loginpage;

public class baseclass {

	    public    static WebDriver driver;
	    public Properties prop;
	    public Properties dataProp;
	    public String path="C:\\oncourse\\Oncourse.properties";
	    public void loadPropertiesFile() {
	   loginpage page =new loginpage(driver);
	   contactpage page1 = new contactpage(driver);
	 accountspage page2 = new accountspage(driver);
	  dealspage page3 = new dealspage(driver);
	 
	 prop=new Properties(); 
	        File propFile = new File(path);
	                                  
	        dataProp= new Properties();
	        File dataPropFile = new File(path);
	        
	       try {
	            FileInputStream    fis = new FileInputStream(dataPropFile);
	            dataProp.load(fis);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }	        
	        try {
	            FileInputStream    fis1 = new FileInputStream(propFile);
	            prop.load(fis1);
	        } catch (IOException e) { 
	            e.printStackTrace();
	        }
	    }
	    public WebDriver initializeAndOpenBrowser(String browserName) throws InterruptedException {
	        ChromeOptions options= new ChromeOptions();
	        options.addArguments("--disable-gpu");
	        options.addArguments("--remote-allow-origins=*");
	        FirefoxOptions options1 = new FirefoxOptions();
	        InternetExplorerOptions options2 = new InternetExplorerOptions();
	        if (browserName.equalsIgnoreCase("chrome")) {
	            driver = new ChromeDriver(options);
	        }else if(browserName.equalsIgnoreCase("firefox")) {
	            driver = new FirefoxDriver(options1);
	        }else if (browserName.equalsIgnoreCase("IE")) {
	            driver = new InternetExplorerDriver(options2);    
	        }
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	        driver.get(prop.getProperty("url"));
	    loginpage page = PageFactory.initElements(driver, loginpage.class);
	    contactpage page1 =PageFactory.initElements(driver, contactpage.class);
	    accountspage page2 =PageFactory.initElements(driver, accountspage.class);
	    dealspage page3 =PageFactory.initElements(driver, dealspage.class);
	    
	    //jobpage page1 =PageFactory.initElements(driver, jobpage.class);
	    //createuser user=PageFactory.initElements(driver, createuser.class);
	        return driver;
	    }
		
			
			
					


	





}











