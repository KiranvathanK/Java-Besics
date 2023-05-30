package org.book;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BookStore {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\BookStore\\src\\main\\resources\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bookswagon.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='New Arrivals']")).click();
		
		driver.findElement(By.id("ddlSort")).click();
		
		
		
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Best sellers']")).click();
		
		WebElement findElement = driver.findElement(By.id("ddlSort"));
		Select choose = new Select(findElement);
		choose.selectByIndex(3);
//		choose.selectByValue("Product_discount desc");
//		choose.selectByVisibleText("Price - High to Low");
//		choose.getOptions();
//		choose.getFirstSelectedOption();
//		choose.getAllSelectedOptions();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Request a Book']")).click();
		driver.findElement(By.id("ctl00_phBody_RequestBook_txtISBN")).sendKeys("9798212182805");
		driver.findElement(By.name("ctl00$phBody$RequestBook$txtAuthor")).sendKeys("Jeneva Rose");
		driver.findElement(By.name("ctl00$phBody$RequestBook$txtEmailReq")).sendKeys("user@outlook.com");
		driver.findElement(By.xpath("//input[@name='ctl00$phBody$RequestBook$txtTitle']")).sendKeys("You Shouldn't Have Come Here");
		driver.findElement(By.xpath("//input[@name='ctl00$phBody$RequestBook$txtQty']")).clear();
		driver.findElement(By.xpath("//input[@name='ctl00$phBody$RequestBook$txtQty']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='ctl00$phBody$RequestBook$txtPhone']")).sendKeys("9876543210");
		
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Award Winners']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		a.click().perform();
		
		driver.findElement(By.xpath("//img[@alt='Fault in Our Stars']")).click();
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		driver.findElement(By.id("inputbar")).sendKeys("Peace with Buddha");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
