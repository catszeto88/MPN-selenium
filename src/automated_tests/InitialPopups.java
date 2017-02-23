package automated_tests;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import org.testng.annotations.Test;


import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class InitialPopups {
	
	public static WebDriver driver;
	static StringBuffer verificationErrors = new StringBuffer();
	static WebDriverWait wait;
	String browser;

	
	public static WebDriver nominalPopups(String browser) {
		beforeTest(browser);
		loadMPNPage();
		checkConsentToUseText();
		acceptConsentToUse();
		acceptTermsOfUse();
		clickInstructionsOverlay();
		
		return driver;
	}
	
	@Parameters("browser")
	@BeforeClass
	public static void beforeTest(String browser) {
	//set browser driver
		if (browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\webDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Set for browser " + browser);
		}
		else if (browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\webDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Set for browser " + browser);
		}
		else if (browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver","C:\\webDrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			System.out.println("Set for browser " + browser);
		}
		  //Opera and IE only work on Windows?
		 // System.setProperty("webdriver.opera.driver","/Users/catherineszeto/Documents/workspace/MPN/operadriver");
		 // driver = new OperaDriver();
		 // System.setProperty("webdriver.ie.driver","/Users/catherineszeto/Documents/workspace/MPN/IEDriverServer.exe");
		 // driver = new InternetExplorerDriver();
		else
		{
			System.out.println("Driver not configured for browser " + browser);
		}
		
		
		  wait = new WebDriverWait(driver, 20);
	//set base URL
		  
	  }

	public static void loadMPNPage() {
		driver.get("https://sd2.tietronix.com/mpndx2016/");
	}
	
 @Test (priority = 0)
 	public static void checkConsentToUseText() {
	  
	 loadMPNPage();
	 try {
		  assertEquals("This application is intended for use by licensed healthcare practitioners and is prepared in English only. At this time, application use should be limited to those countries accepting labeling in English for professional use - United Kingdom, Ireland, Cyprus, Luxembourg, Malta, Poland, Bulgaria, and Latvia. This application was validated to the most recent browser capability at the time of launch - if this application is not working on your browser please contact trd_ussc.complaints@novartis.com.", driver.findElement(By.cssSelector("#ui-id-1 > div.next_text.mt40 > span")).getText());
		  System.out.println("Consent to Use text is correct");
		} catch (Error e) {
		  verificationErrors.append(e.toString());
		}
  }
	@Test (priority = 1)
	public void rejectConsentToUse() {
		driver.findElement(By.id("btnDoNotConsent")).click();
		
		//TODO: Look into $.tablesorter is undefined Javascript error
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("no_html5")));
		
		try {
		  assertEquals("This application can only be used after accepting the Terms of Use and Privacy Policy", driver.findElement(By.cssSelector("span")).getText());
		  System.out.println("Rejected terms of use warning text correct");
		} catch (Error e) {
		  verificationErrors.append(e.toString());
		}
  }
  
  @Test (priority = 2)
  	public static void acceptConsentToUse() {
	  loadMPNPage();
	  driver.findElement(By.id("btnUnderstandAndConsent")).click();
	  System.out.println("Accepted Consent to Use");
  }
  
  @Test (priority =3)
  	public void rejectTermsOfUse() {
	  driver.findElement(By.id("btnRejectTerms")).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("no_html5")));
		
		try {
		  assertEquals("This application can only be used after accepting the Terms of Use and Privacy Policy", driver.findElement(By.cssSelector("span")).getText());
		  System.out.println("Rejected terms of use warning text correct");
		} catch (Error e) {
		  verificationErrors.append(e.toString());
		}
  	}
  
  @Test (priority = 4)
  	public static void acceptTermsOfUse() {
	  loadMPNPage();
	  driver.findElement(By.id("btnAcceptTerms")).click();
	  System.out.println("Accepted Terms of Use");
  	}
  
  @Test (priority = 5)
  	public static void clickInstructionsOverlay() {
    //Wait until the instructions overlay to show up before clicking it

    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("instructionsOverlayHeader")));
    driver.findElement(By.className("instructionsOverlayHeader")).click();
    
    
    //Wait until the instructions overlay disappears before continuing
    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("instructionsOverlayHeader")));
    System.out.println("Closed instructions overlay");
  	}
  
  @Test (priority = 6 )
	public void quiz() {
	    //Click Patient History form
	driver.findElement(By.xpath(".//*[@id='btn_PH']/div/a")).click();
	
	//Wait until the Patient History form appears
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='patient_feedback']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/label/span")));
	System.out.println("opened Patient History");
	
    try {
	  assertEquals("Female", driver.findElement(By.xpath("//form[@id='patient_feedback']/div/div/div[2]/div[2]/div/div[2]/label")).getText());
	} catch (Error e) {
	  verificationErrors.append(e.toString());
	System.out.println("Verification Errors:" + verificationErrors.toString());
	}
    
    //Click Female button
	driver.findElement(By.xpath("//form[@id='patient_feedback']/div/div/div[2]/div[2]/div/div[2]/label")).click();

	}
  
  	@Test 
  	public void closeDriver() {
  		driver.quit();
  	}


}
