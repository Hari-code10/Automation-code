package mytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Peelofforder extends Mytest {
	
	public void order() throws InterruptedException {
		
		Thread.sleep(300);
		
		driver.findElement(By.id("otherSection")).click();
		
		Thread.sleep(300);
		
		driver.findElement(By.id("todayGoHomeListLink")).click();
		
		try {
			
			WebElement peeldropdown = driver.findElement(By.id("facilitySearch"));
			//peeldropdown.click();
			Select orderdrop = new Select(peeldropdown);
			orderdrop.selectByIndex(3);
			
			Thread.sleep(300);
			
			//driver.findElement(By.id("searchDate")).sendKeys("14-07-2025");
			
			//Thread.sleep(300);
			
			driver.findElement(By.id("submitDate")).click();
			
			Thread.sleep(300);
			
			driver.findElement(By.xpath("//a[@class='back-button']//button[1]")).click();
			
			
		}
		catch(Exception e) {
			 
			System.out.println(e.getMessage());
		}
		
		
		
		
	}

}
