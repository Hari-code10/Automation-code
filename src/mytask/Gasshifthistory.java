package mytask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Gasshifthistory extends Mytest {
	
	public void shifthistory() throws InterruptedException {
		
		Thread.sleep(300);
		
		driver.findElement(By.id("otherSection")).click();
		
		Thread.sleep(200);
		
		driver.findElement(By.id("GasHistory")).click();
		
		Thread.sleep(200);
		
//		WebElement tab = driver.findElement(By.xpath("//ul[contains(@class,'nav nav-tabs')]//li[1]"));
//		Select tabname = new Select(tab);
//		tabname.selectByIndex(3);
		
		try {
			
			List<WebElement> tabLinks = driver.findElements(By.cssSelector("ul.nav-tabs li a"));

	        for (WebElement tab : tabLinks) {
	            String tabName = tab.getText().trim();

	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tab);

	            tab.click();

	            try { Thread.sleep(1000); } catch (InterruptedException e) {}

	            WebElement contentSection = driver.findElement(By.cssSelector("div.tab-content")); 
	            if (contentSection.getText().contains("No cases found")) {
	                System.out.println("❌ No cases in tab: " + tabName);
	            } else {
	                System.out.println("✅ Cases found in tab: " + tabName);
	                System.out.println("Content:\n" + contentSection.getText());
	            }
	        }
	        driver.quit();
		}
		catch(Exception e ) {
			
			System.out.println(e.getMessage());
		}
		Thread.sleep(400);
		
		driver.findElement(By.xpath("//a[@class='back-button']//button[1]")).click();	
	}
}
