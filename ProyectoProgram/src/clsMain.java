import Excepciones.clsMatriculaIncorrecta;
import Excepciones.clsPlazaOcupada;
import LP.clsMenu;

/**
 * Clase main que ejecuta el programa
 *
 */

public class clsMain
{
	
	public static void main(String[] args) throws clsPlazaOcupada, clsMatriculaIncorrecta
	{
		
		/**
		 * Llamada a la clase del menu
		 */
		
		clsMenu.MenuPrincipal();
		
		
		System.out.println("Fin del programa");
		
		
	}

}
