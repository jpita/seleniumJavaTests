package org.openqa.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class GoogleSuggest {
	public static void main(String[] args) throws Exception{
		//the FF driver supports javascript
		WebDriver driver = new FirefoxDriver();
		
		//go to the google suggest home page
		driver.get("http://www.google.com/webhp?complete=1&hl=en");
		
		//Enter the query string "Cheese"
		WebElement query = driver.findElement(By.name("q"));
		query.sendKeys("Cheese");
		
		//sleep until the div we want is visible or 5 seconds is over
		long end = System.currentTimeMillis()+5000;
		while (System.currentTimeMillis()<end) {
			WebElement resultsDiv = driver.findElement(By.className("gssb_e"));
			
            // If results have been returned, the results are displayed in a drop down.
			if(resultsDiv.isDisplayed()){
				break;
			}
		}
		
        // And now list the suggestions
        List<WebElement> allSuggestions = driver.findElements(By.xpath("//td[@class='gssb_a gbqfsf']"));
		
        for (WebElement sugestion : allSuggestions) {
			System.out.println(sugestion.getText());
		}
        
        //driver.quit();
	}

}
