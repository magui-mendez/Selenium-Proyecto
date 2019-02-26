package liverpool;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ParentTest {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public static void onclick(String onclick) {
		WebElement SearchBox = driver.findElement(By.id("buscador"));
				
		SearchBox.sendKeys("Lavasecadora LG");
		SearchBox.sendKeys(Keys.ENTER);
		//SearchBox.click();
	}

	public static void navigateTo(String url) {
		
		driver =new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 15);
		driver.get("https://www.liverpool.com.mx");
		
	}

	public static void searchArticule(String articuleName) {
		//WebElement searchButton = driver.findElement(By.xpath("*[@id=\"buscar\"]/form/input[2]"));
		//searchButton.click();
			
		
	}

	public static void selectArticule(String selectArticule) {
			
		driver.findElement(By.xpath("//span[contains(.,'Lavasecadora LG 18 kg blanca WD18WN6')]")).click();
		
			
	}

	public static void selectStar(String string) throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='star']//*[contains(@class, 'TTrating-5-0')]")).click();
		Thread.sleep(4000);		
		
	}

	public static void closeBrowser() {
			driver.close();
		
	}

}
