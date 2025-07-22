package mytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Emptyshift extends Mytest {
	
public void shiftconfirmation() throws InterruptedException {
	
		Thread.sleep(300);
	
		driver.findElement(By.id("otherSection")).click();
		
		Thread.sleep(200);
		
		driver.findElement(By.id("shiftConfirmation")).click();
		
		Thread.sleep(500);
		
		WebElement Emptydropdown = driver.findElement(By.id("emptyShiftFacility"));
		Select shift = new Select(Emptydropdown);
		shift.selectByIndex(1);
		
		Thread.sleep(500);
		
		driver.findElement(By.id("emptyShiftClear")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@id='closeModel']/span[1]")).click();
		
	}
}
