package iExplorer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IExplorer {
	public static void main(String args[]) {
		try {
	
	        System.setProperty("webdriver.ie.driver", "C:\\selenium\\iedriver\\IEDriverServer.exe");
	        
	        DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
	        ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	        WebDriver driver = new InternetExplorerDriver(ieCapabilities);

	        driver.get("http://www.google.com");
	        WebElement pesquisa = driver.findElement(By.name("q"));
	        pesquisa.click();
	        pesquisa.sendKeys("olarilolelas");
	        pesquisa.submit();
	        
	    } catch (Exception e) {
	
	        e.printStackTrace();
	    }
	}
}
