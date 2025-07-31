package mytask;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class createcase extends Mytest {

    @SuppressWarnings("deprecation")
    
	public void cases() throws InterruptedException {

        try {
        	
            Thread.sleep(1000);

            WebElement fn = driver.findElement(By.id("notObFirstName"));
            fn.sendKeys("Hari");

            driver.findElement(By.id("notObLastName")).sendKeys("test");

            WebElement Drop = driver.findElement(By.id("notObGender"));
            Select dp = new Select(Drop);
            dp.selectByIndex(2);

            WebElement Procedure = driver.findElement(By.id("notObProcedureLocationAddField"));
            Select location = new Select(Procedure);
            location.selectByIndex(3);

            WebElement Out = driver.findElement(By.id("notObOption"));

            Thread.sleep(1000); 

            if (Out.isDisplayed()) {
                Select Outt = new Select(Out);
                Outt.selectByIndex(1);

                WebElement Yess = driver.findElement(By.id("notObService"));
                Select Yes = new Select(Yess);
                Yes.selectByIndex(2);
            }

            if (Out.isDisplayed()) {
                Select Outt1 = new Select(Out);
                Outt1.selectByIndex(2);

                Thread.sleep(1000);
                
                WebElement Noo = driver.findElement(By.id("notObSite"));
                Select No = new Select(Noo);
                No.selectByIndex(3);

                Thread.sleep(300);

                WebElement dobInput = driver.findElement(By.id("notObDob"));
                
                try {
                	LocalDate today = LocalDate.now();
                	String todayDateStr = today.format(DateTimeFormatter.ofPattern("09-06-2025"));
                	System.out.println("Today's date is: " + todayDateStr);

                	dobInput.sendKeys(todayDateStr);

                	Thread.sleep(500);
                	
                	String enteredValue = dobInput.getAttribute("value");
                	System.out.println("Entered value is: " + enteredValue);

                	if(todayDateStr.equals(enteredValue)) {
                		
                		JOptionPane.showInternalMessageDialog(null, "Please select the valid date of birth");
                	}
                	else {
                		
                		//driver.findElement(By.id("notObActionButton")).click();
                		
                		driver.findElement(By.id("(//button[@type='button']/following-sibling::button)[3]")).click();
                	}
                    
                } catch (Exception e) {
                	
                    System.out.println(e.getMessage());
                }
            }

        } catch (Exception e) {
        	
            System.out.println("The drop value not displayed........." + e.getMessage());
        }
    }
}
