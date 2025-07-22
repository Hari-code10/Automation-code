package mytask;

import org.openqa.selenium.By;

public class Gascalendar extends Mytest {
	
	private String calendars;

	public void calendar() throws InterruptedException {
		
		
		Thread.sleep(300);
		
		driver.findElement(By.id("otherSection")).click();
		
		Thread.sleep(300);
		
		driver.findElement(By.id("addShiftLink")).click();
		
		Thread.sleep(300);
		
//		driver.findElement(By.xpath("(//div[contains(@class,'col-2 col-sm-3')]//button)[2]")).click();
//		
//		Thread.sleep(300);
		
		//Next and previous month view 
		
		driver.findElement(By.id("nextBtn")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("prevBtn")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("monthViewBtn")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("weekViewBtn")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("dayViewBtn")).click();
				
	}

}
