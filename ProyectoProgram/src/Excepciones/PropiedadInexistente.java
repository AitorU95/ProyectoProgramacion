package Excepciones;

/**
 * clase que contiene la excepcion de tipo RunTimeException cuando se intenta obtener una propiedad de un objeto que no existe
 * @author Industria 4.0
 *
 */

public class PropiedadInexistente extends RuntimeException {
	
	
	private static final long serialVersionUID = 1L;
	private final String Mensaje = "La propiedad no existe";
	public String getMessage() {
		
		return Mensaje;
	}

	public String toString() {
		
		return Mensaje;
	}

}
