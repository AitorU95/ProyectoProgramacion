package Excepciones;

/**
 * excepcion que se muestra en el frame cuando no hay ningun vehiculo en el arraylist
 * @author Industria 4.0
 *
 */

public class clsListaVacia extends Exception{

	
	private static final long serialVersionUID = 1L;

	private final String MENSAJE = "La lista de vehiculos se encuentra vacía, por favor, introduce un libro";	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return MENSAJE;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return MENSAJE;
	}

}
