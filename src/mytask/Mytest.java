package mytask;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Mytest {

	public static WebDriver driver;

	 String DOB;
	 
	public static void main(String[] args) throws InterruptedException {
		
		
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64\\chromedriver.exe");
			
			 ChromeOptions options = new ChromeOptions();

			 Map<String, Object> prefs = new HashMap<>();
			 
			 prefs.put("profile.default_content_setting_values.notifications", 1); 

			 options.setExperimentalOption("prefs", prefs);
			 
			 driver = new ChromeDriver(options); 
	
			 driver.get("https://qa-dataportal.greatergas.com");
			 
			 open op = new open();
			 op.opened(); 
			
//			 toggle Te = new toggle();
//			 Te.enable();
			
//			 createcase create = new createcase();
//			 create.cases();	
			 
//			 Batch$quality batch = new Batch$quality();
//			 batch.batchqualitycasee();
			 
//			 Emptyshift empty = new Emptyshift();
//			 empty.shiftconfirmation();
			 
			 Gasshifthistory history = new Gasshifthistory();
			 history.shifthistory();
			 
//			 Gasshift othergas = new Gasshift();
//			 othergas.Gas();
			 
//			 Peelofforder order = new Peelofforder();
//			 order.order();
			 
			 Gascalendar gascal = new Gascalendar();
			 gascal.calendar();
			 
		
	}
}
