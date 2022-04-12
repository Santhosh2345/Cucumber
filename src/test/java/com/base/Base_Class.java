package com.base;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base_Class {
	static WebDriver driver;

	public static void base() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\P.Santhosh Kumar\\eclipse-workspace\\Sun\\Chrome1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public static void url(String url) {

		driver.get(url);

	}
	public static WebElement xpath(String value) {
		driver.findElement(By.xpath(value));
		return (WebElement)driver;

	}
	
	public static WebElement find_by(By by) {
		return driver.findElement(by);
		

	}

	public static WebElement button(By by) {
		return driver.findElement(by);

	}

	public static WebDriver screen(String path) throws IOException {
		TakesScreenshot s = (TakesScreenshot) driver;
		File src = s.getScreenshotAs(OutputType.FILE);
		File dr = new File(path);
		FileUtils.copyFile(src, dr);
		return driver;

	}

	public static Actions act(WebElement a) {
		Actions act = new Actions(driver);
		act.moveToElement(a);
		return act;
	}

	public static void mouseMove() throws AWTException {
		Robot robo = new Robot();
		robo.mouseMove(400, 400);

	}

	public static void bot(int down) throws AWTException {
		Robot robo = new Robot();
		// robo.keyPress(down);
		if (down == down) {
			for (int i = 0; i < 1; i++) {

				robo.keyPress(KeyEvent.VK_DOWN);
				robo.keyRelease(KeyEvent.VK_DOWN);

			}
			robo.keyPress(KeyEvent.VK_ENTER);
			robo.keyRelease(KeyEvent.VK_ENTER);

		}

	}

	public static void scroll(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);

	}

	public static void scrollx() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(200,0)");

	}

	public static void scrolly() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)");

	}

	public static void scrollxy() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(400,400");

	}

	public static void window() {
		Set<String> wh = driver.getWindowHandles();
		ArrayList<String> arr = new ArrayList<>(wh);
		int size = arr.size();
		System.out.println();
	}

	public static void quit() {
		driver.quit();

	}

	public static void back() {
		driver.navigate().back();
	}

	public static void refresh() {
		driver.navigate().refresh();

	}

	public static Object navi(String url) {
		base();
		driver.navigate().to(url);
		return url;
	}

	public static void impli() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

}
