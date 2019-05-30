package Excepciones;

/**
 * clase que contiene la excepcion de cuando no se inserta una matricula con 7 caracteres
 * @author Industria 4.0
 *
 */

public class clsMatriculaIncorrecta extends Exception{
	

	private static final long serialVersionUID = 1L;
	
	private final String MENSAJE = "La matrícula no es correcta, debe tener 7 caracteres";	
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
