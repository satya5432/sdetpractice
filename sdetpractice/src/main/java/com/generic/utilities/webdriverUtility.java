package com.generic.utilities;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webdriverUtility {

	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	
	public void waitForPageLoad(WebDriver driver,int sec)
	{
		
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(sec));
	}
	
	
	public void waitUntilElementToBeVisible(WebDriver driver,int sec,WebElement element)
	{
				
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec));
		 wait.until(ExpectedConditions.visibilityOf(element));
		
		
	}
	
	public void waitUntilElementToBeClickable(WebDriver driver,int sec,WebElement element)
	{
				
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec));
		 wait.until(ExpectedConditions.elementToBeClickable(element));
		
		
	}
	
	public void waitUntilToGetTitle(WebDriver driver,int sec,String title)
	{
				
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec));
		 wait.until(ExpectedConditions.titleContains(title));
		
		
	}
	
	
	
	
	
	public Actions performActions(WebDriver driver)
	{
		Actions act=new Actions(driver);
		return act;
	}
	
	
	public void mouseHover(WebDriver driver,WebElement element)
	{
		 performActions(driver).click(element).perform();
		
	}

	public void mouseHoverondob(WebDriver driver,WebElement element,String text1,String text2,String text3)
	{
		 performActions(driver).click(element).sendKeys(text1).sendKeys(text2).sendKeys(text3).perform();
		
	}
	
	
	public void dragAnddrop(WebDriver driver,WebElement src,WebElement dst)
	{
		
		performActions(driver).dragAndDrop(src, dst).perform();
	}
	
	 public void rightClickOnElement(WebDriver driver,WebElement element)
	 {
		 performActions(driver).contextClick(element).perform();
	   }
	
		 
	public void dropDownHandling(WebElement element,String text)
	{
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	
	public void enterkeys(WebDriver driver)
	{
		 performActions(driver).sendKeys(Keys.ENTER).perform();
	}
	
	
	public void switchToWindow(WebDriver driver,String expwind)
	{
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		while(it.hasNext())
		{
			String win=it.next();
			String currentTitle=driver.switchTo().window(win).getTitle();
			
			if(currentTitle.contains(expwind)) 
			{
				break;
			}
		}
	}
	
	public Robot robotObj() throws AWTException
	{
		Robot rb = new Robot();
		return rb;
	}
	
	public void enterKeyPress(WebDriver driver) throws Throwable 
	{
		robotObj().keyPress(KeyEvent.VK_ENTER);
	}
	
	
	public void enterKeyRelease(WebDriver driver) throws Throwable 
	{
		robotObj().keyRelease(KeyEvent.VK_ENTER);
	}
	
	
	public void switchToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	
	public void switchToFrame(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void canceltAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	public String getappnofromtextAlert(WebDriver driver) {
		String data = driver.switchTo().alert().getText();
		String appno="";
		for(int i=0;i<data.length();i++) {
			if(Character.isDigit(data.charAt(i))) {
				appno=appno+data.charAt(i);
				
			}
		
		}
		return appno;
		
	}
	public String gettexttAlert(WebDriver driver) {
		String text = driver.switchTo().alert().getText();
		return text;
	}
	public static String getscreenshot(WebDriver driver,String screenshotname) throws Throwable {
		Javautility jutil = new Javautility();
		TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		String path="./Screenshot/"+screenshotname+" "+jutil.getsystemdateinFormat()+".png";
		File dest = new File(path);
		String srcpath = dest.getAbsolutePath();
		FileUtils.copyFile(src, dest);
		return srcpath;
	}
	public void scrollBarAction(WebDriver driver)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
	
	jse.executeScript("window.scrollBy(0,800)", "");
	
	}
	
	public void scrollAction(WebDriver driver,WebElement element)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		int y=element.getLocation().getY();
	
	jse.executeScript("window.scrollBy(0,"+y+")",element);
	
	}
	public void scrolldowntillbuttom(WebDriver driver) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	public void scrolltillelementisvisible(WebDriver driver,WebElement element) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView()",element);
}
	public void clickonelement(WebDriver driver,WebElement element) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()",element);
}
	public void jseUsingsendkey(WebDriver driver,WebElement element,String expdata) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value=arguments[1]", element, expdata);
}
	public void scrollUpTillElementToBeVisisble(WebDriver driver,WebElement element) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Point loc = element.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		jse.executeScript("window.scrollBy("+x+","+y+")");
}
	
	
	}
