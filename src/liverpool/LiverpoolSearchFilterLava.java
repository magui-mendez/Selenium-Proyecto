package liverpool;

public class LiverpoolSearchFilterLava extends ParentTest{
	
	

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

	

}
