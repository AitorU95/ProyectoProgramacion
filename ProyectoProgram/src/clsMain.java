import Excepciones.clsMatriculaIncorrecta;
import Excepciones.clsMatriculaVehiculoRepetida;
import Excepciones.clsPlazaOcupada;
import LP.JFrameMenu;

/**
 * Clase main que ejecuta el programa
 *
 */

public class clsMain
{
	
	public static void main(String[] args) throws clsPlazaOcupada, clsMatriculaIncorrecta, clsMatriculaVehiculoRepetida
	{
		
		/**
		 * Llamada a la clase del menu
		 */
		
		//clsMenu.MenuPrincipal();
		
		//system.out.println("Fin del programa");
		
		JFrameMenu b = new JFrameMenu();
		
		b.setVisible(true);
		
		
		
		
		
	}

}
