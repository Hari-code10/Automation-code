package mytask;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class open extends Mytest {

	public void opened() throws InterruptedException {
		
		Thread.sleep(100);

		driver.manage().window().maximize();
	
		driver.findElement(By.id("inputUsername")).sendKeys("test_cl");

		Thread.sleep(500);

		driver.findElement(By.id("inputPassword")).sendKeys("password" + Keys.ENTER);

		Thread.sleep(1000);

		WebElement Qameasures = driver.findElement(By.xpath("//span[normalize-space(text())='QA Measures']"));

		Qameasures.click();

		System.out.println("The home screen successfully opened");

		Thread.sleep(1000);
		
		driver.findElement(By.id("facilityList")).click();

		Thread.sleep(300);

		WebElement selectfacility = driver.findElement(By.xpath("(//ul[@class='checkbox-dropdown-list']//label)[1]"));

		selectfacility.click();

		WebElement select = driver.findElement(By.xpath("(//button[contains(@class,'btn btn-secondary')])[1]"));

		select.click();

		Thread.sleep(500);

//		System.out.println("Started the case create functionality...");

		}
}
