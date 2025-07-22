package mytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Gasshift extends Mytest {
	
	public void Gas() throws InterruptedException {
		
		Thread.sleep(300);
		
		driver.findElement(By.id("otherSection")).click();
		
		Thread.sleep(200);
		
		driver.findElement(By.id("GasShifts")).click();
		
		Thread.sleep(300);
		
		driver.findElement(By.id("fromShift")).sendKeys("14-07-2025");
		
		Thread.sleep(200);
		
		driver.findElement(By.id("toShift")).sendKeys("15-07-2025");
		
		WebElement gasdropdown = driver.findElement(By.id("facilities"));
		Select facilitygas = new Select(gasdropdown);
		facilitygas.selectByIndex(1);
		
		Thread.sleep(300);
		
		WebElement Shiftgas = driver.findElement(By.id("shifts"));
		Select gasshift = new Select(Shiftgas);
		gasshift.selectByIndex(1);
		
		Thread.sleep(400);
		
		driver.findElement(By.xpath("//div[@id='mySchedule']/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
	}


}
