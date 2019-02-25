package liverpool;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LiverpoolSearchFilterLava {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		// Abrir el navegador en la pagina de liverpool
		navigateTo("https://www.liverpool.com.mx");
		
		//Para dar clic a la busqueda
		onclick(" ");
		
		// Buscar en el buscador de la pagina "lavasecadora LG"
		searchArticule("lavasecadora LG");
		
		// Seleccionar el texto Lavasecadora LG 18 kg blanca WD18WN6 de los resultados
		selectArticule ("Lavasecadora LG 18 kg blanca WD18WN6");
				
		// Leer las Opiniones del producto
		
		selectStar ("Leer 2 opiniones");
		
		//Cerrar el navegador
		
		closeBrowser ();
	}

	private static void onclick(String onclick) {
		WebElement SearchBox = driver.findElement(By.id("buscador"));
				
		SearchBox.sendKeys("Lavasecadora LG");
		SearchBox.sendKeys(Keys.ENTER);
		//SearchBox.click();
	}

	private static void navigateTo(String url) {
		
		driver =new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.liverpool.com.mx");
		
	}

	private static void searchArticule(String articuleName) {
		//WebElement searchButton = driver.findElement(By.xpath("*[@id=\"buscar\"]/form/input[2]"));
		//searchButton.click();
			
		
	}

	private static void selectArticule(String selectArticule) {
			
		driver.findElement(By.xpath("//span[contains(.,'Lavasecadora LG 18 kg blanca WD18WN6')]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			
	}

	private static void selectStar(String string) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"star\"]/span/div/div[2]/a[1]")).click();
		Thread.sleep(3000);		
		
	}

	private static void closeBrowser() {
			driver.close();
		
	}

}
