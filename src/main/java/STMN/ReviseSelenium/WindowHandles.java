package STMN.ReviseSelenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class WindowHandles {

	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();
		co.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		driver.findElement(By.id("opentab")).click();
//		
//		
//		
//		Set<String> windows = driver.getWindowHandles();
//		
//		Iterator<String> it = windows.iterator();
//		
//		String parentWindow = it.next();
//		
//		String childWIndow = it.next();
//		
//		driver.switchTo().window(childWIndow);
//		
//		String childText = driver.findElement(By.className("float-left")).getText();
//		System.out.println(childText);
//		driver.switchTo().window(parentWindow);
////		driver.switchTo().frame(0);
//		
////		driver.switchTo().frame("courses-iframe");
//		
//		driver.switchTo().frame(driver.findElement(By.id("courses-iframe")));
//		String mail = driver.findElement(By.xpath("//ul[@class='clearfix']/li")).getText();
//		System.out.println(mail);
//		
//		driver.switchTo().defaultContent();
		
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		
//		jse.executeScript("window.scrollBy(0,1000)");
//		
//		WebElement el = driver.findElement(By.className("switch-tab"));
//		RelativeLocator rel = new RelativeLocator();
//		String text = driver.findElement(rel.with(By.id("opentab")).below(el)).getText();
//		
//		System.out.println(text);
//		
//		WebElement window = driver.findElement(By.id("openwindow"));
//		RelativeLocator rel = new RelativeLocator();
//		String windText = driver.findElement(rel.with(By.tagName("legend")).above(window)).getText();
//		System.out.println(windText);
//		
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		
		WebElement openWindow = driver.findElement(By.id("openwindow"));
//		File src = openWindow.getScreenshotAs(OutputType.FILE);
		
//		FileUtils.copyFile(src, new File("F:\\Sofi Learning\\Sarmas.png"));
		
		int hight = openWindow.getRect().getDimension().getHeight();
		int width = openWindow.getRect().getDimension().getWidth();
		
		System.out.println(hight+", "+ width);
	}

}
