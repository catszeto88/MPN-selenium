package automated_tests;

import org.testng.annotations.Test;


import static org.junit.Assert.assertEquals;

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
	
	public WebDriver driver;
	 
	@Parameters("browser")
	@BeforeClass
	public void beforeTest(String browser) {
		
		
	//set browser driver
		if (browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","/Users/catherineszeto/Documents/workspace/MPN/geckodriver");
			driver = new FirefoxDriver();
			System.out.println("Set for browser " + browser);
		}
		else if (browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","/Users/catherineszeto/Documents/workspace/MPN/chromedriver");
			driver = new ChromeDriver();
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
		
	//set base URL
		  driver.get("https://sd2.tietronix.com/mpndx2016/");
	  }
	
  @Test(priority = 0)
  public void acceptConsentToUse() {
	  driver.findElement(By.id("btnUnderstandAndConsent")).click();
	  System.out.println("Accepted Consent to Use");
  }
  
  @Test(priority = 1)
  public void acceptTermsOfUse() {
	  driver.findElement(By.id("btnAcceptTerms")).click();
	  System.out.println("Accepted Terms of Use");
  }
  
  @Test(priority = 2)
  public void clickInstructionsOverlay() {
    //Wait until the instructions overlay to show up before clicking it
    WebDriverWait wait = new WebDriverWait(driver, 20);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("instructionsOverlayHeader")));
    driver.findElement(By.className("instructionsOverlayHeader")).click();
    
    
    //Wait until the instructions overlay disappears before continuing
    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("instructionsOverlayHeader")));
    System.out.println("Closed instructions overlay");
  }
  
  @Test(priority = 3)
  public void main() {
    //Click Patient History form
    driver.findElement(By.xpath(".//*[@id='btn_PH']/div/a")).click();
    
    //Wait until the Patient History form appears
    WebDriverWait wait = new WebDriverWait(driver, 20);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='patient_feedback']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/label/span")));
    System.out.println("opened Patient History");
    
    
    StringBuffer verificationErrors = new StringBuffer();
    try {
    	  assertEquals("Female", driver.findElement(By.xpath("//form[@id='patient_feedback']/div/div/div[2]/div[2]/div/div[2]/label")).getText());
    	} catch (Error e) {
    	  verificationErrors.append(e.toString());
    	}
    driver.findElement(By.xpath("//form[@id='patient_feedback']/div/div/div[2]/div[2]/div/div[2]/label")).click();
    System.out.println("Verification Errors:" + verificationErrors.toString());
  }


}
