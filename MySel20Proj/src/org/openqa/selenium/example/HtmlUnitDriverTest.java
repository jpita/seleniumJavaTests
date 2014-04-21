package org.openqa.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;

public class HtmlUnitDriverTest {
	public static void main(String args[]) throws Exception{
		try {


			//HtmlUnitDriver will not have a UI to interact with,
			//its purely html and javascript
			WebDriver driver = new HtmlUnitDriver();

			driver.get("http://www.google.com");

			System.out.println("Page title is: " + driver.getTitle());
			//element with the name "q" is the search input on "google.com"
			WebElement element = driver.findElement(By.name("q"));

			//search "marshmalows" & redirects to the search results 
			element.sendKeys("marshmalows", Keys.ENTER);

			System.out.println("Page title is: " + driver.getTitle());
			//we need to search for the "same" element "q" because the page changes, so, it's not the "same" element.
			element = driver.findElement(By.name("q"));

			//"clear" clears the text inserted on the search input
			element.clear();

			element.sendKeys("it's another thing", Keys.ENTER);

			System.out.println("Page title is: " + driver.getTitle());

			//assertEquals("it's another thing - Pesquisa do Google", driver.getTitle());
			Assert.assertEquals("it's another thing - Pesquisa do Google", driver.getTitle());
			
		} catch (AssertionError ex) {
			System.out.println("ERROR");
		}
	}
}
