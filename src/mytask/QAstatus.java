package mytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class QAstatus  extends Mytest{
	
	public void status() throws InterruptedException {
		
		driver.findElement(By.id("otherSection")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.id("qa_status")).click();
		
		Thread.sleep(300);
		
		driver.findElement(By.id("addRecords")).click();
		
		Thread.sleep(300);
		
		try {
			
			WebElement QAfacility = driver.findElement(By.id("facilityInput"));
			QAfacility.click();
			
			Select QAfacilitydrop = new Select(driver.findElement(By.xpath("(//div[contains(@class,'position-relative w-100')]//ul)[1]")));
			QAfacilitydrop.selectByIndex(1);
			
			Thread.sleep(300);
			
			WebElement QAprovider = driver.findElement(By.id("providerInput"));
			QAprovider.click();
			
			Thread.sleep(500);
			
			driver.findElement(By.id("providerSearch")).sendKeys("test_ob"); 
			
			Select QAproviderdrop = new Select(driver.findElement(By.xpath("//label[@for='selectAllProviders']//strong[1]")));
			QAproviderdrop.selectByIndex(1);
			
			WebElement QAdrop = driver.findElement(By.id("qaInput"));
			QAdrop.click();
			
			Thread.sleep(300);
			
			Select QAselectdrop = new Select (driver.findElement(By.xpath("(//div[contains(@class,'position-relative w-100')]//ul)[3]")));
			QAselectdrop.selectByIndex(1);
				
			//Search if needed for particular case you will using the search
			
			driver.findElement(By.id("search")).sendKeys("");
			
			//If needed to remove all values in the filter you have using it.
			
			driver.findElement(By.id("clear")).click();
			
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}	
	}
	
}
