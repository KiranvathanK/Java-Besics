package org.project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeWebsite {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\OrangeProjrct\\src\\main\\resources\\Driver\\chromedriver.exe");
		WebDriver site = new ChromeDriver();
		site.get("https://www.linkedin.com/checkpoint/lg/sign-in-another-account");
		site.manage().window().maximize();
		site.findElement(By.xpath("//input[@id='username']")).sendKeys("RagnerRay@outlook.com");
		site.findElement(By.xpath("//input[@id='password']")).sendKeys("9738879904@Dali");
		site.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
	
		
		WebElement f1 = site.findElement(By.xpath("//button[@class='global-nav__primary-link global-nav__primary-link-me-menu-trigger artdeco-dropdown__trigger artdeco-dropdown__trigger--placement-bottom ember-view']"));
		
		
		
		Actions a = new Actions(site);
		Thread.sleep(2000);
		a.moveToElement(f1).perform();
		Thread.sleep(2000);
		a.doubleClick().perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		site.findElement(By.xpath("//button[@aria-label='Edit intro']")).click();
		

		
		
		
		
		
		
//		site.get("https://admin-demo.nopcommerce.com/admin/");
//		site.manage().window().maximize();
//		site.findElement(By.xpath("//input[@id='Email']")).clear();
//		site.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");
//		site.findElement(By.xpath("//input[@id='Password']")).clear();
//		site.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin");
//		WebElement checkbox = site.findElement(By.xpath("//label[text()='Remember me?']"));
//		checkbox.click();
//		site.findElement(By.xpath("//button[text()='Log in']")).click();
//		Thread.sleep(2000);
//		
//		site.findElement(By.xpath("//p[text()=' Dashboard']")).click();
//		site.findElement(By.xpath("//button[@class='btn btn-tool']")).click();
//		
//		site.findElement(By.xpath("//a[@class='nav-link active']")).click();
//		site.findElement(By.xpath("//i[@class='nav-icon fas fa-book']/following-sibling::p")).click();
//		
////		//i[@class='nav-icon fas fa-book']/following-sibling::p
//		Thread.sleep(1000);
//		site.findElement(By.xpath("//a[@class=\"nav-link active\"]")).click();
//		
		
		
//		site.findElement(By.xpath("//input[@class='form-control admin-search-box typeahead tt-input']")).sendKeys("customer");
//		
//		
//		Robot choose = new Robot();
//		choose.keyPress(KeyEvent.VK_DOWN);
//		choose.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		
//		choose.keyPress(KeyEvent.VK_DOWN);
//		choose.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		
//		choose.keyPress(KeyEvent.VK_DOWN);
//		choose.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		
//		choose.keyPress(KeyEvent.VK_DOWN);
//		choose.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		
//		choose.keyPress(KeyEvent.VK_DOWN);
//		choose.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		
//		choose.keyPress(KeyEvent.VK_DOWN);
//		choose.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		
//		choose.keyPress(KeyEvent.VK_ENTER);
//		choose.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
