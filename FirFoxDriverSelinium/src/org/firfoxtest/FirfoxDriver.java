package org.firfoxtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirfoxDriver {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\eclipse-workspace\\FirFoxDriverSelinium\\Firefoxdriver\\geckodriver.exe");
		WebDriver fire = new FirefoxDriver();
		fire.get(" http://www.Alrighttechnologys.com/");
		fire.navigate().to("https://www.facebook.com/");
		fire.navigate().to(" https://www.amazon.in");
		fire.navigate().to("http://www.Alrighttechnologys.com/selenium-course-content.html");
		fire.quit();
	}

}
