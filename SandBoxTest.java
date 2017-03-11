package automated_tests;

import static org.testng.Assert.*;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SandBoxTest {

	public WebDriver driver;
	static String browser = "chrome";
	static WebDriverWait wait;
	static StringBuffer verificationErrors = new StringBuffer();
	
	@Test
	public void sandBoxTest() {
	System.setProperty("webdriver.chrome.driver","C:\\webDrivers\\chromedriver.exe");
	
	
	driver = new ChromeDriver();
		
	driver.get("https://sd2.tietronix.com/mpndx2016/#");
	
	driver = InitialPopups.nominalPopups(browser);
	
	wait = new WebDriverWait(driver, 20);
/*	//wait until the save button on the home page is available
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("save_data")));
	System.out.println("on home page");
	
	//Click Save button
	driver.findElement(By.className("save_data")).click();*/

	//Click Patient History form
	driver.findElement(By.xpath(".//*[@id='btn_PH']/div/a")).click();
	
	//Wait until the Patient History form appears
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='patient_feedback']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/label/span")));
		System.out.println("opened Patient History");
		
		//1
		
		//Click Male Button
		driver.findElement(By.xpath("html/body/section/form/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/label/span")).click();
		
		//Click Female button
		driver.findElement(By.xpath("//form[@id='patient_feedback']/div/div/div[2]/div[2]/div/div[2]/label")).click();
		
		//2
		
		//Click Yes Button
		driver.findElement(By.xpath("html/body/section/form/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/label/span")).click();
		
		//Click No Button
		driver.findElement(By.xpath("html/body/section/form/div[1]/div[1]/div[2]/div[3]/div[2]/div[2]/label/span")).click();
		
		//Click Unknown Button
		driver.findElement(By.xpath("html/body/section/form/div[1]/div[1]/div[2]/div[3]/div[2]/div[3]/label/span")).click();
		
		//3
		driver.findElement(By.xpath("html/body/section/form/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/label/span")).click();
		
		driver.findElement(By.xpath("html/body/section/form/div[1]/div[1]/div[2]/div[4]/div[2]/div[2]/label/span")).click();
	
		driver.findElement(By.xpath("html/body/section/form/div[1]/div[1]/div[2]/div[4]/div[2]/div[3]/label/span")).click();
		
		//4
		driver.findElement(By.xpath("html/body/section/form/div[1]/div[1]/div[2]/div[5]/div[3]/div[1]/label/span")).click();
		
		driver.findElement(By.xpath("html/body/section/form/div[1]/div[1]/div[2]/div[5]/div[3]/div[2]/label/span")).click();
		
		driver.findElement(By.xpath("html/body/section/form/div[1]/div[1]/div[2]/div[5]/div[3]/div[3]/label/span")).click();
		
		//5
		driver.findElement(By.xpath("html/body/section/form/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[1]/div[1]/div[2]/div[6]/div[1]/div[2]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[1]/div[1]/div[2]/div[6]/div[1]/div[3]/label/span")).click();
		
		
		//Next button
		driver.findElement(By.xpath("html/body/section/form/div[1]/div[3]/div[2]/a/span")).click();
		
		//Wait until the Clinical Presentation section shows up
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/section/form/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/label/span")));
		System.out.println("opened Clinical Presentation");
		
		//1
		driver.findElement(By.xpath("html/body/section/form/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/label/span")).click();
		
		//2
		driver.findElement(By.xpath("html/body/section/form/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[4]/label/span")).click();
		
		//3- hematocrit levels
		driver.findElement(By.xpath("html/body/section/form/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/div[2]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/div[3]/label/span")).click();
		
		//4 platelet count
		driver.findElement(By.xpath("html/body/section/form/div[2]/div[1]/div[2]/div[3]/div[3]/div[1]/div[1]/label")).click();
		driver.findElement(By.xpath("html/body/section/form/div[2]/div[1]/div[2]/div[3]/div[3]/div[1]/div[2]/label")).click();
		driver.findElement(By.xpath("html/body/section/form/div[2]/div[1]/div[2]/div[3]/div[3]/div[1]/div[3]/label")).click();
		
		//5 leukocyte count
		driver.findElement(By.xpath("html/body/section/form/div[2]/div[1]/div[2]/div[3]/div[4]/div[1]/div[1]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[2]/div[1]/div[2]/div[3]/div[4]/div[1]/div[2]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[2]/div[1]/div[2]/div[3]/div[4]/div[1]/div[3]/label/span")).click();
		
		//6 red blood cells
		driver.findElement(By.xpath("html/body/section/form/div[2]/div[1]/div[2]/div[3]/div[5]/div[1]/div[1]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[2]/div[1]/div[2]/div[3]/div[5]/div[1]/div[2]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[2]/div[1]/div[2]/div[3]/div[5]/div[1]/div[3]/label/span")).click();
		
		//7 serum 
		driver.findElement(By.xpath("html/body/section/form/div[2]/div[1]/div[2]/div[3]/div[6]/div[1]/div[1]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[2]/div[1]/div[2]/div[3]/div[6]/div[1]/div[2]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[2]/div[1]/div[2]/div[3]/div[6]/div[1]/div[3]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[2]/div[1]/div[2]/div[3]/div[6]/div[1]/div[4]/label/span")).click();
		
		//Next button
		driver.findElement(By.xpath("html/body/section/form/div[2]/div[3]/div[2]/a/span")).click();
		
		//Pop-up
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[18]/div[1]/span")));
		driver.findElement(By.xpath("html/body/div[18]/div[3]/div/button")).click();
				
		//Wait until the Bone Marrow Morphology section shows up
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/section/form/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/label/span")));
		System.out.println("opened Bone Marrow Morphology");
		//NEED TO GET 1A answers
		//1
		driver.findElement(By.xpath("html/body/section/form/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/label/span")).click();
		
		//1a
		
		//2
		driver.findElement(By.xpath("html/body/section/form/div[3]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[3]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[3]/div[1]/div[2]/div[2]/div[3]/div[1]/div[3]/label/span")).click();
		
		//3
		driver.findElement(By.xpath("html/body/section/form/div[3]/div[1]/div[2]/div[2]/div[4]/div[2]/div[1]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[3]/div[1]/div[2]/div[2]/div[4]/div[2]/div[2]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[3]/div[1]/div[2]/div[2]/div[4]/div[2]/div[3]/label/span")).click();
		
		//Next button
		driver.findElement(By.xpath("html/body/section/form/div[3]/div[3]/div[2]/a/span")).click();
		
		//Wait until the Specialized Laboratory Assessment
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/section/form/div[4]/div[1]/div[2]/div[2]/div[1]/div[1]/label/span")));
		System.out.println("opened Specialized Laboratory Assessment");
		
		//1
		driver.findElement(By.xpath("html/body/section/form/div[4]/div[1]/div[2]/div[2]/div[1]/div[1]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[4]/div[1]/div[2]/div[2]/div[1]/div[2]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[4]/div[1]/div[2]/div[2]/div[1]/div[3]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[4]/div[1]/div[2]/div[2]/div[1]/div[4]/label/span")).click();
		
		//2
		driver.findElement(By.xpath("html/body/section/form/div[4]/div[1]/div[2]/div[3]/div[1]/div[1]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[4]/div[1]/div[2]/div[3]/div[1]/div[2]/label")).click();
		driver.findElement(By.xpath("html/body/section/form/div[4]/div[1]/div[2]/div[3]/div[1]/div[3]/label/span")).click();
		
		//3-jak v617
		driver.findElement(By.xpath("html/body/section/form/div[4]/div[1]/div[2]/div[4]/div[1]/div[1]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[4]/div[1]/div[2]/div[4]/div[1]/div[2]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[4]/div[1]/div[2]/div[4]/div[1]/div[3]/label/span")).click();
		
		//4
		driver.findElement(By.xpath("html/body/section/form/div[4]/div[1]/div[2]/div[5]/div[1]/div[1]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[4]/div[1]/div[2]/div[5]/div[1]/div[2]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[4]/div[1]/div[2]/div[5]/div[1]/div[3]/label/span")).click();
		
		//5
		driver.findElement(By.xpath("html/body/section/form/div[4]/div[1]/div[2]/div[6]/div[1]/div[1]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[4]/div[1]/div[2]/div[6]/div[1]/div[2]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[4]/div[1]/div[2]/div[6]/div[1]/div[3]/label/span")).click();
		
		//6
		driver.findElement(By.xpath("html/body/section/form/div[4]/div[1]/div[2]/div[7]/div[1]/div[1]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[4]/div[1]/div[2]/div[7]/div[1]/div[2]/label/span")).click();
		driver.findElement(By.xpath("html/body/section/form/div[4]/div[1]/div[2]/div[7]/div[1]/div[3]/label/span")).click();
		
		//Next button
		driver.findElement(By.xpath("html/body/section/form/div[4]/div[3]/div[2]/a/span")).click();
		
		//wait until the save button on the home page is available
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".save_data_container")));
		//scroll down
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
	
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("black_bg")));
		driver.findElement(By.className("save_data")).click();

		//wait until input text is available
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[18]/div[2]/div[2]/input")));
		
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String fileName = "T-ALGORITHM-" + timeStamp;

		driver.findElement(By.xpath("html/body/div[18]/div[2]/div[2]/input")).sendKeys(fileName);
		driver.findElement(By.id("btnFileSave")).click();
		System.out.println("Saved file");
		
		//wait for MPN diagnosis button to appear
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ui-dialog-title")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("black_bg")));
		//scroll to element
	//	WebElement element = driver.findElement(By.xpath("//div[4]/div[2]/a/span"));
		//Actions actions = new Actions(driver);
	//	actions.moveToElement(element);
	//	actions.perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[4]/div[2]/a/span")));
		
		//click Mpn Diagnosis

		driver.findElement(By.xpath("//div[4]/div[2]/a/span")).click();

		System.out.println("Clicked MPN button");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[4]/div[2]/a/span")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("printable")));

		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[10]/div/span")));
		try {
			  assertEquals(driver.findElement(By.xpath("//div[2]/span[2]")).getText(), "Please confirm your inputs below before diagnosis. Incorrect inputs may result in incorrect diagnosis.");
			} catch (Error e) {
			  verificationErrors.append(e.toString());
			}
		
		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".nav_button.prev_continue.ready_button")));
		driver.findElement(By.cssSelector(".nav_button.prev_continue.ready_button")).click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#notification_text.notification_text")));
		/*try {
			  assertEquals("PMF", driver.findElement(By.cssSelector("#notification_text.notification_text")).getText());
			  System.out.println("Results correct");
			} catch (Error e) {
			  verificationErrors.append(e.toString());
			}*/
		
		String abc = driver.findElement(By.id("notification_text")).getText();
		
		System.out.println(abc);
		System.out.println(abc.equals("Please use the Edit Data button to review the following questions. Data will not be cleared.\n- Perform test for BCR-ABL to rule out Ph+ leukemia"));
		
		assertEquals(abc, "Please use the Edit Data button to review the following questions. Data will not be cleared.\n- Perform test for BCR-ABL to rule out Ph+ leukemia");


	

		//driver.findElement(By.xpath("//div[11]/div[3]/a/span")).sendKeys(Keys.RETURN);

	//	driver.findElement(By.xpath("html/body/div[10]/div[11]/div[3]/a/span")).click();
		/*((JavascriptExecutor)driver).executeScript("scroll(0,600)");
		WebElement elementA = driver.findElement(By.xpath("html/body/div[10]/div[11]/div[3]/a/span"));
		actions.moveToElement(elementA);
		actions.perform();
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[10]/div[11]/div[3]/a/span")));
	/*	WebElement elementA = driver.findElement(By.xpath("html/body/div[10]/div[11]/div[3]/a/span"));
		actions.moveToElement(elementA);
		actions.perform();
		driver.findElement(By.xpath("html/body/div[10]/div[11]/div[3]/a/span")).click();
		driver.findElement(By.xpath("//div[11]/div[3]/a/span")).click();*/
  }

}
