package mytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Batch$quality extends Mytest {
	
	
	public void batchqualitycasee() throws InterruptedException {
		
		WebElement OR = driver.findElement(By.id("orProvider"));
		
		
		if(OR.isSelected()) {
			
			driver.findElement(By.id("otherSection")).click();
			
			Thread.sleep(200);
			
			driver.findElement(By.id("batchQuality")).click();
			
			Thread.sleep(500);
			
			WebElement Batchdropdown = driver.findElement(By.id("batchProcedureLocation"));
			Select quality = new Select(Batchdropdown);
			quality.selectByIndex(1);
			
			Thread.sleep(100);
			
			driver.findElement(By.id("submitJustify1")).click();
			
			Thread.sleep(200);
			
			driver.findElement(By.id("multipleSelectedCasesButton")).click();
			
			Thread.sleep(200);
			
			driver.findElement(By.xpath("//h5[text()='Batch Quality']/following-sibling::button")).click();
				
		}
	}
}
