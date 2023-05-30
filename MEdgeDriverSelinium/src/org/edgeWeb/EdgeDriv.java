package org.edgeWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class EdgeDriv {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\user\\eclipse-workspace\\MEdgeDriverSelinium\\EdgeDriver\\IEDriverServer.exe");
		WebDriver ie = new InternetExplorerDriver();
		ie.get("http://www.google.com");
		ie.navigate().to("http://www.Alrighttechnologys.com/");
		ie.navigate().to("http://demoqa.com/registration/");
		ie.navigate().to(" http://www.Alrighttechnologys.com/selenium-course-content.html");
		
}

}
