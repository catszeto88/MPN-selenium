package automated_tests;

import org.openqa.selenium.WebDriver;
import automated_tests.InitialPopups;
import automated_tests.ExcelUtils;

public class AlgorithmTests {
	
	public static WebDriver driver;

	static String path = "C://MPN-selenium//src//automated_tests//MPN_Automated_Tests.xlsx";
	static String browser = "chrome";
	static String[][] testData;
	
	public static void main(String args[]) throws Exception {
		//Close all the popups and overlays upon loading the site, and get the WebDriver
		driver = InitialPopups.nominalPopups(browser);
		ExcelUtils.setExcelFile(path);
		testData = ExcelUtils.getTestData();
		System.out.println(testData[0][0]);
	}
}
