package mytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class toggle extends Mytest{
	
	public void enable() throws InterruptedException {
		
		WebElement OR = driver.findElement(By.id("orProvider"));
		
		WebElement Ob = driver.findElement(By.id("obProvider"));
	
		if(OR.isSelected()) {
			
		driver.findElement(By.id("otherSection")).click();
		
		Thread.sleep(200);
		
		driver.findElement(By.id("addCaseValue")).click();
		
		}
		
		else
			if(Ob.isSelected()){
			
			driver.findElement(By.id("otherSection")).click();
			
			Thread.sleep(200);
			
			driver.findElement(By.id("addCaseValue")).click();
			
		}
			else {
				System.out.println("No Site's are found......");
			}		
		}	
	}




