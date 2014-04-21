package org.openqa.selenium.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverTest {
	@SuppressWarnings("unused")
	public static void main(String args[]) throws Exception{
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("http://www.google.com");
		
		System.out.println("Page title is: " + driver.getTitle());
	}
}
