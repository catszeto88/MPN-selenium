package automated_tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.*;

public class SandBox {

	public static void main(String[] args) {
		
		//driver.findElement(By.xpath("html/body/div[18]/div[2]/div/span"));
		
		/*driver.findElement(By.id("btnUnderstandAndConsent")).click();
	    driver.findElement(By.id("btnAcceptTerms")).click();
	    
	    //Wait until the instructions overlay to show up before clicking it
	    WebDriverWait wait = new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("instructionsOverlayHeader")));
	    driver.findElement(By.className("instructionsOverlayHeader")).click();
	    
	    
	    //Wait until the instructions overlay disappears before continuing
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("instructionsOverlayHeader")));
	    System.out.println("Closed instructions overlay");
	    
	    //Click Patient History form
	    driver.findElement(By.xpath(".//*[@id='btn_PH']/div/a")).click();
	    
	    //Wait until the Patient History form appears
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
	    //   driver.findElement(By.id("female")).click();
	   
/*	    try {
	      assertEquals("Female", driver.findElement(By.xpath("//form[@id='patient_feedback']/div/div/div[2]/div[2]/div/div[2]/label/span")).getText());
	    } catch (Error e) {
	      verificationErrors.append(e.toString());
	    }
*/
	}

}
