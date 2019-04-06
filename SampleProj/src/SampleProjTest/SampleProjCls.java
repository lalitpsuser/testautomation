package SampleProjTest;

import java.awt.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleProjCls {

	public static void main(String[] args) throws InterruptedException {
			//Scenario: Logoin to App and provide FROM and TO COUNTRY
		
		//%%%%%%%%%%%%%% Inheritence Implementation ########################################################
		
		
		
		   //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%  Login to application and select dropdowns %%%%%%%%%%%%%%%%%%%%%%%%
		
		//STEP 1:
		
			System.setProperty("webdriver.gecko.driver","C:\\Selenium\\Browsers\\geckodriver.exe");
			
			WebDriver driver = new FirefoxDriver();
			//driver.get("http://www.newtours.demoaut.com/");
			//driver.quit();
			driver.navigate().to("http://blazedemo.com/");
			//driver.get("http://www.newtours.demoaut.com/");
			//driver.get("http://www.newtours.demoaut.com/");
			
			System.out.println("Brwoser title: = "+driver.getTitle());
			
			//Maximize the window
			driver.manage().window().maximize();
			
			//%%%%%%%%%%%%%%%%%%%% Wait for some time(IMPLICIT) %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
			// It is for complete Driver but not specfic to condition. For all the objects in the page
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
			
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			
			//%%%%%%%%%%%%%%%%%%%%  Wait for some time(EXPLICIT) - wait for the element to be visible with condition %%%%%%%%%%%%%%%%%%%% 
			// It is for ojject wise used and for certain conditions like object visible object enabled etc
			WebDriverWait wt =  new WebDriverWait(driver,20);
			WebElement Ele = wt.until(ExpectedConditions.visibilityOfElementLocated(By.name("fromPort")));
			
			Select fromFlight = new Select(Ele);
			fromFlight.selectByVisibleText("Boston");
			
			//%%%%%%%%%%%%%%%%%%%%  Wait for some time(FLUENT) - wait for the element to be visiblewith condition and frequency  %%%%%%%%%%%%%%%%%%%% 
										
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
			.withTimeout(30, TimeUnit.SECONDS) 			
			.pollingEvery(5, TimeUnit.SECONDS) 			
			.ignoring(NoSuchElementException.class);	
								
			//%%%%%%%%%%%%%%%%%%%% Count the number of Web tables in a page %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
			/*driver.navigate().to("http://www.newtours.demoaut.com/");
			
			System.out.println(driver.findElements(By.tagName("table")).size());
			
			int tableCount =  driver.findElements(By.tagName("table")).size();
			
			WebElement we;
						
			for (int i=1;i <tableCount;i++ ) {
				
				we =  driver.findElements(By.tagName("table")).get(i);
				JavascriptExecutor js = (JavascriptExecutor)driver;
				
				System.out.println("table: - "+i);
				Thread.sleep(2000);
				js.executeScript("arguments[0].style.border='3px solid green'", we);
				//js.executeScript("arguments[0].style.border=''",we, "");
				
//				 for (int i = 0; i < 2; i++) {
//				        JavascriptExecutor js = (JavascriptExecutor) driver;        
//				        js.executeScript("arguments[0].style.border='3px solid red'", we);
//			            //Thread.sleep(1000);
//			            js.executeScript("arguments[0].style.border=''",we, "");
//			            //Thread.sleep(1000);
//				    }
//				
			}*/
			//------------------------------------------------------------------------------
	}

}
