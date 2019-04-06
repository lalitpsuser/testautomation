package Programming;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CaptureScreenShotsOnError {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\Browsers\\geckodriver.exe");
		
		WebDriver dr = new FirefoxDriver();
		dr.get("http://the-internet.herokuapp.com/upload");		
//		
		//maximize the browser window
		//dr.manage().window().maximize();
		
		//Wait for the Upload button extst(explicit Wait)
		WebDriverWait wt = new WebDriverWait(dr,10);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("file-submit")));
		//Code to take the screen shots
		File src= ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\temp\\sshot-lalit.jpg"));
	}

}
