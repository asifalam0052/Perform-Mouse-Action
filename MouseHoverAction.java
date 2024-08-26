package Dummy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		WebElement button = driver.findElement(By.xpath("//li[@class='vl-flyout-nav__js-tab']//a[contains(text(),'Electronics')]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(button).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Smartphones and accessories']")).click();
	}

}
