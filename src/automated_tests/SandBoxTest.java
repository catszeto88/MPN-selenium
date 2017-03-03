package automated_tests;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
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
	System.setProperty("webdriver.gecko.driver","C:\\webDrivers\\geckodriver.exe");
	
	
	driver = new ChromeDriver();
		
	driver.get("https://sd2.tietronix.com/mpndx2016/");
	
	driver = InitialPopups.nominalPopups(browser);
	
	wait = new WebDriverWait(driver, 20);
	
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
		
		
		
	
	/*
	driver.findElement(By.id("male")).click();
	driver.findElement(By.id("female")).click();
	driver.findElement(By.id("diseases-y")).click();
	driver.findElement(By.id("diseases-n")).click();
	driver.findElement(By.id("diseases-u")).click();
	driver.findElement(By.id("BCR-y")).click();
	driver.findElement(By.id("BCR-n")).click();
	driver.findElement(By.id("BCR-u")).click();
	driver.findElement(By.id("hemoglobin-y")).click();
	driver.findElement(By.id("hemoglobin-n")).click();
	driver.findElement(By.id("hemoglobin-u")).click();
	driver.findElement(By.id("thrombocytosis-y")).click();
	driver.findElement(By.id("thrombocytosis-n")).click();
	driver.findElement(By.id("thrombocytosis-u")).click();
*/
	
	
  }

	private void assertEquals(String text, String string) {
		// TODO Auto-generated method stub
		
	}
}
